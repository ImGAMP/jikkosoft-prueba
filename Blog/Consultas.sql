-- 1.1 Listar todos los usuarios registrados
SELECT id, name, email FROM users;

-- 1.2 Obtener los títulos de todos los posts
SELECT title FROM posts;

-- 1.3 Contar cuántos comentarios hay en total
SELECT COUNT(*) AS total_comentarios FROM comments;

-- 1.4 Listar todas las etiquetas ordenadas alfabéticamente
SELECT name FROM tags ORDER BY name;

-- 2.1 Ver posts con el nombre del autor
SELECT p.title, u.name AS autor
FROM posts p
JOIN users u ON p.user_id = u.id;

-- 2.2 Ver comentarios con autor y título del post
SELECT u.name AS autor_comentario, c.content, p.title AS post
FROM comments c
JOIN users u ON c.user_id = u.id
JOIN posts p ON c.post_id = p.id;

-- 2.3 Contar cuántos posts ha escrito cada usuario
SELECT u.name, COUNT(p.id) AS cantidad_posts
FROM users u
LEFT JOIN posts p ON u.id = p.user_id
GROUP BY u.name
ORDER BY cantidad_posts DESC;

-- 2.4 Ver todos los posts con sus respectivas etiquetas
SELECT p.title, t.name AS etiqueta
FROM posts p
JOIN post_tags pt ON p.id = pt.post_id
JOIN tags t ON pt.tag_id = t.id
ORDER BY p.title;

-- 3.1 Listar los posts con su número de comentarios y etiquetas
SELECT
    p.title,
    (SELECT COUNT(*) FROM comments c WHERE c.post_id = p.id) AS total_comentarios,
    (SELECT COUNT(*) FROM post_tags pt WHERE pt.post_id = p.id) AS total_etiquetas
FROM posts p;

-- 3.2 Ver los usuarios y clasificar si tienen "Alta", "Media" o "Baja" actividad según el número de posts
SELECT
    u.name,
    COUNT(p.id) AS total_posts,
    CASE
        WHEN COUNT(p.id) >= 5 THEN 'Alta'
        WHEN COUNT(p.id) BETWEEN 2 AND 4 THEN 'Media'
        ELSE 'Baja'
    END AS nivel_actividad
FROM users u
LEFT JOIN posts p ON u.id = p.user_id
GROUP BY u.id
ORDER BY total_posts DESC;

