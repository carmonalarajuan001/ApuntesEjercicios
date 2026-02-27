const buscador = document.getElementById('buscador');
const listaLibros = document.querySelectorAll('#lista-libros ul li');
const listaFavoritos = document.querySelector('#favoritos ul');

buscador.addEventListener("keyup", function () {

    let filtro = this.value.toLowerCase();

    listaLibros.forEach(function (libro) {

        let titulo = libro.textContent.toLowerCase();
        let autor = libro.getAttribute("data-autor").toLowerCase();

        if (titulo.includes(filtro) || autor.includes(filtro)) {
            libro.style.display = "list-item";
        } else {
            libro.style.display = "none";
        }

    });

});a