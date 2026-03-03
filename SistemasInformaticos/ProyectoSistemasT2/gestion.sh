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




[ "$1" = "-m" ] || [ "$1" = "--manual" ] && mostrar_manual
[ "$1" = "-d" ] || [ "$1" = "--dir" ] && 
[ "$1" = "-p" ] || [ "$1" = "--process" ] && 
[ "$1" = "-l" ] || [ "$1" = "--list" ] && 
[ "$1" = "-k" ] || [ "$1" = "--kill" ] && 
[ "$1" = "-b" ] || [ "$1" = "--backup" ] && 
[ "$1" = "-s" ] || [ "$1" = "--sql" ] && 

