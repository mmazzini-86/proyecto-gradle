package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;;
import org.junit.runner.RunWith;
import utilities.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        //strict=true,
        features = "src/test/java/features/",
        glue = "definitions/",
        tags = {"@Test01"}
)

public class TestRunner {

    @BeforeClass
    public static void beforeClass() throws Exception {
        Utilities.inicializarChrome();
        System.out.println("Se ejecuto correctamente el BeforeMethod");
    }



    @AfterClass
    public static void afterClass() throws Exception {
        Utilities.screenShotForAllScenario();
        System.out.println("Se ejecuto correctamente el AfterMethod");
        Utilities.driver.close();
    }


}
