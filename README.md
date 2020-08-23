# avalithspring
Este es un ejemplo de un api REST Spring Boot, que tiene implementados 4 verbos HTTP:

GET POST PUT DELETE

Para esta implementación se ha considerado el uso una lista de objetos Developer y se ha utilizado los siguiente recursos:

CONTROLLER

Implicitamente se encuentran implementadas las rutas y las acciones en el paquete com\bolivarespin\api\demo\controller, en el archivo: DeveloperController.java

MODELO

Se encuentran implementado en el paquete com\bolivarespin\api\demo\model, en el archivo: Developer.java


CONSUMO DE API

Las llamadas al API se debe hacerlas de la siguiente manera:

GET : [DominioAplicacion]/developers

POST: [DominioAplicacion]/developers 
Los campos que se deben enviar son: id de tipo entero, nombres_completos, link_github, tecnologias_conocidas, estos últimos todos son campos de tipo texto.

PUT: [DominioAplicacion]/developers/{id} 
Los campos que se deben enviar son: id de tipo entero, nombres_completos, link_github, tecnologias_conocidas, estos últimos todos son campos de tipo texto.

DELETE: [DominioAplicacion]/developers/{id}
