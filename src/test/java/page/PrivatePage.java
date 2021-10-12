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
    public static String cuentaPersonal = "/html/body/center/table[1]/tbody/tr/td/table/tbody/tr[3]/td/input";  //*[@id='cta007064566169']";
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
       /*
        WebElement iframeElement1 = Utilities.driver.findElement(By.id("p4"));
        Utilities.driver.switchTo().frame(iframeElement1);
        Thread.sleep(2000);
        List<WebElement> allElement = Utilities.driver.findElements(By.xpath("/html/body/center/table[1]/tbody"));
        int count=allElement.size();
        allElement.get(count -1).click();

        */
        //WebElement frameElement1 = Utilities.driver.findElement(By.id("1"));
        //Utilities.driver.switchTo().frame(frameElement1);
        WebElement frameElement2 = Utilities.driver.findElement(By.id("p4"));
        Utilities.driver.switchTo().frame(frameElement2);

        Utilities.driver.findElement(By.cssSelector("#cta007064566169")).click();
        //Utilities.esperarElementoWebBci(cuentaPersonal).click();
/*
        JavascriptExecutor js = (JavascriptExecutor) Utilities.driver;
        Thread.sleep(2000);
        WebElement radioButton = Utilities.driver.findElement(By.xpath(pruebaNomas));
        js.executeScript("arguments[2].click()", radioButton);
        Thread.sleep(2000);
*/



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
