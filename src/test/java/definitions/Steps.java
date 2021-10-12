package definitions;
import datos.Datos;
import io.cucumber.core.internal.gherkin.StringUtils;
import model.Persona;
import page.*;
import cucumber.api.java.en.*;


public class Steps {

        //Selecionar boton ingresar en el home
        @Given("^el usuario se encuentra en el home$")
        public void elUsuarioSeEncuentraEnElHome () throws InterruptedException {
            System.out.println("el usuario se encuentra en el Home Page");
        }

        @When("^presiona el boton ingresar$")
        public void presionaElBotonIngresar () throws InterruptedException {
            HomePage.setBtnIngresarHome();
            Thread.sleep(2000);
        }
        @Then("se debe visualizar el titulo \"([^\"]*)\"$")
        public void seDebeVisualizarElTitulo (String titulo) throws InterruptedException {
            HomePage.setTituloLogin(titulo);
        }
        //Validar que boton ingresar en el login este deshabilitado
        @Given("^el usuario se encuentra en el home para validar boton ingresar en el login$")
        public void elUsuarioSeEncuentraEnElHomeParaValidarBotonIngresarEnElLogin () throws InterruptedException {
            System.out.println("el usuario se encuentra en el Home Page");
        }

        @When("^presiona boton ingresar para acceder al login$")
        public void presionaBotonIngresarParaAccederAlLogin () throws InterruptedException {
            HomePage.setBtnIngresarHome();
            Thread.sleep(2000);
        }

        @Then("^el boton ingresar en el login debe estar deshabilitado$")
        public void elBotonIngresarEnElLoginDebeEstarDeshabilitado () throws InterruptedException {
            HomePage.setSubmitIngresarDisabled();
        }
        //Validar alerta cuando se ingresa un rut no valido
        @Given("^el usuario se encuentra en el home para validar alerta de rut invalido$")
        public void el_usuario_se_encuentra_en_el_home_para_validar_alerta_de_rut_invalido () {
            System.out.println("Usuario se encuantra en el Home");
        }

        @When("^presiona el boton ingresar para validar alerta de rut invalido$")
        public void presiona_el_boton_ingresar_para_validar_alerta_de_rut_invalido () throws InterruptedException {
            HomePage.setBtnIngresarHome();
        }

        @When("^ingresa un rut invalido$")
        public void ingresa_un_rut_invalido () throws InterruptedException {
            HomePage.setIgresarRutInvalido();
            HomePage.setInputClave(Datos.setRutCliente());
        }

        @Then("^se debe visualizar mensaje de alerta de rut no valido$")
        public void se_debe_visualizar_mensaje_de_alerta_de_rut_no_valido () throws InterruptedException {
            HomePage.setMessageErrorRut();
        }
        //Validar alerta cuando se ingresa una clave no valida
        @Given("^el usuario se encuentra en el home para validar alerta de clave invalida$")
        public void el_usuario_se_encuentra_en_el_home_para_validar_alerta_de_clave_invalida () {
            System.out.println("usuario esta en el Home");
        }

        @When("^presiona el boton ingresar para validar alerta de clave invalida$")
        public void presiona_el_boton_ingresar_para_validar_alerta_de_clave_invalida () throws InterruptedException {
            HomePage.setBtnIngresarHome();
        }

        @When("^ingresa una clave invalida$")
        public void ingresa_una_clave_invalida () throws InterruptedException {
            HomePage.setIngresarClaveInvalida();
            Thread.sleep(2000);
            HomePage.setInputRut(Datos.setRutCliente());
        }

        @Then("^se debe visualizar mensaje de alerta de clave no valida$")
        public void se_debe_visualizar_mensaje_de_alerta_de_clave_no_valida () throws InterruptedException {
            HomePage.setMessageErrorClave();
        }
        //Validar login exitoso
        @Given("^el usuario se encuentra en el home para realizar login$")
        public void el_usuario_se_encuentra_en_el_home_para_realizar_login () {
            System.out.println("Usuario se encuentra en el Home");
        }

        @When("^presiona el boton igresar del home para realizar login$")
        public void presiona_el_boton_igresar_del_home_para_realizar_login () throws InterruptedException {
            HomePage.setBtnIngresarHome();
        }

        @When("^ingresa su rut$")
        public void ingresa_su_rut () throws InterruptedException {
            HomePage.setInputRut(Datos.setRutCliente());
        }

        @When("^ingresa su clave$")
        public void ingresa_su_clave () throws InterruptedException {
            HomePage.setInputClave(Datos.setClaveCliente());
        }

        @When("^presiona el boton ingresar en el login$")
        public void presiona_el_boton_ingresar_en_el_login () throws InterruptedException {
            HomePage.setSubmitIngresar();
        }

        @Then("^se debe ingresar al sitio privado del banco santander$")
        public void se_debe_ingresar_al_sitio_privado_del_banco_santander () throws InterruptedException {

            PrivatePage.setValidarLogin();
        }
        @Given("^el usuario se encuentra en el home para realizar una consulta de saldo$")
        public void el_usuario_se_encuentra_en_el_home_para_realizar_una_consulta_de_saldo () {
            System.out.println("Usuario se encuentra en el Home");
        }

        @When("^presiona el boton igresar del home para realizar una consulta de saldo$")
        public void presiona_el_boton_igresar_del_home_para_realizar_una_consulta_de_saldo () throws
        InterruptedException {
            HomePage.setBtnIngresarHome();
        }

        @When("^ingresa su rut para realizar una consulta de saldo$")
        public void ingresa_su_rut_para_realizar_una_consulta_de_saldo () throws InterruptedException {
            HomePage.setInputRut(Datos.setRutCliente());
        }

        @When("^ingresa su clave para realizar una consulta de saldo$")
        public void ingresa_su_clave_para_realizar_una_consulta_de_saldo () throws InterruptedException {
            HomePage.setInputClave(Datos.setClaveCliente());
        }

        @When("^presiona el boton ingresar en el login para realizar una consulta de saldo$")
        public void presiona_el_boton_ingresar_en_el_login_para_realizar_una_consulta_de_saldo () throws
        InterruptedException {
            HomePage.setSubmitIngresar();
        }

        @When("^selecciona cuentas$")
        public void selecciona_cuentas () throws InterruptedException {
            PrivatePage.setSeleccionarCuenta();
        }

        @When("^selecciona cuentas vistas$")
        public void selecciona_cuentas_vistas () throws InterruptedException {
            PrivatePage.setSeleccionarCuentaVista();
        }

        @When("^selecciona saldos$")
        public void selecciona_saldos () throws InterruptedException {
            PrivatePage.setSeleccionarSaldo();
        }

        @When("^selecciona cuenta vista diez por ciento$")
        public void selecciona_cuenta_vista_diez_por_ciento () throws InterruptedException {
            PrivatePage.setSeleccionarCuentaPersonal();
            System.out.println("pasooo esta wea");
        }

        @When("^presiona el boton aceptar$")
        public void presiona_el_boton_aceptar () throws InterruptedException {
            System.out.println("llegue aca ");
            //PrivatePage.setSeleccionarAceptar();
        }

        @Then("^se debe visualizar el saldo de cuenta diez por ciento$")
        public void se_debe_visualizar_el_saldo_de_cuenta_diez_por_ciento () throws InterruptedException {
            PrivatePage.setValidarSaldo();
        }




}


