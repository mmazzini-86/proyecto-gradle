$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/test.feature");
formatter.feature({
  "name": "home banco santander",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Selecionar boton ingresar en el home",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test01"
    }
  ]
});
formatter.step({
  "name": "el usuario se encuentra en el home",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton ingresar",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "se debe tener acceso al login del banco santander",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Validar que boton ingresar en el login este deshabilitado",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario se encuentra en el home para validar boton ingresar en el login",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona boton ingresar para acceder al login",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "el boton ingresar en el login debe estar deshabilitado",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Validar alerta cuando se ingresa un rut no valido",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario se encuentra en el home para validar alerta de rut invalido",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton ingresar para validar alerta de rut invalido",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ingresa un rut invalido",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "se debe visualizar mensaje de alerta de rut no valido",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Validar alerta cuando se ingresa una clave no valida",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario se encuentra en el home para validar alerta de clave invalida",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton ingresar para validar alerta de clave invalida",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ingresa una clave invalida",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "se debe visualizar mensaje de alerta de clave no valida",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Realizar login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario se encuentra en el home para realizar login",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton igresar del home para realizar login",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ingresa su rut",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ingresa su clave",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton ingresar en el login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "se debe ingresar al sitio privado del banco santander",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "realizar consulta de saldo a cuenta 10 por ciento",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario se encuentra en el home para realizar una consulta de saldo",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton igresar del home para realizar una consulta de saldo",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ingresa su rut para realizar una consulta de saldo",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ingresa su clave para realizar una consulta de saldo",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton ingresar en el login para realizar una consulta de saldo",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selecciona cuentas",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selecciona cuentas vistas",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selecciona saldos",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selecciona cuenta vista 10 por ciento",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "presiona el boton aceptar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "se debe visualizar el saldo de cuenta 10 por ciento",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});