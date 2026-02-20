# Implementacion de Clases

## Descripción
Este proyecto consiste en una implementación robusta de la Programación Orientada a Objetos (POO) para garantizar la integridad de los datos y el comportamiento correcto en colecciones.

## Características Principales
- **Encapsulamiento**: Todos los atributos (`id`, `nombre`, `descripcion`, `precio`) son privados.
- **Validación de Datos**: Los métodos `set` y el constructor incluyen lógica de validación para prevenir:
  - IDs negativos.
  - Precios negativos.
  - Nombres o descripciones nulas o vacías.
- **Manejo de Excepciones**: Se utiliza `IllegalArgumentException` para informar sobre datos inválidos.
- **Identidad Lógica**: Implementación de los métodos `equals()` y `hashCode()` basados en el atributo `id`.
- **Representación de Texto**: Método `toString()` personalizado para facilitar la depuración.

## Estructura del Proyecto
```text
demo/
├── README.md              # Documentación del proyecto
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    ├── Main.java     # Clase principal de prueba
                    └── Product.java  # Clase de dominio