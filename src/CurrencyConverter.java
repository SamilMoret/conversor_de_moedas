import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        try {
            ExchangeRateService exchangeRateService = new ExchangeRateService("11e18411e955f504e7911fd8");
            String jsonResponse = exchangeRateService.getRates();
            Map<String, Double> rates = exchangeRateService.parseRates(jsonResponse);
            if (rates == null) {
                System.out.println("Failed to retrieve exchange rates. Exiting...");
                return;
            }
            Map<String, Double> filteredRates = CurrencyFilter.filterCurrencies(rates);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha a moeda de origem:");
            int index = 1;
            for (String currency : filteredRates.keySet()) {
                System.out.println(index + ". " + currency);
                index++;
            }

            int fromIndex = scanner.nextInt();
            String fromCurrency = filteredRates.keySet().toArray(new String[0])[fromIndex - 1];

            System.out.println("Escolha a moeda de destino:");
            index = 1;
            for (String currency : filteredRates.keySet()) {
                System.out.println(index + ". " + currency);
                index++;
            }

            int toIndex = scanner.nextInt();
            String toCurrency = filteredRates.keySet().toArray(new String[0])[toIndex - 1];

            System.out.println("Digite o valor a ser convertido:");
            double amount = scanner.nextDouble();

            double rate = filteredRates.get(toCurrency) / filteredRates.get(fromCurrency);
            double convertedAmount = amount * rate;

            System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
