# Taller-02-AREP

## Gestor de Tareas - Framework Web Ligero en Java

## 📖 Descripción
Este proyecto consiste en un framework web ligero desarrollado en Java, diseñado para facilitar la creación de aplicaciones web que integren servicios REST y la gestión de archivos estáticos (HTML, CSS, JavaScript, imágenes, entre otros).

El framework ofrece:

- Mecanismos sencillos para definir rutas REST mediante funciones lambda.

- Configuración flexible para establecer la ubicación de los archivos estáticos que el servidor expone

- Eliminar tareas con un clic.

- Persistencia en memoria (las tareas se manejan en un arreglo JSON durante la ejecución del servidor).

## ⚙️ Instalación

1. Clona este repositorio o descarga los archivos:  
   ```bash
   git clone https://github.com/juanescan/Taller-02-AREP.git
   cd Taller-02-AREP
2. Compila el proyecto con Maven:
   ```bash
   mvn clean install
3. Asegúrate de tener Java 11+ y Maven instalados.
## ▶️ Ejecución
     mvn exec:java -Dexec.mainClass="eci.arep.juancancelado.mavenproject1.HttpServer"

 El servidor se ejecutará en el puerto 8080:
 
 👉 http://localhost:8080

 ## ✨Características Principales

 - Servidor HTTP en Java puro: desarrollado sin frameworks externos, usando únicamente ServerSocket.
 
 - Soporte para archivos estáticos: sirve páginas HTML, estilos CSS, scripts JavaScript e imágenes desde la carpeta pública del proyecto.

 - Servicios REST ligeros: permite definir rutas para exponer datos y manejar solicitudes desde el frontend.

 - Manejo de parámetros: extracción de valores enviados en la URL (query params) para procesar las peticiones.

 - Gestión de tareas en memoria: el servidor mantiene un arreglo JSON con las tareas activas durante la ejecución.

 - Operaciones CRUD básicas: agregar, listar y eliminar tareas a través de la API REST.

 - Comunicación asíncrona: el frontend usa fetch() para interactuar dinámicamente con el backend sin recargar la página.

 - Arquitectura modular y extensible: fácil de ampliar con nuevas rutas REST o nuevos recursos estáticos. 


 ## 🏗️ Arquitectura

El sistema está compuesto por dos capas principales:

1. Servidor HTTP en Java (Backend)

- Maneja conexiones mediante ServerSocket.

- Responde archivos estáticos desde la carpeta public/.

- Expone un API REST /tasks con soporte para:

- GET /tasks → Listar tareas en JSON.

- POST /tasks?name=X&type=Y → Agregar tarea.

- DELETE /tasks?name=X&type=Y → Eliminar tarea.

2. Aplicación Web (Frontend)
- index.html: interfaz gráfica.

- style.css: estilos.

- script.js: comunicación con el servidor usando fetch() (asíncrono).

- La lista de tareas se actualiza dinámicamente en la página. 

## 🖥️ Ejemplo de uso del framework con Lambda
1. Codigo
```java
        public static void main(String[] args) throws Exception {
    staticfiles("src/main/webapp");

    get("/App/hello", (req,res) -> "Hello " + req.getValues("name"));
    get("/App/pi", (req,res) -> String.valueOf(Math.PI));

    start(8080);
} 
```

2. Http respuestas
- GET `/App/hello?name=Juan`:
   - Respuesta: `Hello Juan`
- GET `/App/pi`:
    - Respuesta: `3.141592653589793`     
- GET `/tasks`:
    - Respuesta:`[{"name":"jugar","type":"casa"}]` 

## Estructura 
```
src/
  main/
    java/
      eci/
        arep/
         juancancelado/ 
            mavenproject1/
            HttpServer.java       # Clase principal del servidor
            Request.java          # Maneja las solicitudes HTTP
            Response.java         # Maneja las respuestas HTTP
            Route.java/           # interfaz
    webroot/                    # Carpeta de archivos estáticos             
        index.html              # Archivo HTML
        styles.css              # Archivo CSS
        script.js               # Archivo JavaScript
        fondo.png               # Fondo de el html

  test/
    java/                       # Pruebas unitarias
pom.xml                         # Archivo de configuración de Maven
README.md                       # Documentación del proyecto

```

## Pruebas
 
 ![imagenes](/imagenes/prueba1.png)



## APP

![App](/imagenes/APP1.png)

![App](/imagenes/APP2.png)

![App](/imagenes/APP3.png)

![App](/imagenes/APP4.png) 

![App](/imagenes/APP5.png) 

## Built With

- Java SE - Lenguaje de programación

- Maven - Herramienta de gestión de dependencias y construcción

## Authors 
- Juan Esteban Cancelado Sanchez - *AREP* *Taller 1* - [juanescan](https://github.com/juanescan)