#!/bin/bash 

mostrar_manual() {
    echo "Manual de uso:"
    echo "./gestion.sh [opción] [argumentos]"
    echo ""
    echo "-m | --manual        Muestra este manual."
    echo "-d | --dir           Crea directorios basados en los argumentos dados."
    echo "                     Si un argumento es el carácter +, los directorios a partir de ese argumento"
    echo "                     se crean dentro del último directorio creado."
    echo "                     Si uno de los símbolos es -, subimos un escalón en la escala de directorios."
    echo ""
    echo "-p | --process       Lista todos los procesos en funcionamiento del usuario especificado"
    echo "                     en un archivo procesos_{usuario}_{fecha_hora}.log y muestra por pantalla"
    echo "                     el total de procesos en funcionamiento."
    echo ""
    echo "-l | --list          Lista todos los ficheros del directorio especificado en un archivo"
    echo "                     ficheros_{directorio}_{fecha_hora}.log (guardado en ese mismo directorio)"
    echo "                     y muestra el total de ficheros por pantalla."
    echo "                     Si no se proporciona argumento, se lista el home del usuario."
    echo ""
    echo "-k | --kill           Mata el proceso especificado como argumento (PID),"
    echo "                     solicitando confirmación antes de hacerlo."
    echo ""
    echo "-b | --backup         Crea una copia del directorio home del usuario y lo comprime"
    echo "                     en un archivo backup_{usuario}_{fecha_hora}.zip dentro de .backups."
    echo ""
    echo "-s | --sql            Devuelve la tabla resultante de una query."
    echo "                     El primer argumento será la base de datos, el segundo la tabla."
    echo "                     Si no hay más argumentos, se muestran todas las columnas."
    echo "                     Si hay más argumentos, son las columnas a mostrar de la tabla."
}

crear_directorios() {

    if [ $# -eq 0 ]; then
        echo "Error: debes indicar nombres de directorios."
        exit 1
    fi

    ruta_actual=$(pwd)
    pila=()

    for arg in "$@"
    do
        if [ "$arg" = "+" ]; then
            pila+=("$ruta_actual")
        elif [ "$arg" = "-" ]; then
            if [ ${#pila[@]} -gt 0 ]; then
                ruta_actual=${pila[-1]}
                unset pila[-1]
            fi
        else
            mkdir -p "$ruta_actual/$arg"
            ruta_actual="$ruta_actual/$arg"
        fi
    done

    echo "Directorios creados correctamente."
}

# ----------------------------------------------------

listar_procesos() {

    usuario=$1

    if [ -z "$usuario" ]; then
        echo "Error: debes indicar un usuario."
        exit 1
    fi

    fecha=$(date +"%Y%m%d_%H%M%S")
    archivo="procesos_${usuario}_${fecha}.log"

    ps -u "$usuario" > "$archivo"

    total=$(ps -u "$usuario" --no-headers | wc -l)

    echo "Procesos guardados en $archivo"
    echo "Total de procesos: $total"
}

# ----------------------------------------------------

listar_ficheros() {

    dir=$1

    if [ -z "$dir" ]; then
        dir="$HOME"
    fi

    if [ ! -d "$dir" ]; then
        echo "Error: el directorio no existe."
        exit 1
    fi

    fecha=$(date +"%Y%m%d_%H%M%S")
    nombre_dir=$(basename "$dir")

    archivo="$dir/ficheros_${nombre_dir}_${fecha}.log"

    ls -la "$dir" > "$archivo"

    total=$(ls -1 "$dir" | wc -l)

    echo "Listado guardado en $archivo"
    echo "Total de ficheros: $total"
}

# ----------------------------------------------------

matar_proceso() {

    pid=$1

    if [ -z "$pid" ]; then
        echo "Error: debes indicar un PID."
        exit 1
    fi

    if ! ps -p "$pid" > /dev/null
    then
        echo "Error: el proceso no existe."
        exit 1
    fi

    read -p "¿Seguro que quieres matar el proceso $pid? (s/n): " confirmacion

    if [ "$confirmacion" = "s" ]; then
        kill "$pid"
        echo "Proceso $pid terminado."
    else
        echo "Operación cancelada."
    fi
}

# ----------------------------------------------------

hacer_backup() {

    usuario=$(whoami)
    fecha=$(date +"%Y%m%d_%H%M%S")

    carpeta="$HOME/.backups"
    mkdir -p "$carpeta"

    archivo="$carpeta/backup_${usuario}_${fecha}.zip"

    zip -r "$archivo" "$HOME" > /dev/null

    echo "Backup creado en $archivo"
}

# ----------------------------------------------------





[ "$1" = "-m" ] || [ "$1" = "--manual" ] && mostrar_manual
[ "$1" = "-d" ] || [ "$1" = "--dir" ] && crear_directorios
[ "$1" = "-p" ] || [ "$1" = "--process" ] && listar_procesos
[ "$1" = "-l" ] || [ "$1" = "--list" ] && listar_ficheros
[ "$1" = "-k" ] || [ "$1" = "--kill" ] && matar_proceso
[ "$1" = "-b" ] || [ "$1" = "--backup" ] && hacer_backup
[ "$1" = "-s" ] || [ "$1" = "--sql" ] && 

