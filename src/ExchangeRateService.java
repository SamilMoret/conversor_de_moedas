import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class ExchangeRateService {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private String apiKey;

    public ExchangeRateService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getRates() throws Exception {
        String url_str = BASE_URL + apiKey + "/latest/USD";
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        System.out.println("JSON Response: " + jsonobj.toString());
        return jsonobj.toString();
    }

    public Map<String, Double> parseRates(String jsonResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);
        if (jsonObject.has("result") && jsonObject.get("result").getAsString().equals("success")) {
            RatesResponse response = gson.fromJson(jsonResponse, RatesResponse.class);
            return response.conversion_rates;
        } else {
            System.out.println("Failed to parse rates: " + jsonResponse);
            return null;
        }
    }

    private class RatesResponse {
        Map<String, Double> conversion_rates;
    }
}
