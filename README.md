# Sistema de Gestión de Contenido Audiovisual (POO)

Este proyecto es una aplicación desarrollada en **Java** que implementa los pilares de la Programación Orientada a Objetos para gestionar diferentes tipos de medios digitales.

## 🎯 Objetivos y Propósito
El propósito de este proyecto es demostrar el dominio de conceptos avanzados de POO, tales como:
- **Abstracción:** Uso de clases y métodos abstractos.
- **Herencia:** Extensión de funcionalidades desde una clase base.
- **Polimorfismo:** Gestión de diferentes tipos de objetos bajo una misma interfaz.
- **Encapsulamiento:** Protección de datos mediante modificadores de acceso y métodos Getter/Setter.

El sistema resuelve el problema de organizar y catalogar diversos formatos de contenido (Películas, Series, Videos) de manera centralizada y escalable.

## 🚀 Funcionalidades y Clases Añadidas
Se ha implementado una jerarquía de clases robusta:
1.  **`ContenidoAudiovisual` (Clase Abstracta):** Define la estructura base (ID, Título, Duración, Género).
2.  **`Pelicula`:** Añade el atributo `director` y personaliza la visualización de detalles.
3.  **`SerieDeTV`:** Gestiona múltiples episodios y temporadas.
4.  **`YouTubeVideo`:** Implementa la herencia de la clase padre Contenido Audiovisual

## 🛠️ Instrucciones de Instalación y Uso

### Requisitos
- **JDK 17** o superior.
- **Eclipse IDE**.

### Instalación
1. Clona el repositorio desde tu terminal:
   ```bash
   git clone [https://github.com/tu-usuario/tu-repositorio.git](https://github.com/tu-usuario/tu-repositorio.git)
   Importa el proyecto en Eclipse: File > Import > Existing Projects into Workspace.

   ### Cómo subirlo desde Eclipse:
1. En el **Package Explorer**, haz clic derecho en tu proyecto > **New** > **File**.
2. Ponle de nombre `README.md`.
3. Pega el texto anterior (ajusta tu nombre y el link del repo).
4. Ve a la pestaña **Git Staging**.
5. Verás el archivo en *Unstaged Changes*. Pásalo a *Staged*, escribe el mensaje `Docs: Agregar README detallado` y dale a **Commit**.
6. Finalmente, haz el **Push** a GitHub.
