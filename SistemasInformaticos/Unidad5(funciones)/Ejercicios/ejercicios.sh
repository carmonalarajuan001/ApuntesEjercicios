#!/bin/bash 
DIVISION_ENTERA() { 
  division=$(( $1 / $2 ))
  resto=$(( $1 % $2 ))
  echo "La división entera es: $division y el resto es: $resto" 
}

 
area_circulo() { 
  area=$(( 3,14 * $1 * $1 ))
  echo "El área del circulo es: $area"

} 
perimetro_circunferencia() { 
perimetro=$((2 * 3,14 * $1))
echo "El perímetro de la circunferencia es: $perimetro"
} 
volumen_esfera() { 
volumen=$(( (4/3) * 3,14 * $1 * $1 * $1 ))
echo "El volumen de la esfera es: $volumen"
} 
 area_rectangulo() { 
area=$(( $1 * $2 ))
echo "El área del rectángulo es: $area"
} 


DIVISION_ENTERA 7 5
perimetro_circunferencia 2
volumen_esfera 2
area_circulo 2
area_rectangulo 2 7
 