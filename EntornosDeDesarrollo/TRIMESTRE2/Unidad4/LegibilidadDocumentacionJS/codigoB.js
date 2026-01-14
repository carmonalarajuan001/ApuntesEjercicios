/**
 * Calcula la media aritmética de una lista de números.
 *
 * @param {number[]} numeros - Lista de números.
 * @returns {number} Media de los valores de la lista.
 */
function calcularMedia(numeros) {
    let total = 0;

    for (let indice = 0; indice < numeros.length; indice++) {
        total += numeros[indice];
    }

    return total / numeros.length;
}