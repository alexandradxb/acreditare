package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".products-grid li.item")
    private List<WebElementFacade> productsList;

    @FindBy(css = ".products-grid li.item .price")
    private List<WebElementFacade> productPrices;

    public boolean checkListForProduct(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void selectProductFromList(String product){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(product)){
                element.findElement(By.cssSelector("a.product-image")).click();
                break;
            }
        }
    }

    public boolean checkNewProducts(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }

    public boolean verifyNewProductsPrice(String price) {

        for(WebElementFacade element : productPrices){
            if(element.getText().equalsIgnoreCase(price)){
                return true;
            }
        }
        return false;
    }
}
