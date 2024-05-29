import java.util.HashMap;
import java.util.Map;

public class CurrencyFilter {
    public static Map<String, Double> filterCurrencies(Map<String, Double> rates) {
        String[] currenciesOfInterest = {"USD", "EUR", "BRL","GBP", "JPY", "CAD", "AUD"};
        Map<String, Double> filteredRates = new HashMap<>();

        for (String currency : currenciesOfInterest) {
            if (rates.containsKey(currency)) {
                filteredRates.put(currency, rates.get(currency));
            }
        }

        return filteredRates;
    }
}

