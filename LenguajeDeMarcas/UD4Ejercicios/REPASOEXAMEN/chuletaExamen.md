🧾 GUÍA RÁPIDA DE EXAMEN CSS (USAR DURANTE EL EXAMEN)
1️⃣ SIEMPRE EMPIEZA POR AQUÍ
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}


Luego:

body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
  color: #222;
}

2️⃣ CENTRAR CONTENIDO
.wrap {
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 20px;
}

3️⃣ FLEXBOX — PLANTILLA BASE

Cuando te pidan “poner en línea”, “distribuir”, “alinear”:

.contenedor {
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
  gap: 20px;
}


Si lo quieren en columna:

flex-direction: column;


Si quieren que algo ocupe toda la fila:

.titulo {
  flex: 0 0 100%;
}

4️⃣ TARJETA ESTÁNDAR (SIEMPRE CAE)
.card {
  background: white;
  padding: 20px;
  border-radius: 10px;
  border: 1px solid #ddd;
  box-shadow: 0 4px 8px rgba(0,0,0,0.1);
}


Imagen redondeada:

.card__img {
  border-radius: 8px;
  width: 100%;
}

5️⃣ BOTÓN RÁPIDO
.boton {
  display: inline-block;
  background: crimson;
  color: white;
  padding: 10px 15px;
  border-radius: 6px;
  text-decoration: none;
  transition: 0.3s;
}

.boton:hover {
  background: darkred;
  transform: scale(1.05);
}

6️⃣ COSAS QUE SIEMPRE PIDEN

Quitar viñetas:

ul {
  list-style: none;
}


Quitar subrayado:

a {
  text-decoration: none;
}

7️⃣ SELECTORES IMPORTANTES

Hijo directo:

.padre > .hijo { }


Hermano adyacente:

.img:hover + .titulo { }


Clase modificadora:

.elemento--activo { }

8️⃣ HERO CON FONDO
.hero {
  background-image: url("imagen.jpg");
  background-size: cover;
  background-position: center;
}

🎯 ESTRATEGIA PARA MAÑANA

Hazlo en este orden:

Reset

Body

Wrap

Header (flex + nav horizontal)

Hero (flex column + botón)

Cards (flex + wrap + título 100%)

Groups (flex + estilos distintos)

Agenda (ul sin viñetas + tarjetas)

Footer (flex + fondo oscuro)

🧠 LO MÁS IMPORTANTE DE TODO

Si algo no te sale perfecto:

✔ Que funcione
✔ Que esté en flex
✔ Que use el selector que piden
✔ Que visualmente se note el efecto

En examen práctico valoran más que esté aplicado que que sea “bonito”.

🧠 Idea básica

Tienes un contenedor padre y dentro varios hijos.

Cuando al contenedor le pones:

display: flex;


Automáticamente:

Los hijos se ponen en fila (uno al lado del otro).

Se alinean mejor.

Puedes controlar cómo se distribuyen.

🔑 Propiedades MÁS importantes
1️⃣ flex-direction

Define la dirección de los elementos.

flex-direction: row;        /* horizontal (por defecto) */
flex-direction: column;     /* vertical */


👉 row = izquierda → derecha
👉 column = arriba → abajo

2️⃣ justify-content

Controla cómo se distribuyen los elementos en la dirección principal.

Si es row, será horizontal.

justify-content: center;
justify-content: space-between;
justify-content: space-around;
justify-content: space-evenly;

Ejemplos:

center → centra todo

space-between → espacio entre elementos

space-around → espacio alrededor

space-evenly → espacio igual para todos

3️⃣ align-items

Alinea los elementos en la dirección contraria.

Si es row, esto controla verticalmente.

align-items: center;
align-items: flex-start;
align-items: flex-end;


👉 Muy usado para centrar verticalmente.

🎯 Cómo centrar algo PERFECTAMENTE
.contenedor {
  display: flex;
  justify-content: center;
  align-items: center;
}


🔥 Esto centra horizontal y verticalmente.

📦 Propiedades para los hijos
flex

Controla cuánto espacio ocupa un hijo.

flex: 1;


👉 Todos con flex: 1 ocupan el mismo espacio.

Si uno tiene:

flex: 2;


👉 Ese ocupará el doble que los demás.

🧩 Ejemplo completo
.contenedor {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.item {
  flex: 1;
}

## 🚀 Resumen ultra rápido

display: flex; → activa flexbox

flex-direction → fila o columna

justify-content → distribuye horizontal

align-items → alinea vertical

flex → controla tamaño de hijos
## Para imagen
.seccion {
  background-image: url("fondo.jpg");
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;}

  Sin wrap (por defecto)
flex-wrap: nowrap;


👉 Los elementos NO bajan.
👉 Se aplastan para intentar caber en la misma fila.

🔹 Con wrap
flex-wrap: wrap;


👉 Si no caben, bajan a la siguiente línea.
👉 Como si fuera texto cuando llega al borde.