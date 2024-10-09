import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaDestino,
                                 ConsultarMoneda consultarMoneda, Scanner lectura) {
        try {
            System.out.println("Ingrese la cantidad de " + monedaBase + " que desea convertir a " + monedaDestino + ":");
            double cantidad = lectura.nextDouble(); // Lee la cantidad de moneda a convertir

            // Llamada a la API para obtener la tasa de conversión entre monedaBase y monedaDestino
            double tasaConversion = consultarMoneda.filtrarMonedas(monedaBase, monedaDestino);

            // Verifica si la tasa de conversión es válida
            if (tasaConversion <= 0) {
                System.out.println("Error: No se pudo obtener una tasa de conversión válida.");
                return;
            }

            // Realiza la conversión
            double cantidadConvertida = cantidad * tasaConversion;
            System.out.println(cantidad + " " + monedaBase + " equivalen a " + cantidadConvertida + " " + monedaDestino);

        } catch (Exception e) {
            System.out.println("Error: Entrada inválida o problema al realizar la conversión. Inténtalo de nuevo.");
            lectura.nextLine(); // Limpiar la entrada en caso de error
        }
    }
}

