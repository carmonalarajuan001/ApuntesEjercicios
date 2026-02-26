const n1 = document.getElementById("numero1");
const n2 = document.getElementById("numero2");
const resultado = document.getElementById("resultado");

function obtenerNumeros() {
    return [parseFloat(n1.value), parseFloat(n2.value)];
}

document.getElementById("btnSumar").addEventListener("click", function() {
    
    const [a, b] = obtenerNumeros();
    resultado.textContent = a + b;
});

document.getElementById("btnRestar").addEventListener("click", function() {
    
    const [a, b] = obtenerNumeros();
    resultado.textContent = a - b;
});

document.getElementById("btnMultiplicar").addEventListener("click", function() {
    
    const [a, b] = obtenerNumeros();
    resultado.textContent = a * b;
});

document.getElementById("btnDividir").addEventListener("click", function() {
    
    const [a, b] = obtenerNumeros();
    resultado.textContent = a / b;
});