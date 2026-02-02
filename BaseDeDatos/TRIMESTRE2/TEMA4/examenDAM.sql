
-- 1 dime el nombre y apellido de los cinco malagueños (provincia) de más edad
SELECT nombre, apellido
FROM personas
WHERE provincia = 'Málaga'
ORDER BY edad DESC
LIMIT 5
-- 2 dime el maximo de ingresos anuales que tiene una persona con estudios primarios.
SELECT MAX(ingresos_anuales) AS max_ingresos
FROM personas
WHERE estudios = 'Primarios'
-- 3  dime la edad media de las personas cuya ocupación comience por la letra A
SELECT AVG(edad) AS edad_media
FROM personas
WHERE ocupacion LIKE 'A%'
-- 4  Dime las 3 primeras letras del estado civil de las personas de Dos Hermanas (pueblo, no que tengan hermanas).

-- 5  Cuenta el numero de personas que son padre siendo mujer o madre siendo hombre

-- 6  Dime la moda del estado civil

-- 7  Dime cuantos municipios diferentes de la provincia de Cádiz aparecen en la base de datos. 

-- 8  Dime la media de ingresos_anuales agrupada por estado_civil.

-- 9  Dime los abuelos de la persona con id 1144

-- 10 Dime los nietos de la persona con id 1093

-- 11 Dime la media de numero de hijos por mujer.

-- 12 Dime los 5 granadinos (provincia) que más cobran ordenados por la longitud en letras de su ocupacion. 

-- 13 Dime la provincia con menos ingresos anuales de media.

-- 14 Dime la provincia que tiene a los jubilados con menores ingresos anuales de media.

-- 15 Dime el municipio con mas ingresos anuales sin contar a las personas que no cobran nada.

-- 16 dime la media de edad de las personas con algun hijo con nombre empezando por la L.

-- 17 Dime la edad media de las personas que sean hermanas (de padre o de madre) de las personas de Málaga municipio.

-- 18 Dime la media de salarios anuales agrupados por el dia del mes en el que nacieron.

-- 19 Muestra la fecha de nacimiento en dia, mes y año de los jubilados que viven en Córdoba.

-- 20 Muestra la cantidad de personas que nacieron en cada década del siglo XX.

-- 21. Muestra las 3 provincias con más edad media entre las personas casadas.

-- 22. Muestra el municipio (o municipios) con más personas paradas.

-- 23. Muestra cada municipio junto con el valor máximo de ingresos_anuales de entre las personas que son padres --