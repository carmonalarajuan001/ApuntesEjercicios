# **Apuntes de Entornos de Desarrollo: UNIDAD 1**

## *1. Introducción Git y Github*

### 1.1 Significado de git y características

Git es un sistema de control de versiones que funciona como una "máquina del tiempo" para proyectos de software, permitiendo guardar "instantáneas" (commits) del código en diferentes momentos.

Algunas de las características que tiene git es su manera de controlar las versiones, el seguimiento detallado de los cambios que se realizan en los repositorios y la fusión de ramas de la misma aplicación

### 1.2 Historia y evolución de git

Git fue creado por Linus Torvalds en 2005, como alternativa al sistema BitKeeper, después de que se revocara su licencia gratuita para el desarrollo del kernel de Linux. El objetivo era crear un sistema de control de versiones rápido, distribuido y capaz de manejar proyectos grandes y complejos

### 1.3 ¿Qué es GitHub y por qué usarlo?

GitHub es una plataforma basada en la nube donde puedes almacenar, compartir y trabajar junto con otros usuarios para escribir código. Se usa mayoritariamente para controlar y ver archivos desde diferentes versiones sirviendo el mismo como intermediario.

### 1.4 Diferencias Esenciales entre Git y GitHub

La principal diferencia entre Git y GitHub es que Git es un sistema de control de versiones que permite a los desarrolladores gestionar el historial de sus proyectos localmente, mientras que GitHub es una plataforma basada en la nube que permite alojar repositorios de Git y facilita la colaboración en equipo.

## *2. Instalación y Configuración Avanzada de Git*

### 2.1. Instalación de git en linux y windows

Existen varias maneras de instalar git desde la terminal, la forma en la que se hace varía dependiendo del sistema operativo a través del que se vaya a realizar la instalación, por ejemplo, para linux sería "sudo apt update" y "sudo apt install git" desde la misma terminal del ordenador.

En Windows, Git se instala utilizando un instalador gráfico. Puedes descargar el instalador desde la página oficial de Git.
Pasos para la instalación en Windows:

    Descarga el archivo .exe desde el sitio web.
    Ejecuta el instalador y sigue las instrucciones, seleccionando las opciones predeterminadas a menos que necesites configuraciones personalizadas.
    Tras la instalación, podrás utilizar Git tanto desde la terminal Git Bash como desde la línea de comandos (CMD) de Windows.

### 2.2. Asociación de nombre y correo electrónico

Para configurar tu nombre y correo electrónico, ejecuta los siguientes comandos en la terminal:

    git config --global user.name "Tu Nombre"
    git config --global user.email "tuemail@ejemplo.com"
--global se asegura de que esta configuración sea válida para todos los proyectos

### 2.3. Verificación de la Instalación y Configuración Correcta

Verificación de instalación: "git --version", esto debería devolver: "git version 2.34.1"

Verificación del usuario:

    "git config --list" 
    La terminal debería contestar con:
    "user.name=Juan Pérez" "user.email=juan.perez@ejemplo.com"

## *3. Fundamentos avanzados git

### 3.1. Concepto de repositorio

Un repositorio es un almacén digital o un lugar centralizado donde se guardan y organizan diversos tipos de archivos y datos. Permite buscar, acceder, y gestionar eficientemente estos recursos a través de internet

### 3.2. Crear un repositorio local

Ejecuta el siguiente comando

    git init

Ejemplo:

    cd proyecto
    git init

### 3.3. Ciclo de Vida de los Archivos en Git

1. Creas un nuevo archivo main.py. Al principio, este archivo está en estado untracked.
2. Ejecutas git add main.py, lo que lo mueve al estado staged.
3. Finalmente, confirmas el cambio con git commit -m "Añadir main.py", cambiando su estado a committed.

### 3.4. Comandos Básicos de Git: git init, git add, git commit

#### *3.4.1. Iniciar un repositorio*

    git init

#### *3.4.2. Agregar archivos al área de preparación (staging area):*

    git add archivo.txt     Para un archivo específico

    git add .               Para todos los archivos modificados o nuevos

#### *3.4.3. Hacer un commit (confirmar cambios):*

    git commit -m "Descripción del cambio"

### 3.5. Seguimiento de Cambios con git status y git log

#### *3.5.1. Ver el estado actual del repositorio con git status*

    git status

#### 3.5.2. *Ver el historial de commits con git log*

    git log 

## 4. Trabajo avanzado con github

### 4.1. Crear un Repositorio en GitHub

