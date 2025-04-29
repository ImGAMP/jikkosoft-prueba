# 💻 Jikkosoft Technical Challenge – Fullstack Developer Assessment

Este repositorio contiene la solución a una prueba técnica compuesta por tres retos enfocados en desarrollo de software, bases de datos, algoritmos y programación orientada a objetos. Cada sección incluye código documentado, buenas prácticas de diseño, validaciones y pruebas automáticas.

---

## 📂 Estructura del repositorio

```
jikkosoft-prueba/
│
├── punto1-sql/              # Scripts SQL para modelado, inserción y consultas
│   ├── modelo.sql
│   ├── inserts.sql
│   └── consultas.sql
│
├── punto2-python/           # Solución en Python con pruebas usando PyTest
│   ├── main.py
│   ├── utils.py
│   └── test_main.py
│
└── punto3-java/             # Sistema orientado a objetos en Java con pruebas JUnit
    ├── src/
    │   └── com/jikkosoft/
    │       └── ... (clases del sistema)
    └── test/
        └── ... (pruebas unitarias)
```

---

## 🔧 Tecnologías utilizadas

- **SQL** – PostgreSQL
- **Python 3.10+** – PyTest para pruebas unitarias
- **Java 17** – JUnit 5
- **Maven** – Gestión de dependencias Java

---

## ✅ Detalle por punto

### 🟣 Punto 1 – SQL

- Modelado relacional de base de datos.
- Scripts de inserción y consultas complejas.
- Compatible con PostgreSQL y ajustable a otros motores SQL.

### 🟢 Punto 2 – Python

- Algoritmo implementado en Python puro, estructurado en funciones reutilizables.
- Pruebas unitarias con `pytest`.
- Separación entre lógica de negocio y entrada/salida.

### 🟠 Punto 3 – Java

- Aplicación orientada a objetos con patrones SOLID.
- Uso de clases, encapsulamiento, abstracciones y pruebas automatizadas con JUnit.
- Arquitectura simple pero escalable para representar lógica empresarial.

---

## 🧪 ¿Cómo ejecutar las pruebas?

### Python (punto 2)
```bash
cd punto2-python
pytest
```

### Java (punto 3)
```bash
cd punto3-java
mvn clean test
```

---

## 📜 Autor

**Gustavo A. Mojica Perdigón**  
Fullstack Engineer | Scalable Systems | Clean Architecture  
[LinkedIn](https://www.linkedin.com/in/imgamp-it/) | [GitHub](https://github.com/ImGAMP)

---

## 📝 Licencia

Puedes usar el código como referencia para pruebas técnicas o aprendizaje personal.
