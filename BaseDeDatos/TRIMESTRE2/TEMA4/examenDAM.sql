
-- 1 dime el nombre y apellido de los cinco malagueños (provincia) de más edad
SELECT nombre, apellido
FROM personas
WHERE provincia = 'Málaga'
ORDER BY fecha_nacimiento ASC
LIMIT 5
-- 2 dime el maximo de ingresos anuales que tiene una persona con estudios primarios.
SELECT nivel_estudios, MAX(ingresos_anuales) AS max_ingresos
FROM personas
WHERE nivel_estudios = 'Primarios'
-- 3  dime la edad media de las personas cuya ocupación comience por la letra A
SELECT AVG(FLOOR(DATEDIFF(NOW(), fecha_nacimiento) / 365)) AS edad_media FROM personas WHERE ocupacion LIKE 'A%'
-- 4  Dime las 3 primeras letras del estado civil de las personas de Dos Hermanas (pueblo, no que tengan hermanas).
SELECT DISTINCT SUBSTRING(estado_civil, 1, 3) AS primeras_tres_letras
FROM personas
WHERE municipio = 'Dos Hermanas'
LIMIT 3
-- 5  Cuenta el numero de personas que son padre siendo mujer o madre siendo hombre
SELECT COUNT(*) AS numero_personas
FROM personas
WHERE (genero = 'Femenino' AND es_padre = TRUE) OR (genero = 'Masculino' AND es_madre = TRUE)
-- 6  Dime la moda del estado civil
SELECT estado_civil, COUNT(*) AS frecuencia
FROM personas
GROUP BY estado_civil
ORDER BY frecuencia DESC
LIMIT 1
-- 7  Dime cuantos municipios diferentes de la provincia de Cádiz aparecen en la base de datos. 
SELECT COUNT(DISTINCT municipio) AS numero_municipioS 
FROM personas
WHERE provincia = 'Cádiz'
-- 8  Dime la media de ingresos_anuales agrupada por estado_civil.
SELECT estado_civil, AVG(ingresos_anuales) AS media_ingresos
FROM personas
GROUP BY estado_civil
-- 9  Dime los abuelos de la persona con id 1144
SELECT padre, madre FROM personas where id =(select padre from personas where id=2002)
or id =(select madre from personas where id=2002)
-- 10 Dime los nietos de la persona con id 1093
select * from personas where padre in (select id from personas where padre = 1093 or madre = 1093) or madre in (select id from personas where padre = 1093 or madre = 1093);
-- 11 Dime la media de numero de hijos por mujer.
SELECT AVG(num_hijos) AS media_hijos_por_mujer
FROM personas
WHERE genero = 'Femenino'
-- 12 Dime los 5 granadinos (provincia) que más cobran ordenados por la longitud en letras de su ocupacion. 
SELECT nombre, apellido, ocupacion, ingresos_anuales
FROM personas
WHERE provincia = 'Granada'
ORDER BY LENGTH(ocupacion) DESC, ingresos_anuales DESC
LIMIT 5
-- 13 Dime la provincia con menos ingresos anuales de media.
SELECT provincia, AVG(ingresos_anuales) AS media_ingresos
FROM personas
GROUP BY provincia
ORDER BY media_ingresos ASC
LIMIT 1;
-- 14 Dime la provincia que tiene a los jubilados con menores ingresos anuales de media.
SELECT provincia, AVG(ingresos_anuales) AS media_ingresos_jubilados
FROM personas
WHERE estado_civil = 'Jubilado'
GROUP BY provincia
ORDER BY media_ingresos_jubilados ASC
LIMIT 1;
-- 15 Dime el municipio con mas ingresos anuales sin contar a las personas que no cobran nada.
SELECT municipio, SUM(ingresos_anuales) AS total_ingresos
FROM personas
WHERE ingresos_anuales > 0
GROUP BY municipio
ORDER BY total_ingresos DESC
LIMIT 1;
-- 16 dime la media de edad de las personas con algun hijo con nombre empezando por la L.
SELECT AVG(p1.edad) AS media_edad
FROM personas p1
JOIN personas p2 ON (p2.padre_id = p1.id OR p2.madre_id = p1.id)
WHERE p2.nombre LIKE 'L%'

-- 17 Dime la edad media de las personas que sean hermanas (de padre o de madre) de las personas de Málaga municipio.
SELECT AVG(p2.edad) AS media_edad_hermanas
FROM personas p1
JOIN personas p2 ON (p1.padre_id = p2.padre_id OR p1.madre_id = p2.madre_id)
WHERE p1.municipio = 'Málaga' AND p1.id <> p2.id;

-- 18 Dime la media de salarios anuales agrupados por el dia del mes en el que nacieron.
SELECT EXTRACT(DAY FROM fecha_nacimiento) AS dia_mes, AVG(ingresos_anuales) AS media_salarios
FROM personas
ORDER BY dia_mes;
-- 19 Muestra la fecha de nacimiento en dia, mes y año de los jubilados que viven en Córdoba.
SELECT EXTRACT(DAY FROM fecha_nacimiento) AS dia,
       EXTRACT(MONTH FROM fecha_nacimiento) AS mes,
       EXTRACT(YEAR FROM fecha_nacimiento) AS año
FROM personas
WHERE provincia = 'Córdoba' AND estado_civil = 'Jubilado';
-- 20 Muestra la cantidad de personas que nacieron en cada década del siglo XX.
SELECT (FLOOR(EXTRACT(YEAR FROM fecha_nacimiento) / 10) * 10) AS decada,
       COUNT(*) AS cantidad_personas
FROM personas
WHERE EXTRACT(YEAR FROM fecha_nacimiento) >= 1900 AND EXTRACT(YEAR FROM fecha_nacimiento) < 2000
GROUP BY decada
-- 21. Muestra las 3 provincias con más edad media entre las personas casadas.
SELECT provincia, AVG(edad) AS edad_media
FROM personas
WHERE estado_civil = 'Casado'
GROUP BY provincia
ORDER BY edad_media DESC
LIMIT 3;
-- 22. Muestra el municipio (o municipios) con más personas paradas.
SELECT municipio, COUNT(*) AS numero_parados
FROM personas
WHERE ocupacion = 'Desempleado'
GROUP BY municipio
HAVING COUNT(*) = (SELECT MAX(num_parados)
                      FROM (SELECT municipio, COUNT(*) AS num_parados
                            FROM personas
                            WHERE ocupacion = 'Desempleado'
                            GROUP BY municipio) AS subconsulta);    
-- 23. Muestra cada municipio junto con el valor máximo de ingresos_anuales de entre las personas que son padres --
SELECT municipio, MAX(ingresos_anuales) AS max_ingresos_padres
FROM personas
WHERE es_padre = TRUE
GROUP BY municipio;
