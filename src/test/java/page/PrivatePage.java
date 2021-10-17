package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.*;

import java.util.List;

public class PrivatePage {

    public static String tituloPrivado = "//*[@id='idspan1']/strong[contains(text(),'MARIO LUIS')]";
    public static String seleccionarCuenta = "//*[@id='CU1']";
    public static String seleccionarCv = "//*[@id='CV2']/a";
    public static String seleccionarSaldo = "//*[@id='SV3']/a";
    public static String cuentaPersonal = "//*[contains(text(),'Cuenta Vista 10% 0-070-64-56616-9')]";
    public static String btnAceptar = "/html/body/center/table[1]/tbody/tr/td/table/tbody/tr[3]/td/input";
    public static String validarSaldo = "//*[contains(text(),'SALDO Cuenta')]";


    public static void setValidarLogin() throws InterruptedException {
        WebElement iframeElement = Utilities.driver.findElement(By.id("1"));
        Utilities.driver.switchTo().frame(iframeElement);
        Thread.sleep(2000);
        Assert.assertTrue(Utilities.esperarElementoWebBci(tituloPrivado).isDisplayed());
    }

    public static void setSeleccionarCuenta() throws InterruptedException {
        WebElement iframeElement = Utilities.driver.findElement(By.id("2"));
        Utilities.driver.switchTo().frame(iframeElement);
        Thread.sleep(2000);
        Utilities.esperarElementoWebBci(seleccionarCuenta).click();
    }
    public static void  setSeleccionarCuentaVista() throws InterruptedException {
        Thread.sleep(2000);
        Utilities.esperarElementoWebBci(seleccionarCv).click();
    }
    public static void setSeleccionarSaldo() throws InterruptedException {
        Thread.sleep(2000);
        Utilities.esperarElementoWebBci(seleccionarSaldo).click();
    }
    public static void setSeleccionarCuentaPersonal() throws InterruptedException {

        WebElement iframeElement1 = Utilities.driver.findElement(By.id("p4"));
        Utilities.driver.switchTo().frame(iframeElement1);
        System.out.println("paso el iframe");
        Thread.sleep(1000);
        //Utilities.esperarElementosWebListBci(cuentaPersonal).get(1).click();
        Utilities.esperarElementoWebBci(cuentaPersonal).click();
    }
    public static void setSeleccionarAceptar() throws InterruptedException {
        Utilities.esperarElementoWebBci(btnAceptar).click();
        Thread.sleep(2000);
    }
    public static void setValidarSaldo() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Utilities.esperarElementoWebBci(validarSaldo).isDisplayed());
    }
}
