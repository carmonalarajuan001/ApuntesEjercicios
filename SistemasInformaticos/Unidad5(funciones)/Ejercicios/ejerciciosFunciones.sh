#!/bin/bash 
multiplicar() { 
    if [ $# -ne 2 ]; then
    echo "Debes proporcionar exactamente 2 números para multiplicar."
    return 1
fi
resultado=$(( $1 * $2 ))
echo "El resultado de multiplicar $1 por $2 es: $resultado"

}

potencia() { 
    if [ $# -ne 2 ]; then
        echo "Debes proporcionar exactamente 2 números para calcular la potencia."
        return 1
    fi
    base=$1
    exponente=$2
    resultado=1
    for ((i=1; i<=exponente; i++)); do
        resultado=$((resultado * base))
    done
    echo "El resultado de $base elevado a $exponente es: $resultado"
}

volumen_cubo() { 
if [ $# -ne 1 ]; then
    echo "Debes proporcionar exactamente 1 número para calcular el volumen del cubo."
    return 1
fi
lado=$1
volumen=$((lado * lado * lado))
echo "El volumen del cubo con lado $lado es: $volumen"
}

modulo() { 
if [ $# -ne 2 ]; then
    echo "Debes proporcionar exactamente 2 números para calcular el módulo."
    return 1
fi
dividendo=$1
divisor=$2
if [ $divisor -eq 0 ]; then
    echo "El divisor no puede ser cero."
    return 1
fi
resto=$(($1 % $2))
echo "El módulo de $dividendo entre $divisor es: $resto"
}
verificar_par() { 
if [ $# -ne 1 ]; then
    echo "Debes proporcionar exactamente 1 número para verificar si es par."
    return 1
fi
if [ $(( $1 % 2 )) -eq 0 ]; then
    echo "El número que has introducido si es par"
else
    echo "El número que has introducido no es par"
fi
}

factorial() { 
if [ $# -ne 1 ]; then
    echo "Debes proporcionar exactamente 1 número para calcular el factorial."
    return 1
fi
numero=$1
factorial=1
for ((i=1; i<=numero; i++)); do
    factorial=$((factorial * i))
done
echo "El factorial de $numero es: $factorial"
}

mayor_de_tres() { 
if [ $# -ne 3 ]; then
    echo "Debes proporcionar exactamente 3 números para calcular el mayor."
    return 1
fi
num1=$1
num2=$2
num3=$3
if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]; then
    echo "El mayor de los tres números es: $num1"
elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]; then
    echo "El mayor de los tres números es: $num2"
else
    echo "El mayor de los tres números es: $num3"
fi
}

es_primo() { 
if [ $# -ne 1 ]; then
    echo "Debes proporcionar exactamente 1 número para verificar si es primo."
    return 1
fi
numero=$1
if [ $numero -lt 2 ]; then
    echo "El número $numero no es primo."
    return 1
fi
es_primo=true
for ((i=2; i<=numero/2; i++)); do
    if [ $((numero % i)) -eq 0 ]; then
        es_primo=false
        break
    fi
done

if [ "$es_primo" = true ]; then
    echo "El número $numero es primo."
else
    echo "El número $numero no es primo."
fi

}
fibonacci() { 
if [ $# -ne 1 ]; then
    echo "Debes proporcionar exactamente 1 número para calcular la serie de Fibonacci."
    return 1
fi
numero=$1
a=0
b=1
echo "Serie de Fibonacci hasta $numero:"
for ((i=0; i<numero; i++)); do
    echo -n "$a "
    temp=$((a + b))
    a=$b
    b=$temp
done
echo ""
}

multiplicar 5 3
potencia 2 5
volumen_cubo 3
modulo 10 3
verificar_par 4
factorial 5
mayor_de_tres 10 20 15
es_primo 7
fibonacci 10