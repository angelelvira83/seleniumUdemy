package pages;

import org.openqa.selenium.WebElement;

public class AmazonPaginaPrincipal extends AmazonBasePage {
 
    private String searchTool = "//input[@id='twotabsearchtextbox']";
    private String buttonXPage = "//a[@aria-label='Go to page X']";
    private String searchNResult = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedToCart = "//*[contains(text(),'Added to Cart')]";

    public AmazonPaginaPrincipal() {
        super(driver);
    }

    public void navigateToAmazonPage(String url) {
        navigateTo(url);
    }

    public void searchSomething(String search) {
        write(searchTool, search);
        clickElement(searchButton);
    }

    public void goToPage(String page) {
        String label = buttonXPage.replace("X", page);
        try {
            clickElement(label);
        } catch (Exception e) {
            System.out.println("Page not found. Exception: " + e);
        }
    }

    public void goToResult() {
        try {
            clickElement(searchNResult);
        } catch (Exception e) {
            System.out.println("Result not found. Exception: " + e);
        }
    }

    public WebElement addToCart() {
        try {
            clickElement(addToCartButton);
            return Find(addedToCart);
        } catch (Exception e) {
            System.out.println("Add to cart exception. Exception: " + e);
            return null;
        }
    }

}