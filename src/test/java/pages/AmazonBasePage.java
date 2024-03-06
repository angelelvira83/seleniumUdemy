package pages;
 
// Importaciones necesarias
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class AmazonBasePage {

    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases
     */
    protected static WebDriver driver;

    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
 
    /* 
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
    */
    static {
        WebDriverManager.chromedriver().setup();
 
        //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        Dimension dimension = new Dimension(1920, 1024);
        driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
    }
 
    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como
     * argumento.
     */
    public AmazonBasePage(WebDriver driver) {
        AmazonBasePage.driver = driver;
    }
 
    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }
 
    // Método estático para cerrar la instancia del driver.
    public static void closeBrowser() {
        driver.quit();
    }
 
    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath,
    // esperando a que esté presentente en el DOM
    public WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    // Encuentra y devuelve una lista de elementos en la página utilizando un locator XPath
    public List<WebElement> findAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }
 
    // Click a un elemento por locator
    public void clickElement(String locator) {
        Find(locator).click();
    }
 
    // Encuentra el locator de una caja de texto, la limpia y escribe algo en él
    public void write(String locator, String keysToSend) {
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    // Selecciona un valor de un dropdown por valor
    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByValue(value);
    }
 
    // Selecciona un valor de un dropdown por index
    public void selectFromDropdownByIndex(String locator, Integer index) {
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByIndex(index);
    }
 
    // Obtiene el tamaño de un dropdown
    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
 
        return dropdownOptions.size();
    }
 
    // Obtiene una lista de elementos de un dropdown
    public List<String> getDropdownValues(String locator) {
        Select dropdown = new Select(Find(locator));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
        }
 
        return values;

    }

 
}