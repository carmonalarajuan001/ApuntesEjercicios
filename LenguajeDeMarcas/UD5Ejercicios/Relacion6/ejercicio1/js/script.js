const container = document.getElementById("formulario-container");

container.innerHTML = `
<form id="pedidoForm">
    <label>Nombre:</label>
    <input type="text" id="nombre" required><br><br>

    <label>Correo Electrónico:</label>
    <input type="email" id="email" required><br><br>

    <label>Producto:</label>
    <select id="producto">
        <option value="Plato decorativo">Plato decorativo</option>
        <option value="Jarra artesanal">Jarra artesanal</option>
        <option value="Azulejo pintado">Azulejo pintado</option>
    </select><br><br>

    <label>Cantidad:</label>
    <input type="number" id="cantidad" min="1" value="1" required><br><br>

    <button type="submit">Enviar</button>
</form>
`;

const nombre = document.getElementById("nombre");
const email = document.getElementById("email");
const producto = document.getElementById("producto");
const cantidad = document.getElementById("cantidad");
const form = document.getElementById("pedidoForm");

// Focus y blur → cambiar borde
function cambiarBorde() {
    this.style.borderColor = "blue";
}

function restaurarBorde() {
    this.style.borderColor = "";
}

nombre.addEventListener("focus", cambiarBorde);
email.addEventListener("focus", cambiarBorde);
cantidad.addEventListener("focus", cambiarBorde);

nombre.addEventListener("blur", restaurarBorde);
email.addEventListener("blur", restaurarBorde);
cantidad.addEventListener("blur", restaurarBorde);

// Change del select
producto.addEventListener("change", function () {
    console.log("Producto seleccionado:", producto.value);
});

// Submit del formulario
form.addEventListener("submit", function (event) {
    if (nombre.value === "" || email.value === "" || cantidad.value <= 0) {
        console.log("Error: Todos los campos son obligatorios y la cantidad debe ser mayor a 0");
        event.preventDefault();
    } else {
        console.log("Formulario enviado correctamente");
    }
});