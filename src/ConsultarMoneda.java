import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import java.util.Map;

public class ConsultarMoneda {

    // Devuelve la tasa de conversión entre monedaBase y monedaDestino
    public double filtrarMonedas(String monedaBase, String monedaDestino) {
        String apiKey = "5de178a61d6d82020cac0654";  // Reemplazar con tu API key válida
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaBase);

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest peticion = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            String respuestaJson = respuesta.body();

            // Convertir JSON a objeto RespuestaMoneda
            Gson gson = new Gson();
            RespuestaMoneda respuestaMoneda = gson.fromJson(respuestaJson, RespuestaMoneda.class);

            // Obtener las tasas de cambio de las monedas
            Map<String, Double> conversionRates = respuestaMoneda.getConversionRates();

            // Verificar si la moneda destino está en la respuesta
            if (conversionRates.containsKey(monedaDestino)) {
                return conversionRates.get(monedaDestino);
            } else {
                System.out.println("Error: No se encontró la tasa de cambio para " + monedaDestino);
                throw new RuntimeException("Moneda destino no disponible en las tasas de cambio.");
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
            throw new RuntimeException("Error al consultar la tasa de cambio", e);
        }
    }
}

