#!/bin/bash
validar(){
if [ $1 -gt $2 ]; then
    echo "debe haber $1 argumentos"
    return 1
fi
}
crear(){
    validar 1 $# || return 1
    if [ -d $1 ]; then
    echo "$1 ya existe"
    else
    mkdir -p $1
    echo "$1 ya creado"
    fi
}

#crear correccion

buscar(){
    if [ -d $1 ]; then
    validar 2 $# || return 1
    #bytes=$(( $2 * 1024 * 1024 ))
    resultado=$( find $1 -size +$2'M' )
        if [ -z "$resultado" ]; then
            echo "no hay archivos mayores de $2 MB"
        else 
            echo $resultado
        fi
    else
    echo "la carpeta debe existir"
    return 1
    fi
}



buscar_ext(){
    validar 2 $# || return 1
    if [ -d $1 ]; then
    resultado=$( find -type f $1 -name "*.$2" )
        if [ -z "$resultado" ]; then
            echo "no hay archivos con esa extension"
        else 
            echo $resultado
        fi
    else
    echo "la carpeta debe existir"
    return 1
    fi
}
#buscar_ext $@

cambiar_permisos(){
    validar 2 $# || return 1
    if [[ $1 =~ ^[0-7]{3,4}$ ]]; then
        chmod $@ &> /dev/null || ( echo "algun archivo no es accesible"; return 1 ) && echo "se han cambiado bien"
    else
        echo "el primer argumento debe ser un permiso" 
        return 1
    fi
}
#cambiar_permisos $@

propietario(){
    validar 1 $#
    prop=$( ls -l $@ | awk '{print $9,$3,$4}')
    echo "$prop"
}
#propietario $@

puerto_abierto(){
nc -z $1 $2 &> /dev/null && echo "$2 abierto en $1"  || echo "$2 cerrado en $1"
}
#puerto_abierto $@

tamanio_dir(){
tamanio=$( ls -l $@ | awk '{print $5 }' )
tamanio=$(( $tamanio / 8  ))
echo $tamanio
}
#tamanio_dir $@

respaldo(){
    fecha=$( date +%Y%m%d_%H%M%S )
    nombre_archivo=$( echo $1 | cut -d"." -f1 )
    echo $nombre_archivo
    cp $1 $nombre_archivo'.bak-'$fecha
}
#respaldo $@

conectividad(){
    validar 1 $#
    ping -c 1 $1 &> /dev/null && echo "$1 responde"  || echo "$1 no responde"
}

#conectividad $@