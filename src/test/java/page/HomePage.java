package page;
import org.junit.Assert;
import utilities.*;

import definitions.*;

import java.sql.SQLException;


public class HomePage {


    public static String btnIngresarHome = "//*[@id='btnIngresar']";
    //public static String tituloLogin = "//h6[contains(text(),'Ingresa a tu banco')]";
    public static String inputRut = "/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div/input[1]";
    public static String inputClave = "//input[@type='password']";
    public static String submitIngresar = "//button[@type='submit']";
    public static String inputRutInvalid = "//*[@class='cajaInput invalid']";
    public static String inputClaveInvalid = "//*[@class='cajaInput invalid']";

    public static void setBtnIngresarHome() throws InterruptedException
    {
        Utilities.esperarElementoWebBci(btnIngresarHome).click();
        Thread.sleep(2000);
    }
    public static void setTituloLogin(String valorActual) throws InterruptedException {
        Assert.assertTrue("", Utilities.esperarElementoWebBci("//h6[contains(text(),'"+valorActual+"')]").isDisplayed());
        Thread.sleep(2000);

    }
    public static void setInputRut(String valorActual) throws InterruptedException, SQLException {
        Utilities.esperarElementoWebBci(inputRut).sendKeys(valorActual);
        Thread.sleep(2000);
    }
    public static void setInputClave(String valorActual) throws InterruptedException, SQLException {
        Utilities.esperarElementoWebBci(inputClave).sendKeys(valorActual);
        Thread.sleep(2000);
    }
    public static void setSubmitIngresar() throws InterruptedException
    {
        Utilities.esperarElementoWebBci(submitIngresar).click();
        Thread.sleep(2000);
    }
       public static void setIgresarRutInvalido() throws InterruptedException
    {
        Utilities.esperarElementoWebBci(inputRut).sendKeys("165442");
        Thread.sleep(2000);
    }
    public static void setIngresarClaveInvalida() throws InterruptedException
    {
        Utilities.esperarElementoWebBci(inputClave).sendKeys("198");
        Thread.sleep(2000);
    }
    public static void setMessageErrorRut() throws InterruptedException {
        Assert.assertTrue(Utilities.esperarElementoWebBci(inputRutInvalid).isDisplayed());
        Thread.sleep(2000);
    }
    public static void setMessageErrorClave() throws InterruptedException {
        Assert.assertTrue(Utilities.esperarElementoWebBci(inputClaveInvalid).isDisplayed());
        Thread.sleep(2000);
    }
    public static void setSubmitIngresarDisabled() throws InterruptedException {
        Utilities.esperarElementoWebBci(submitIngresar).getAttribute("disable");
        Thread.sleep(2000);
    }
}
