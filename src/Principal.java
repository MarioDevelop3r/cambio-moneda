import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consultarMoneda = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 10) {
            System.out.println("************************************");
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("************************************");
            System.out.println("Ingresa la opción que deseas realizar:");
            System.out.println("1. Convertir de Dólares a Pesos argentinos");
            System.out.println("2. Convertir de Pesos argentinos a Dólares");
            System.out.println("3. Convertir de Dólares a Bolivianos");
            System.out.println("4. Convertir de Bolivianos a Dólares");
            System.out.println("5. Convertir de Dólares a Reales brasileños");
            System.out.println("6. Convertir de Reales brasileños a Dólares");
            System.out.println("7. Convertir de Dólares a Pesos chilenos");
            System.out.println("8. Convertir de Pesos chilenos a Dólares");
            System.out.println("9. Convertir de Dólares a Pesos colombianos");
            System.out.println("10. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = lectura.nextInt(); // Captura la opción del usuario
            } catch (Exception e) {
                System.out.println("Por favor, ingresa una opción válida.");
                lectura.next(); // Limpiar la entrada
                continue;
            }

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consultarMoneda, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consultarMoneda, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BOB", consultarMoneda, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BOB", "USD", consultarMoneda, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "BRL", consultarMoneda, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("BRL", "USD", consultarMoneda, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertir("USD", "CLP", consultarMoneda, lectura);
                    break;
                case 8:
                    ConvertirMoneda.convertir("CLP", "USD", consultarMoneda, lectura);
                    break;
                case 9:
                    ConvertirMoneda.convertir("USD", "COP", consultarMoneda, lectura);
                    break;
                case 10:
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor selecciona una opción del menú.");
            }
        }

        lectura.close();
    }
}

