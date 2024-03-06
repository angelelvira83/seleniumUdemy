package runner;
 
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.AmazonBasePage;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Directorio de nuestros archivos .feature
        glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps
        //plugin = { "pretty", "json:target/cucumber-reports.json" })
       plugin = {"html:com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter", "json:target/cucumber-reports.json"},
       monochrome = true)
//@CucumberOptions(features = "src/test/resources/features", // Directorio de nuestros archivos .feature
//        glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps
//        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
       //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter", "json:target/cucumber-reports.json"})



public class TestRunner {
    
    @AfterClass
    public static void cleanDriver() {
        AmazonBasePage.closeBrowser();
    }
 
}