const btnAniadir = document.getElementById("btnAniadir")
const btnBorrar = document.getElementById("btnBorrar")
const btnEditar = document.getElementById("btnEditar")
const lista = document.getElementById("lista")

btnAniadir.addEventListener("click", function() {
    const nuevoElemento= document.createElement("li")
    const numeroElemento = lista.children.length + 1
    nuevoElemento.textContent = `Elemento ${numeroElemento}`;
    lista.appendChild(nuevoElemento)
})

btnBorrar.addEventListener("click", function () {
    if (lista.children.length>0) {
        lista.removeChild(lista.lastElementChild)   
    }
})

btnEditar.addEventListener('click', function() {
    if (lista.children.length > 0) {
        lista.lastElementChild.textContent = 'Elemento editado'; // Cambiar el texto del primer elemento
    }
});

