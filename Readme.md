https://www.paradigmadigital.com/dev/testeando-javascript-mocha-chai/

MOCHA.JS
Mocha es un framework de pruebas de JavaScript que se ejecuta en Node.js. 
Nos da la posibilidad de crear tanto tests síncronos como asíncronos de una forma muy sencilla. 
Nos proporciona muchas utilidades para la ejecución y el reporte de los tests.

CHAI.JS
Es un librería de aserciones, la cual se puede emparejar con cualquier marco de pruebas de Javascript. 
Chai tiene varias interfaces: assert, expect y should, que permiten al desarrollador elegir el estilo 
que le resulte más legible y cómodo a la hora de desarrollar sus tests:

*****************************************************************************

Qué es Selenium Webdriver
Es una librería que permite interactuar con los elementos de una web

Qué es Cucumber
Es una librería para escribir en lenguaje amigable el comportamiento del sistema (BDD)

*******************************************************************************


## POM
Lo usamos para tener centralizados y organizados los elementos -> "no tener que cambiar un ID en mil sitios"

#Page Object Class
Se usa para modelar una página, es decir, representar las interacciones que un usuario puede hacer con esa página
-> Identificar elementos web (WebElement): por ej, un botón

-> Identificar acciones con ellos: por ej, click en el botón   

* Los tests usan las acciones, y realizan los asserts correspondientes

## ScreenPlay
Usa "serenitybdd"
Modela según tareas (acciones que hacer) y actores.
Por ejemplo, en una página de login, modela la tarea de "hacer login", y luego cómo la puede hacer cada tipo de usuario (cad actor)

actor.can -> abrir el navegador
actor.wasAbleTo -> entrar en la página
actor.attempsTo -> realizar acción

Desventaja: más complicado de mantener, difícil separar responsabilidades entre clases, más curva de aprendizaje