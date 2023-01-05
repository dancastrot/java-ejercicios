##Aplicación Jugadores

#Descripción
Programa que permite generar lista de jugadores con atributos básicos.

Además, es posible elegir entre generar un fichero txt o csv con los datos para su posterior
importación y exportación. En ambas versiones se almacena cada usuario separado por comas.

En la versión actual, para elegir entre generar un tipo de fichero u otro es necesario intervenir manualmente
en la clase JugadorService, cambiando la instancia de JugadorDB.

#Entidades
Clase Jugador
*String nombre
*String apellido
*String nacionalidad
*String equipo

#Repositorios
*JugadorDB (abstracta)
*JugadorDBCsv
*JugadorDBFichero

#Service
*listar
*buscar
*agregar
*editar
*eliminar

