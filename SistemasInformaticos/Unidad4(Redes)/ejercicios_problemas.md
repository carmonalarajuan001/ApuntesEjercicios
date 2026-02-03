Ejercicio tamaño cabeceras
6- Un sistema tiene una jerarquía de protocolos de n capas. Las aplicaciones generan mensajes de M bytes de longitud. En cada capa se añade una cabecera de h bytes. ¿Qué fracción del ancho de banda de la red se llena con información de la capa de aplicación? Aplique el resultado a una conexión a 400 Kbps con tamaño de datos de 1000 Bytes y 7 capas, cada una de las cuales añade 64 Bytes de cabecera.

## Datos del problema

- Tamaño del mensaje de la aplicación:  
  **M = 1000 bytes**

- Número de capas:  
  **n = 7**

- Tamaño de cada cabecera:  
  **h = 64 bytes**

- Velocidad del enlace:  
  **400 Kbps** (no influye en el porcentaje, solo es informativo)

---

## Paso 1: Calcular cuánto ocupa TODO lo que se envía

Primero calculamos cuántos bytes extra añaden las cabeceras:

7 capas × 64 bytes = 448 bytes de cabeceras


Ahora sumamos:
- Datos útiles
- Cabeceras

1000 + 448 = 1448 bytes en total


👉 **La red transmite 1448 bytes**, aunque solo 1000 son datos reales.

---

## Paso 2: Calcular la fracción de ancho de banda útil

La fracción útil es:

datos útiles / datos totales


En números:

1000 / 1448 ≈ 0,69



Ejercicio transmision

Queremos enviar un archivo de 2000 bytes usando paquetes de 1000 bytes por un enlace de 120 Mbps entre dos torres situadas a 15 Km de distancia. Teniendo en cuenta que las cabeceras ocupan 50 bytes también por tanto los paquetes de confirmación, ¿Cuánto tiempo tardaremos en enviar el primer paquete? ¿Cúanto tiempo tardaremos (desde que comienza el primer envío, si no hay errores) en recibir la confirmación del correcto envío de todos los paquetes?

2000B de envío, 50B de cabecera 
120 Mbps (Velocidad Transmisión)
15km
1000B tamaño Paquete
Tt1 + Tt2 + Tt3 + 2 x Tp + TAck

Tt1= 1000B x 8b/B / 120MBps = 66,6 microsegundos.
Tt2= 1000B x 8b/B / 120MBps = 66,6 microsegundos.
Tt3= 150B x 8b/B / 120MBps = 10 microsegundos.

Tp= 15kmx1000n/km /2x10º8m/s=75 microsegundos

FALTA TAck

Ejercicio IP.

    tengo una red 192.170.0.0 /24 y quiero hacer 3 subredes lo más grandes posible. (minima mascara de red que puedas hacer).
    dentro de cada subred que hayas creado, asigna una ip a 3 dispositivos diferentes (9 en total)
    en una de las 3 subredes que has creado, la que tú quieras, define 2 subredes más.

YA ECHO






Ejercicio transmision

    Queremos enviar una foto de resolucion HD (1920X1080) con una profundidad de color de 32 bits. El protocolo nos permite hacer paquetes de hasta 4MB.
    La velocidad de transferencia es de 1Gbps y la distancia entre torres es de 80 Km.
    Dime el tiempo que transcurre desde que comenzamos a emitir hasta que llega la ultima confirmación.
    ¿Qué tiempo mínimo de confirmación antes de reenviar establecerías para cada paquete?

Resolución:
1920 × 1080 = 2 073 600 píxeles

Profundidad de color:
32 bits = 4 bytes por píxel

Tamaño total:
2 073 600 × 4 = 8 294 400 bytes ≈ 8,29 MB

foto:8,2 MB
Paquete 4MB
Cabecera=4kb
Distancia=80km
Vt=16bps

3kb 3997kb