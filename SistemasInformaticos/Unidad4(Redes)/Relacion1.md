1. Explique brevemente las funciones de cada una de las capas del modelo de comunicación de datos TCP/IP

El modelo TCP/IP tiene 4 capas, y cada una cumple una función específica:

* Capa de Acceso a la Red o física
Se encarga de enviar los datos físicamente a través de la red.
Incluye cables, Wi-Fi, tarjetas de red y protocolos como Ethernet.

* Capa de Internet
Se ocupa de direccionar y enrutar los datos para que lleguen al destino correcto.
Usa direcciones IP y protocolos como IP.

* Capa de Transporte
Garantiza la comunicación entre origen y destino.
Controla el envío correcto de datos (TCP) o rápido sin confirmación (UDP).

* Capa de Aplicación
Permite la interacción con el usuario y las aplicaciones.
Incluye protocolos como HTTP, FTP, SMTP y DNS.


2. Si la unidad de datos de protocolo en la capa de enlace se llama trama y la unidad de datos de protocolo en la capa de red se llama paquete, ¿son las tramas las que encapsulan los paquetes o son los paquetes los que encapsulan las tramas? Explicar la respuesta.

Las tramas encapsulan a los paquetes.
Explicación sencilla:

Cuando los datos bajan por las capas del modelo de red, cada capa envuelve la información de la capa superior agregando su propio encabezado. Es como enviar una carta: el paquete es la carta y la trama es el sobre donde se mete la carta para poder enviarla.

5. ¿Qué diferencia, en el contexto de una red de computadores, existe entre la tecnología de difusión y la tecnología punto a punto? y fuera del contexto de redes de computadores, dime 2 ejemplos de comunicaciones por difusión y otros dos de punto a punto

En el contexto de redes de computadores, la diferencia principal es cómo se envía la información:

Difusión (broadcast): un solo emisor envía información a todos los dispositivos de la red al mismo tiempo. No se elige un destinatario específico.

Punto a punto (point-to-point): la comunicación es directa entre dos dispositivos específicos, y solo ellos reciben la información.

Fuera del contexto de redes:
Ejemplos de difusión: la televisión abierta, la radio FM.
Ejemplos de punto a punto: 
una llamada telefónica, un mensaje de WhatsApp.

6. Un sistema tiene una jerarquía de protocolos de n capas. Las aplicaciones generan mensajes de M bytes de longitud. En cada capa se añade una cabecera de h bytes. ¿Qué fracción del ancho de banda de la red se llena con cabeceras? Aplique el resultado a una conexión a 512 Kbps con tamaño de datos de 1500 Bytes y 4 capas, cada una de las cuales añade 64 Bytes de cabecera. La fracción del ancho de banda que se llena con cabeceras es (tomando únicamente dos decimales y redondeando con el tercero):

Datos del problema:

M=1500 Bytes
h=64 Bytes
n=4

Paso 1: Calcular total de cabeceras
n⋅h=4⋅64=256 Bytes

Paso 2: Calcular total enviado
M+n⋅h=1500+256=1756 Bytes

Paso 3: Fracción de cabeceras
Fracción=256/1756≈0.1458

Redondeando a dos decimales:
Respuesta: 0.15


mirar ejs resueltos ya q hay fracciones q no se pueden poner aqi

8. Cuando se intercambia un fichero entre dos hosts se pueden seguir dos estrategias de confirmación. En la primera, el fichero se divide en paquetes que se confirman individualmente por el receptor, pero el fichero en conjunto no se confirma. En la segunda, los paquetes individuales no se confirman individualmente, es el fichero entero el que se confirma cuando llega completo. Discutir las dos opciones

-Confirmar cada paquete

Cada paquete que llega se confirma.
Bueno: si se pierde un paquete, solo se reenvía ese.
Malo: hay muchas confirmaciones, ocupa más la red.

-Confirmar solo el fichero completo

No se confirma cada paquete, solo al final.
Bueno: menos mensajes de confirmación, más rápido si la red es buena.
Malo: si se pierde algo, puede que haya que enviar todo el fichero otra vez.

En resumen: una es segura y lenta (por paquetes), la otra es rápida pero arriesgada (por todo el fichero).

9. Clasifique como difusión o punto a punto cada uno de los siguientes sistemas de transmisión: a. Radio y TV b. Redes inalámbricas (WLAN) c. ADSL d. Redes de Cable. e. conexión WIFI

Difusión: Radio y TV, Conexion WIFI 
Punto a punto: 

10. Clasifique los siguientes servicios como orientados a conexión / no orientados a conexión y confirmados /sin confirmación. Justifique la respuesta. a. Correo postal ordinario b. Correo certificado c. Envío y recepción de fax d. Conversación telefónica
Ejercicio extra:
7. ¿Cuál es el tiempo necesario en enviar un paquete de 1000 Bytes, incluidos 50 Bytes de cabecera, por un enlace de 100 Mbps y 10Km? ¿cuál es el tiempo mínimo desde que se envía hasta que se recibe confirmación? ¿qué relación hay entre este tiempo y los temporizadores en, por ejemplo, las capas de enlace y transporte?
Prueba