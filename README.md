API_REST ALBUMES
Proyecto Ingeniería de software.

Estructura
Codigo fuente (API REST)
Archivo Docker Compose

Estructura Api Rest
Controladores
Entidades
Excepciones
Repositorios
Servicios

El archivo docker-compose.yml permite levantar el proyecto mediante Docker.

Cómo levantar el proyecto en docker

clone el repositorio:

git clone https://github.com/elvis-velez/api-rest-albums.git

mediante Maven ir al apartado de proyecto - lifecycle y correr el package "run 'proyecto [package]'"


levante los contenedores en Docker con los siguientes codigos

docker compose build
docker compose up

acceda al api rest

http://localhost:8080/api/v1/albums/

Ejecución de proyecto con docker

POSTMAN:
GET http://localhost:8080/api/v1/albums/ – Obtener todos los albumes
GET http://localhost:8080/api/v1/albums/1 – Obtener todos los albumes
POST http://localhost:8080/api/v1/albums/ – Crear nuevo album
PUT http://localhost:8080/api/v1/albums/1 - Editar album
PATCH http://localhost:8080/api/v1/albums/1 - Actualización parcial
DELETE http://localhost:8080/api/v1/albums/1 - Eliminar álbum
