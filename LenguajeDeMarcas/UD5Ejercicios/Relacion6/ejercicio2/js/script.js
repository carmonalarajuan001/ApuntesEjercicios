// PRODUCTOS
let productos = document.querySelectorAll(".producto");

// 1. mouseover → cambiar fondo
productos.forEach(function (producto) {

    producto.addEventListener("mouseover", function () {
        this.style.backgroundColor = "lightgray";
    });

    producto.addEventListener("mouseout", function () {
        this.style.backgroundColor = "";
    });

});

// 2. keydown → mostrar tecla en consola
let busqueda = document.getElementById("busqueda");

busqueda.addEventListener("keydown", function (event) {
    console.log("Tecla presionada:", event.key);
});

// 3. keyup → filtrar productos
busqueda.addEventListener("keyup", function () {

    let filtro = this.value.toLowerCase();
    let productosLista = document.querySelectorAll(".producto");

    productosLista.forEach(function (producto) {

        let nombre = producto.getAttribute("data-nombre").toLowerCase();

        if (nombre.includes(filtro)) {
            producto.style.display = "block";
        } else {
            producto.style.display = "none";
        }

    });

});