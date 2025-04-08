Sistema de Gestión de Biblioteca

Este proyecto implementa un sistema básico de gestión de biblioteca utilizando programación orientada a objetos (POO) en Java. Incluye clases para libros, miembros y biblioteca, así como pruebas automatizadas con JUnit 5.

Estructura del proyecto


/biblioteca-java/
├── README.txt
├── src/
│   └── biblioteca/
│       ├── Libro.java
│       ├── Miembro.java
│       ├── Biblioteca.java
│       └── Main.java
├── test/
│   ├── LibroTest.java
│   └── BibliotecaTest.java
├── lib/
│   └── junit-platform-console-standalone-1.10.0.jar


Requisitos

- Java JDK 11 o superior.
- Conexión a internet para descargar JUnit si es necesario.

Instrucciones de uso

Descargar JUnit 5


wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.0/junit-platform-console-standalone-1.10.0.jar -P lib/

Compilar el proyecto y los tests

javac -d out -cp lib/junit-platform-console-standalone-1.10.0.jar src/biblioteca/*.java test/*.java

Ejecutar pruebas automatizadas

Esto buscará y ejecutará automáticamente todas las clases de prueba JUnit encontradas.

java -jar lib/junit-platform-console-standalone-1.10.0.jar --class-path out --scan-class-path


