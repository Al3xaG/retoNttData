# Introduction
PRUEBA TÈCNICA - ARQUITECTURA DE MICROSERVICIOS

# Started

Clonar el proyecto del siguiente repositorio:
- https://github.com/Al3xaG/retoNttData.git

# Docker

Construir el archivo JAR para el tema de Docker
- mvnw package

En caso de que salga este mensaje al ejecutar el comando anterior:

mvnw : El término 'mvnw' no se reconoce como nombre de un cmdlet, función, archivo de script o programa ejecutable. Compruebe si escribió correctamente el nombre o, si incluyó una ruta de acceso, compruebe que dicha ruta es correcta e    
inténtelo de nuevo.

Ejecutar el siguiente comando:

- ./mvnw package

Construir la imagen de docker con el siguiente comando:

- docker build -t "my-app" .

Ejecucion de imagen docker y despliegue con el siguiente comando:

- docker run -p 8080:8080 "my-app"