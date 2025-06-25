-- Ejercicio SELECT simples


SELECT * FROM personajes AS p WHERE p.Nivel = 10;
SELECT * FROM personajes AS p WHERE p.Nombre LIKE "%or%";
SELECT * FROM reinos AS r WHERE r.Región = "Norte" AND r.Poblacion > 20000;
SELECT * FROM personajes AS p WHERE p.Titulo IN ("Hechicera", "Guerrero");
SELECT * FROM personajes as p ORDER BY p.Nombre ASC;
SELECT * FROM reinos AS r WHERE r.Nombre LIKE "%a%";
SELECT COUNT(*) FROM personajes AS p WHERE p.Tipo = "Humano";
SELECT DISTINCT Región FROM reinos;
SELECT * FROM personajes AS p WHERE p.Nivel BETWEEN 5 AND 10;
SELECT * FROM personajes AS p WHERE p.Titulo = "Guerrero" ORDER BY p.Nivel DESC LIMIT 3;


-- Ejercicios de JOIN y GROUP BY


SELECT personajes.*, reinos.Nombre FROM personajes JOIN reinos ON personajes.ReinoID = reinos.ReinoID;
SELECT reinos.*, personajes.Nombre FROM reinos LEFT JOIN personajes ON reinos.ReinoID = personajes.ReinoID;
SELECT batallas.Nombre, personajes.Nombre FROM personajes 
JOIN participantesbatalla ON personajes.PersonajeID = participantesbatalla.PersonajeID 
JOIN batallas ON participantesbatalla.BatallaID = batallas.BatallaID;
SELECT reinos.Nombre, COUNT(personajes.PersonajeID) FROM personajes LEFT JOIN reinos ON personajes.ReinoID = reinos.ReinoID GROUP BY reinos.ReinoID, reinos.Nombre;
SELECT artefactosmagicos.Tipo, sum(artefactosmagicos.Poder) FROM artefactosmagicos GROUP BY artefactosmagicos.Tipo;
SELECT batallas.Nombre, batallas.Resultado, batallas.Fecha FROM batallas WHERE batallas.Resultado = "Victoria";
SELECT personajes.Tipo, avg(personajes.Nivel) FROM personajes GROUP BY personajes.Tipo;
SELECT artefactosmagicos.*, personajes.Nombre FROM artefactosmagicos JOIN personajes ON artefactosmagicos.DueñoID = personajes.PersonajeID;
SELECT reinos.*, count(personajes.PersonajeID) FROM reinos JOIN personajes ON reinos.ReinoID = personajes.ReinoID 
GROUP BY reinos.ReinoID HAVING count(personajes.PersonajeID) > 3;
SELECT personajes.Nombre, participantesbatalla.Rol FROM personajes 
JOIN participantesbatalla ON personajes.PersonajeID = participantesbatalla.PersonajeID WHERE participantesbatalla.BatallaID = 1;


-- Ejercicios de CRUD 4


SELECT * FROM participantesbatalla;
INSERT INTO personajes (Nombre, Titulo, Tipo, Nivel, ReinoID) VALUES("Luna", "Mago", "Humano", 8, 4);
INSERT INTO reinos (Nombre, Región, Poblacion) VALUES("Valle Esmeralda", "Oeste", 25000);
UPDATE reinos SET Poblacion = 60000 WHERE reinos.Nombre = "Reino de Eldoria";
UPDATE personajes SET Nivel = 15 WHERE personajes.PersonajeID = 3;
DELETE FROM reinos WHERE reinos.Nombre = "Principado de Solstheim";
INSERT INTO artefactosmagicos (Nombre, Tipo, Poder, DueñoID) VALUES ("Escudo de la Esperanza", "Amuleto", 85, 6);
UPDATE artefactosmagicos SET DueñoID = 7 WHERE artefactosmagicos.Nombre = "Espada de Fuego";
DELETE FROM personajes WHERE personajes.Nombre = "Thorvald";
UPDATE reinos SET Región = "Norte" WHERE reinos.Nombre = "Dominio de Lunaris";
INSERT INTO participantesbatalla (BatallaID, PersonajeID, Rol) VALUES (3, 19, "atacante");