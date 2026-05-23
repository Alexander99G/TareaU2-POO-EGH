# Sistema de Gestión de Contenido Audiovisual (POO)

Este proyecto es una aplicación desarrollada en **Java** que implementa los pilares de la Programación Orientada a Objetos (POO), principios SOLID, y el patrón de diseño MVC para gestionar diferentes tipos de medios digitales mediante la persistencia de datos en archivos CSV.

##  Objetivos y Propósito
El propósito de este proyecto es demostrar el dominio de conceptos avanzados de POO y buenas prácticas de ingeniería de software:
- **Pilares de la POO:** Abstracción, Herencia, Polimorfismo y Encapsulamiento.
- **Clean Code y SOLID:** Mantenibilidad del código, responsabilidades únicas y dependencias claras.
- **Patrón MVC:** Separación de la lógica de negocio (Modelo), la interfaz de consola (Vista) y el manejo de datos (Controlador).
- **Persistencia de Datos:** Lectura y escritura automática del estado del sistema usando archivos `.csv`.
- **Testing:** Aseguramiento de la calidad mediante pruebas unitarias con JUnit 5.

##  Funcionalidades y Estructura de Clases
El sistema cuenta con una jerarquía de clases robusta para organizar el contenido:

* **`ContenidoAudiovisual` (Clase Abstracta):** Define la base común (ID, Título, Duración, Género) y gestiona un contador estático para sincronizar IDs únicos.
* **`Pelicula`:** Extiende el contenido base e incluye dependencias con la clase `Actor` y el atributo `estudio`.
* **`SerieDeTV`:** Gestiona el número de temporadas y se relaciona con la clase `Temporada`.
* **`Documental`:** Introduce el atributo `tema` y se relaciona estrechamente con la clase `Investigador`.
* **`Gameplay`:** Añade el atributo `streamer` adaptando el formato para creadores de contenido de videojuegos.
* **`VideoClipMusical`:** Implementa características propias para la gestión del `cantante`.
* **`GestorArchivosCSV`:** Actúa como el controlador central encargado de leer, instanciar dinámicamente los objetos correctos y guardar la información en formato separado por comas utilizando el método `toCSV()`.

## 🛠️ Instrucciones de Instalación y Uso

### Requisitos
- **JDK 17** o superior.
- **Eclipse IDE** (o cualquier IDE compatible con Java).
- **JUnit 5** (para la ejecución de pruebas).

### Instalación
1. Clonar el repositorio desde tu terminal:
   ```bash
   git clone [https://github.com/Alexander99G/TareaU2-POO-EGH.git](https://github.com/Alexander99G/TareaU2-POO-EGH.git)
2. Importa el proyecto en Eclipse:
   Ir a File > Import...
   Seleccionar General > Existing Projects into Workspace y buscar la carpeta clonada.

Ejecución
  - Para iniciar la aplicación, se compila y ejecuta el archivo de tu clase principal (por ejemplo, PruebaAudioVisual.java). El sistema leerá automáticamente cualquier        archivo CSV existente en la raíz para cargar los datos.

 Pruebas Unitarias

El proyecto cuenta con una suite completa de pruebas unitarias ubicadas en el directorio test/main/java/ para asegurar el correcto funcionamiento del modelo y la persistencia de datos.

Para ejecutarlas en Eclipse:

 -  En el Package Explorer, clic derecho sobre la carpeta test.
 -  Seleccionar Run As > JUnit Test.
 -  Verificar en la pestaña de JUnit que todas las aserciones pasen correctamente (Barra Verde).