Pasos para crear un repositorio en GitHub

1. Inicia sesión en tu cuenta de GitHub en github.com.
2. En la esquina superior derecha, haz clic en el botón "New Repository" o accede a la pestaña Repositories de tu perfil y selecciona "New".
3. Proporciona un nombre para el repositorio, elige si deseas que sea público o privado, y añade una breve descripción si lo consideras necesario.
4. Opcionalmente, puedes inicializar el repositorio con un archivo README.md (que servirá para documentar el proyecto), un archivo .gitignore (que especifica qué archivos no deben ser rastreados por Git), y seleccionar una licencia para el código.

### 4.2. Conectar un Repositorio Local con GitHub

-Comando para enlazar el repositorio local:

    git remote add origin https://github.com/usuario/repo.git

~origin: Es el nombre por defecto que se utiliza para referirse al repositorio remoto

~https://github.com/usuario/repo.git: Es la URL del repositorio remoto. Debes reemplazar usuario con tu nombre de usuario en GitHub y repo con el nombre de tu repositorio.

### 4.3. Subir Cambios al Repositorio Remoto con git push

Comando para subir cambios:

    git push origin master

~origin: Hace referencia al repositorio remoto que configuraste previamente.

~master: Es la rama principal del proyecto.

### 4.4. Clonar un Repositorio con git clone

Comando para clonar un repositorio

    git clone https://github.com/usuario/repo.git 

### 4.5. Descargar Actualizaciones del Repositorio Remoto con git pull

Este comando hace dos cosas:

1. Descarga los nuevos commits del repositorio remoto.
2. Fusiona esos commits con tu rama actual.

Comando para descargar actualizaciones:

    git pull origin master

~origin: Hace referencia al repositorio remoto configurado.

~master: Es la rama desde la cual deseas descargar los cambios. Si trabajas en una rama diferente, deberías reemplazar master con el nombre de esa rama.

## 5. Colaboración en Proyectos con Git y GitHub

### 5.1. Trabajando con Ramas: git branch, git checkout

Crear una nueva rama:

    git branch nombre_rama

Cambiar a una rama existente:

    git checkout nombre_rama

Crear y cambiar a una nueva rama en un solo paso:

    git checkout -b nombre_rama

### 5.2. Fusionar Ramas: git merge

Comando para fusionar ramas:

    git merge nombre_rama

### 5.3. Resolver Conflictos de Fusión

Pasos para resolver conflictos

1. Abre los archivos en conflicto. Verás que Git ha marcado las secciones en conflicto con delimitadores como <<<<<<<, =======, y >>>>>>>.
2. Revisa ambos cambios y edita el archivo para resolver el conflicto.
3. Una vez resuelto, agrega los archivos modificados al área de preparación (git add archivo.txt).
4. Haz un commit para finalizar la fusión:

        git commit -m "Resolver conflicto en archivo.txt"

### 5.4. Pull Requests y Revisión de Código en GitHub

1. Sube tu rama al repositorio remoto usando git push:

        git push origin nombre_rama

2. En GitHub, ve al repositorio y encontrarás un botón para crear una pull request desde la rama que acabas de subir.
3. Proporciona un título y una descripción que expliquen los cambios que has realizado.
4. Otros desarrolladores del equipo podrán revisar, comentar y aprobar los cambios. Una vez aprobado, la rama puede fusionarse con la rama principal.

### 5.5. Buenas Prácticas en la Colaboración

1. Commits frecuentes
2. Comentarios en el código
3. Evitar commits grandes
4. Resuelve conflictos con cuidado

## 6. Conceptos Avanzados en git

### 6.1. Deshacer Cambios: git reset y git revert

Deshacer un commit de forma flexible:

    git reset

Deshacer un commit sin perder los cambios:

    git reset --soft HEAD^      "HEAD": se refiere al commit anterior

Deshacer un commit y también los cambios:

    git reset --hard HEAD^      "hard": deshacer ultimo commit eliminar cambios en archivos

Revertir un commit sin alterar el historial

    git revert <commit_id>      "revert": para no alterar el historial

## 6.2. Git Stash: Guardar Cambios Temporalmente

Guardar cambios temporalmente

    git stash

Recuperar los cambios guardados

    git stash pop

## 6.3. Gestión de Tags y Releases

Crear un tag:

    git tag v1.0.0      v1.0.0 es el nombre del tag. 

Subir un tag a GitHub:

    git push origin v1.0.0