# APUNTES PARA EXAMEN

## Para ejecutar la carpeta
javadoc -d docs $(find . -name "*.java") este comando es bomba pa generar todos los archivos javadoc que lleven java en la carpeta en la que este en la terminal


## Documentacion para examen
🔗 {@link}

Crea un enlace a una clase, método, propiedad o URL.
Se muestra en formato código (monoespaciado).

Sintaxis:

{@link Nombre}
{@link Nombre|Texto personalizado}
{@link URL}


Ejemplos:

{@link MiClase}
{@link MiClase#miMetodo}
{@link MiClase#miMetodo|Ver método}

🔗 {@linkplain}

Igual que {@link}, pero el texto NO aparece en formato código.
Se usa cuando quieres que parezca texto normal.

Ejemplos:

{@linkplain MiClase}
{@linkplain MiClase#miMetodo|haz clic aquí}

👀 @see

Añade una referencia en la sección See Also de la documentación.

Sintaxis:

@see Nombre
@see Nombre#metodo
@see {@link Nombre}
@see URL


Ejemplo:

@see MiClase
@see MiClase#miMetodo
@see https://developer.mozilla.org/

⚠️ @deprecated

Marca un elemento como obsoleto.
Conviene indicar la alternativa recomendada.

Ejemplo:

/**
 * @deprecated Usa nuevaFuncion() en su lugar.
 */
function viejaFuncion() {}

♻️ {@inheritDoc}

Hereda la documentación del método padre.
Muy usado en clases que extienden otras.

Ejemplo:

class Hijo extends Padre {
  /**
   * {@inheritDoc}
   */
  metodo() {}
}

💻 {@code}

Muestra texto en formato código (monoespaciado).
No crea enlace.

Ejemplo:

{@code const x = 10;}

🏷️ @version

Indica la versión del elemento documentado.

Ejemplo:

/**
 * @version 1.2.0
 */

🔢 {@value}

Inserta el valor de una constante documentada.
Solo funciona con constantes.

Ejemplo:

const PI = 3.1416;

/**
 * Valor de PI: {@value}
 */

🧠 Diferencias clave para examen
Etiqueta	Qué hace
{@link}	Enlace con formato código
{@linkplain}	Enlace como texto normal
@see	Referencia en sección aparte
@deprecated	Marca como obsoleto
{@inheritDoc}	Hereda documentación
{@code}	Texto en formato código
@version	Indica versión
{@value}	Inserta valor de constante


/**
 * [Descripción breve del método].
 *
 * <p>[Explicación más detallada de lo que hace el método, 
 * incluyendo fórmulas o detalles importantes.]</p>
 *
 * @param [param1] [Descripción del parámetro 1].
 * @param [param2] [Descripción del parámetro 2].
 * @return [Descripción del valor que retorna el método].
 *
 * @author Juan Carmona
 * @version 1.0
 * @since 2026-02-18
 * @see [Referencia a otra clase o método relacionado]
 * @deprecated [Razón por la que está obsoleto, si aplica]
 * {@link [Enlace a otra clase o recurso]}
 * {@linkplain [Enlace con estilo de texto normal]}
 * {@value [Constante utilizada, si aplica]}
 * {@code [Fragmento de código o fórmula]}
 * {@inheritDoc}
 */