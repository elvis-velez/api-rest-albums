# API_REST ÁLBUMES  
*Proyecto Ingeniería de Software*

---

## Estructura

- Código fuente (API REST)  
- Archivo `docker-compose.yml` 

### Estructura de la API REST

- **Controladores**  
- **Entidades**  
- **Excepciones**  
- **Repositorios**  
- **Servicios**

El archivo `docker-compose.yml` permite levantar el proyecto mediante Docker.

---

## Cómo levantar el proyecto con Docker

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/elvis-velez/api-rest-albums.git

2. Mediante Maven, ir al apartado de proyecto → lifecycle y correr la fase package (ejecutar 'proyecto [package]').

3. Levantar los contenedores Docker con:

     `docker compose build `
     `docker compose up `

# Acceder a la API REST
Usar Postman la URL:

  `http://localhost:8080/api/v1/albums/`


# Ejecución de proyecto con docker

`GET http://localhost:8080/api/v1/albums/` – Obtener todos los albumes

`GET http://localhost:8080/api/v1/albums/1` – Obtener todos los albumes

`POST http://localhost:8080/api/v1/albums/` – Crear nuevo album

`PUT http://localhost:8080/api/v1/albums/1` - Editar album

`PATCH http://localhost:8080/api/v1/albums/1` - Actualización parcial

`DELETE http://localhost:8080/api/v1/albums/1` - Eliminar álbum

