Función Two-Sum con PyTest

Este módulo resuelve el problema clásico de encontrar dos números en una lista que sumen un valor objetivo. Utiliza una implementación eficiente en Python basada en diccionario e incluye validaciones de entrada y pruebas unitarias con PyTest.

Estructura del proyecto

- two_sum.py: Contiene la función two_sum() que implementa la lógica principal.
- test.py: Contiene 8 pruebas unitarias con PyTest que validan el correcto funcionamiento de la función.

Requisitos

- Python 3.7 o superior.
- PyTest instalado:

Ejecución de las pruebas

Desde el mismo directorio donde se encuentran los archivos, ejecutar alguna de las opciones:

- pytest test_two_sum.py
- python -m pytest test_two_sum.py

Cobertura de pruebas

- Casos válidos con soluciones esperadas.
- Casos con lista vacía o sin solución.
- Casos con números duplicados.
- Casos con números negativos.
- Validación de errores por tipo incorrecto de entrada (ValueError).