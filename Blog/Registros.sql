-- INSERCION DE REGISTROS

-- Insertar usuarios
INSERT INTO users (name, email, password) VALUES
('Laura Gómez', 'laura@example.com', '384921'),
('Carlos Ruiz', 'carlos@example.com', '619042'),
('Ana Torres', 'ana@example.com', '758394'),
('Juan Méndez', 'juan@example.com', '934217'),
('Paula Herrera', 'paula@example.com', '127563'),
('Miguel Díaz', 'miguel@example.com', '543628'),
('Diana Cifuentes', 'diana@example.com', '810256'),
('Sofía Bernal', 'sofia@example.com', '675490'),
('Luis Castro', 'luis@example.com', '209831'),
('Valentina Rojas', 'valentina@example.com', '491786');


-- Insertar posts
INSERT INTO posts (user_id, title, content) VALUES
(1, 'Bienvenidos a mi blog', 'Contenido del post de bienvenida.'),
(2, 'Receta de arroz con leche', 'Detalles de una receta tradicional.'),
(3, 'Guía rápida de PostgreSQL', 'Explicación sobre claves foráneas.'),
(4, 'Viaje a Medellín', 'Relato personal de viaje.'),
(5, 'Cómo usar Python', 'Introducción a la programación en Python.'),
(6, 'Tips para entrevistas técnicas', 'Preparación para entrevistas de programación.'),
(7, 'Taller de Java', 'Conceptos clave de Java POO.'),
(8, 'Uso de Git y GitHub', 'Control de versiones y ramas.'),
(9, 'Organiza tu tiempo', 'Productividad para programadores.'),
(10, 'Docker desde cero', 'Contenedores y virtualización ligera.');

-- Insertar tags
INSERT INTO tags (name) VALUES
('programación'),
('cocina'),
('viajes'),
('tutorial'),
('python'),
('postgresql'),
('docker'),
('productividad'),
('entrevistas'),
('git');

-- Insertar relación posts - tags
INSERT INTO post_tags (post_id, tag_id) VALUES
(1, 1), (1, 4),
(2, 2),
(3, 6), (3, 4),
(4, 3),
(5, 5), (5, 1),
(6, 9), (6, 1),
(7, 1),
(8, 10),
(9, 8),
(10, 7), (10, 4);

-- Insertar comentarios
INSERT INTO comments (post_id, user_id, content) VALUES
(1, 2, '¡Muy buen inicio!'),
(1, 3, 'Espero más contenido.'),
(2, 4, 'Me encantó la receta.'),
(3, 5, 'Muy útil para principiantes.'),
(4, 6, 'Qué bonitas fotos de Medellín.'),
(5, 7, 'Python es mi lenguaje favorito.'),
(6, 8, 'Gracias por los consejos.'),
(7, 9, 'Buen resumen de POO.'),
(8, 10, 'Me costaba entender Git, esto ayuda.'),
(9, 1, 'Justo lo que necesitaba.'),
(10, 2, 'Excelente introducción a Docker.');

