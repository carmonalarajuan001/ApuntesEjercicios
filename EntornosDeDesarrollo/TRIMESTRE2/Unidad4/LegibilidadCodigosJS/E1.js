function calcularResultado(numeroA, numeroB, numeroC) {
    let resultado = 0;

    if (numeroA > 0) {
        if (numeroB > 0) {
            resultado = numeroA + numeroB;
        } else {
            resultado = numeroA - numeroC;
        }
    } else {
        if (numeroC > 0) {
            resultado = numeroB + numeroC;
        } else {
            resultado = 0;
        }
    }

    return resultado;
}
