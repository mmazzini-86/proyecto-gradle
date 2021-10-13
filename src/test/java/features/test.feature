
Feature: home banco santander

  Scenario: Selecionar boton ingresar en el home
    Given el usuario se encuentra en el home
    When presiona el boton ingresar
    Then se debe visualizar el titulo "Ingresa a tu banco en línea"

  Scenario: Validar que boton ingresar en el login este deshabilitado
    Given el usuario se encuentra en el home para validar boton ingresar en el login
    When presiona boton ingresar para acceder al login
    Then el boton ingresar en el login debe estar deshabilitado

  Scenario: Validar alerta cuando se ingresa un rut no valido
    Given el usuario se encuentra en el home para validar alerta de rut invalido
    When  presiona el boton ingresar para validar alerta de rut invalido
    And ingresa un rut invalido
    Then se debe visualizar mensaje de alerta de rut no valido

  Scenario: Validar alerta cuando se ingresa una clave no valida
    Given el usuario se encuentra en el home para validar alerta de clave invalida
    When  presiona el boton ingresar para validar alerta de clave invalida
    And ingresa una clave invalida
    Then se debe visualizar mensaje de alerta de clave no valida
  @Test01
  Scenario: Realizar login
    Given el usuario se encuentra en el home para realizar login
    When presiona el boton igresar del home para realizar login
    And ingresa su rut
    And ingresa su clave
    And presiona el boton ingresar en el login
    Then se debe ingresar al sitio privado del banco santander

  Scenario: realizar consulta de saldo a cuenta diez por ciento
    Given el usuario se encuentra en el home para realizar una consulta de saldo
    When presiona el boton igresar del home para realizar una consulta de saldo
    And ingresa su rut para realizar una consulta de saldo
    And ingresa su clave para realizar una consulta de saldo
    And presiona el boton ingresar en el login para realizar una consulta de saldo
    And selecciona cuentas
    And selecciona cuentas vistas
    And selecciona saldos
    And selecciona cuenta vista diez por ciento
    And presiona el boton aceptar
    Then se debe visualizar el saldo de cuenta diez por ciento
