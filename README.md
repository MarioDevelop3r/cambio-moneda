# Convertidor de Moneda

**Bienvenido(a) al Challenge del Conversor de Monedas.**

## Descripción

En este emocionante desafío de programación, te invitamos a construir tu propio Conversor de Monedas. Aprenderás a realizar solicitudes a una API de tasas de cambio, a manipular datos JSON y, finalmente, a filtrar y mostrar las monedas de interés. ¡Prepárate para una experiencia práctica y emocionante en el desarrollo Java!

Los pasos para completar este desafío se detallarán a continuación y estarán disponibles en la sección adyacente:

- Configuración del Ambiente Java;
- Creación del Proyecto;
- Consumo de la API;
- Análisis de la Respuesta JSON;
- Filtro de Monedas;
- Exhibición de Resultados a los usuarios.

¡Prepárate para sumergirte en una experiencia práctica y emocionante en el desarrollo Java!

## Estructura del Proyecto

El proyecto sigue una estructura sencilla basada en clases de Java para facilitar su mantenimiento y escalabilidad. A continuación, se detallan los principales componentes:

- **`ConsultarMoneda.java`**: Clase que define el método `filtrarMonedas`, encargado de consultar la API para obtener las tasas de cambio de las monedas seleccionadas.
- **`ConvertirMoneda.java`**: Contiene el método `convertir`, que realiza la conversión de una moneda a otra utilizando las tasas obtenidas por `filtrarMonedas`.
- **`Principal.java`**: Es el punto de entrada de la aplicación. Contiene el método `main`, que maneja la lógica del menú e interactúa con el usuario para realizar las conversiones.
- **`Monedas.java`**: Clase que representa las monedas, con atributos y métodos asociados a cada tipo de moneda disponible.
- **`RespuestaMoneda.java`**: Clase utilizada para estructurar la respuesta de la API con las tasas de cambio y cualquier otra información relevante.

## Requisitos Previos

Antes de poder ejecutar el proyecto, asegúrate de tener lo siguiente:

- Java Development Kit (JDK) instalado (versión 8 o superior).
- Un entorno de desarrollo integrado (IDE) compatible con Java, como IntelliJ IDEA o Eclipse.
- Conexión a Internet para obtener las tasas de cambio en tiempo real desde la API.

## Instrucciones para la Instalación

1. **Clonar el repositorio**:
    ```bash
    git clone <https://github.com/MarioDevelop3r/cambio-moneda.git>
    cd <directorio-del-repositorio>
    ```

2. **Abrir el proyecto en IntelliJ IDEA o Eclipse**:
    - Abre tu IDE preferido.
    - En IntelliJ IDEA, selecciona `File > Open` y navega al directorio donde se clonó el proyecto.
    - En Eclipse, selecciona `File > Import > Existing Projects into Workspace`.

3. **Construir el proyecto**:
    - En IntelliJ IDEA, ve a `Build` en el menú superior y selecciona `Build Project`.
    - En Eclipse, selecciona `Project > Build All`.

4. **Ejecutar el proyecto**:
    - En IntelliJ IDEA o Eclipse, navega al archivo `Principal.java`.
    - Haz clic derecho y selecciona `Run 'Principal.main()'` o su equivalente en tu IDE.

## Uso de la Aplicación

1. Ejecuta la aplicación.
2. Sigue las instrucciones en pantalla para seleccionar la moneda de origen y la moneda de destino.
3. Ingresa la cantidad que deseas convertir.
4. La aplicación mostrará la cantidad convertida basada en las últimas tasas de cambio.

## Solución de Problemas

- **Error en la Firma del Método**: Asegúrate de que el método `filtrarMonedas` en `ConsultarMoneda.java` acepte dos argumentos `String`, y que la llamada en `ConvertirMoneda.java` pase estos argumentos correctamente.
- **Problemas de Construcción o Ejecución**: Si encuentras problemas al construir o ejecutar el proyecto, intenta limpiar y recompilar:
    - En IntelliJ IDEA, selecciona `Build > Clean Project`, luego `Build > Rebuild Project`.
    - En Eclipse, selecciona `Project > Clean...`, luego recompila el proyecto.
- **Errores en la Conexión a la API**: Verifica tu conexión a Internet y asegúrate de que la API utilizada para las tasas de cambio esté activa y accesible.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).
