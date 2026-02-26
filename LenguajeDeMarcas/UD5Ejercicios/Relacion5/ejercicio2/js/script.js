let total = 0;

document.getElementById("btnAniadirProducto").addEventListener("click", () => {
    const nombre = document.getElementById("inputNombreProducto").value;
    const precio = parseFloat(document.getElementById("inputPrecioProducto").value);

    //nombre → verifica que el campo del nombre no esté vacío.
    //!isNaN(precio) → comprueba que el precio sea un número válido
    //  (que no sea NaN, es decir, “Not a Number”).
    if (nombre && !isNaN(precio)) {
        const li = document.createElement("li");
        li.textContent = nombre + " - " + precio + "€";
        document.getElementById("listaProductos").appendChild(li);

        total += precio;
        document.getElementById("totalCompraH2").textContent = "Total: " + total + "€";
    }
});