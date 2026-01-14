function sumarMayoresQue(valorLista, numeroLimite) {
    let sumaTotal = 0;

    for (let indice = 0; indice < valorLista.length; indice++) {
        if (valorLista[indice] > numeroLimite) {
            sumaTotal += valorLista[indice];
        }
    }

    return sumaTotal;
}