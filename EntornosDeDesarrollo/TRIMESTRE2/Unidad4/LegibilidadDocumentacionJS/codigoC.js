/**
 * Devuelve el mayor de tres números siempre que todos sean distintos.
 * Si alguno de los valores se repite, devuelve false.
 *
 * @param {number} numeroA - Primer número.
 * @param {number} numeroB - Segundo número.
 * @param {number} numeroC - Tercer número.
 * @returns {number|boolean} El número mayor o false si hay valores iguales.
 */
function compararMayor(numeroA, numeroB, numeroC) {
    if (numeroA === numeroB || numeroA === numeroC || numeroB === numeroC) {
        return false;
    }

    if (numeroA > numeroB && numeroA > numeroC) {
        return numeroA;
    }

    if (numeroB > numeroA && numeroB > numeroC) {
        return numeroB;
    }

    return numeroC;
}