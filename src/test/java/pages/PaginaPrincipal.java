package pages;
 
public class PaginaPrincipal extends BasePage {
 
    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";
    private String instagramBase = "//a[@href='https://www.instagram.com/freerangetesters']";
    private String googleText = "//textarea[@id='APjFqb']";
 
    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
 
    }

    public void navigateToGoogle() {
        navigateTo("http://www.google.com");
 
    }
 
    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }

    public void hoverIgButton() {
        //hoverOverElement(instagramBase);
        clickElement(instagramBase);
    }

    public void writeText() {
        write(googleText, "hola");
    }
 

    public void condiciones () {
        clickElement("//*[@id='L2AGLb']");
        write("//textarea[@id='APjFqb']", "hola");
    }

}//*[@id="L2AGLb"]