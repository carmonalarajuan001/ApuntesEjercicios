-- Elimina la base de datos si ya existe
DROP DATABASE IF EXISTS nevadashopping;

-- Crea la base de datos
CREATE DATABASE nevadashopping;
USE nevadashopping;

-- Tabla empleado
CREATE TABLE empleado (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    departamento VARCHAR(50),
    salario DECIMAL(10, 2),
    ciudad VARCHAR(50),
    edad INT
);

-- Inserta datos en la tabla empleado
INSERT INTO empleado VALUES
(1, 'Laura', 'IT', 4500.00, 'Madrid', 35),
(2, 'Carlos', 'Ventas', 3200.00, 'Barcelona', 28),
(3, 'Ana', 'Marketing', 6000.00, 'Madrid', 45),
(4, 'Juan', 'Recursos Humanos', 5200.00, 'Sevilla', 50),
(5, 'Luis', 'IT', 3400.00, 'Madrid', 29),
(6, 'Marta', 'Desarrollo', 5800.00, 'Valencia', 33),
(7, 'Pablo', 'Marketing', 3900.00, 'Madrid', 41),
(8, 'Elena', 'Ventas', 3100.00, 'Barcelona', 26),
(9, 'Alberto', 'Desarrollo', 4300.00, 'Valencia', 36),
(10, 'Isabel', 'IT', 4800.00, 'Madrid', 30),
(11, 'Laura', 'Marketing', 4500.00, 'Madrid', 35),
(12, 'Carlos', 'Desarrollo', 3200.00, 'Barcelona', 28);

-- Tabla departamento
CREATE TABLE departamento (
    id INT PRIMARY KEY,
    nombre VARCHAR(50)
);

-- Inserta datos en la tabla departamento
INSERT INTO departamento VALUES
(1, 'IT'),
(2, 'Ventas'),
(3, 'Marketing'),
(4, 'Recursos Humanos'),
(5, 'Desarrollo');

-- Tabla venta
CREATE TABLE venta (
    id INT PRIMARY KEY,
    empleado_id INT,
    cliente VARCHAR(50),
    importe DECIMAL(10, 2),
    fecha DATE,
    FOREIGN KEY (empleado_id) REFERENCES empleado(id)
);

-- Inserta datos en la tabla venta
INSERT INTO venta VALUES
(1, 1, 'Cliente A', 2000.00, '2024-01-10'),
(2, 2, 'Cliente B', 1500.00, '2024-01-11'),
(3, 3, 'Cliente C', 3000.00, '2024-01-12'),
(4, 4, 'Cliente D', 4000.00, '2024-01-13'),
(5, 5, 'Cliente E', 3500.00, '2024-01-14'),
(6, 6, 'Cliente F', 5000.00, '2024-01-15'),
(7, 7, 'Cliente G', 4500.00, '2024-01-16'),
(8, 8, 'Cliente H', 2800.00, '2024-01-17'),
(9, 9, 'Cliente I', 3300.00, '2024-01-18'),
(10, 10, 'Cliente J', 4700.00, '2024-01-19'),
(11, 1, 'Cliente K', 1500.00, '2024-01-20'),
(12, 2, 'Cliente L', 1800.00, '2024-01-21'),
(13, 2, 'Cliente L', 1800.00, '2024-01-21');

-- Relación de ejercicios prácticos

-- 1. Número total de empleados por departamento
SELECT departamento, COUNT(*) AS total_empleados FROM empleado GROUP BY departamento;

-- 2. Salario promedio por ciudad (solo > 4000)
SELECT ciudad, AVG(salario) AS salario_promedio FROM empleado GROUP BY ciudad HAVING AVG(salario) > 4000;

-- 3. Total de ventas por cliente
SELECT cliente, SUM(importe) AS total_ventas FROM venta GROUP BY cliente;

-- 4. Departamentos con más de 3 empleados
SELECT departamento, COUNT(*) AS total_empleados FROM empleado GROUP BY departamento HAVING COUNT(*) > 3;

-- 5. Promedio de edad de los empleados por ciudad
SELECT ciudad, AVG(edad) AS promedio_edad FROM empleado GROUP BY ciudad;

-- 6. Ciudades donde hay empleados (sin duplicados)
SELECT DISTINCT ciudad FROM empleado;

-- 7. Número total de ventas y suma de importes
SELECT COUNT(*) AS total_ventas, SUM(importe) AS suma_importes FROM venta;

-- 8. Cliente con la venta más baja
SELECT cliente, importe FROM venta WHERE importe = (SELECT MIN(importe) FROM venta);

-- 9. Cliente con la venta de mayor importe
SELECT cliente, importe FROM venta WHERE importe = (SELECT MAX(importe) FROM venta);

-- 10. Empleados con salario mayor al promedio de todos los salarios
SELECT nombre, salario FROM empleado WHERE salario > (SELECT AVG(salario) FROM empleado);

-- Subconsulta 1: Nombres de empleados que trabajan en departamentos existentes
SELECT nombre FROM empleado WHERE departamento IN (SELECT nombre FROM departamento);

-- Subconsulta 2: Empleados con salario > 4000 (mostrar nombre y salario)
SELECT nombre, salario FROM empleado WHERE salario > 4000;

-- Subconsulta 3: Nombre del empleado con el salario más alto
SELECT nombre FROM empleado WHERE salario = (SELECT MAX(salario) FROM empleado);

-- Subconsulta 4: Departamentos con salario promedio > 5000
SELECT departamento, AVG(salario) AS salario_promedio FROM empleado GROUP BY departamento HAVING AVG(salario) > 5000;

-- Subconsulta 5: Clientes con ventas superiores al promedio de todas las ventas
SELECT DISTINCT cliente FROM venta WHERE importe > (SELECT AVG(importe) FROM venta);
