Plataforma de Blogs en PostgreSQL

Este proyecto contiene la estructura de base de datos, datos de prueba y consultas SQL para una plataforma de blogs. Está dividido en tres archivos .sql que deben ejecutarse en orden.

Estructura del proyecto

- CreacionDB.sql: crea la base de datos blogs y define todas las tablas.
- Registros.sql: inserta datos de prueba (10 registros por tabla).
- Consultas.sql: contiene 10 consultas SQL de distintos niveles (sencillas, medianas y complejas).

Requisitos

- PostgreSQL instalado (recomendado versión 12 o superior).
- Acceso a consola psql o a una herramienta como pgAdmin.
- Usuario con permisos para crear bases de datos y ejecutar scripts.

Instrucciones de uso

Crear la base de datos y las tablas

Desde la terminal:

psql -U postgres -f CreacionDB.sql

Esto creará la base de datos blogs y su estructura de tablas relacional.

Cargar los datos de prueba

Conéctate a la base de datos creada:

psql -U postgres -d blogs -f Registros.sql

Esto insertará 10 usuarios, posts, comentarios, etiquetas y relaciones.

Ejecutar consultas de ejemplo

Aún dentro de la base de datos blogs, ejecuta:

psql -U postgres -d blogs -f Consultas.sql

Las consultas muestran cómo interactúan las tablas y cubren distintos niveles de complejidad.
