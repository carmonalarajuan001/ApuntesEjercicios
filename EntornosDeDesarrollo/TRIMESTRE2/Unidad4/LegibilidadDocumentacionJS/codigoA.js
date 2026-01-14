/**
 * Devuelve una nueva lista con los valores que son mayores que un número dado.
 *
 * @param {number[]} listaNumeros - Lista de números a evaluar.
 * @param {number} limite - Número con el que se comparan los valores.
 * @returns {number[]} Lista con los números mayores que el límite.
 */
function obtenerMayoresQue(listaNumeros, limite) {
    let resultado = [];

    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] > limite) {
            resultado.push(listaNumeros[i]);
        }
    }

    return resultado;
}