# CRUD RESTful API con Spring Boot

Este proyecto es una API RESTful que implementa las operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para gestionar tareas. Utiliza Spring Boot y Spring Data JPA para proporcionar una interfaz de API para administrar tareas.

## Instrucciones de Ejecución

Para ejecutar esta aplicación, sigue estos pasos:

1. Asegúrate de tener Java JDK y Maven instalados en tu sistema.
2. Clona este repositorio en tu máquina local:

   ```
      git clone https://github.com/tuusuario/tuproyecto.git
    ```


La aplicación se ejecutará en http://localhost:8080. Puedes acceder a la API a través de esta URL.

## Endpoints de la API
* GET /api-restful/v1/tareas: Obtiene todas las tareas.
* GET /api-restful/v1/tareas/{TareaId}: Obtiene una tarea por su ID.
* POST /api-restful/v1/tareas: Crea una nueva tarea.
* DELETE /api-restful/v1/tareas/{tareaId}: Elimina una tarea por su ID.

## Estructura del Proyecto
El proyecto consta de las siguientes partes principales:

* RestfulApiApplication.java: La clase principal que inicia la aplicación Spring Boot.
* TareasController.java: Controlador que define los endpoints de la API.
* Tareas.java: Entidad de tarea que se mapea a la base de datos.
* ITareasRepository.java: Repositorio JPA para la entidad de tarea.
* TareasService.java: Servicio que proporciona lógica de negocio para las operaciones CRUD.

## Contribución
Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork de este repositorio en GitHub.
2. Clona tu fork en tu máquina local.
3. Crea una nueva rama para tu función o corrección: git checkout -b mi-funcion.
4. Realiza tus cambios y haz commits: git commit -m "Añade mi función".
5. Haz push a tu rama: git push origin mi-funcion.
6. Crea un pull request en GitHub.



