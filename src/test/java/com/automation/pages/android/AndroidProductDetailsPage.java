package com.automation.pages.android;

import com.automation.pages.common.BasePage;
import com.automation.pages.ui.ProductDetailsPage;
import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidProductDetailsPage extends BasePage implements ProductDetailsPage {

    @FindBy(xpath="(//android.widget.TextView[@text='Add to cart'])[1]")
    WebElement addToCartBtn;

    @FindBy(xpath="(//com.horcrux.svg.PathView)[1]")
        WebElement backBtn ;

    @FindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
        WebElement productAddToCart;

    @FindBy(xpath="(//com.horcrux.svg.SvgView/following-sibling::android.view.ViewGroup/android.widget.TextView)[1]")
    WebElement cartQty;

    @Override
    public boolean isTitleWithKeyword(String keyword){
        return false;
    }

    @Override
    public void ClickOnAddToCartBtn(){
        addToCartBtn.click();
    }

    @Override
    public void clickOnCartIcon(){

    }

    public void clickOnBackButton(){
        backBtn.click();
    }

    public void clickOnProductAddToCartBtn(){
        productAddToCart.click();
    }

    public boolean HasCartQtyIncreased(String number){
        int numberInt=Integer.parseInt(number);
        System.out.println(numberInt+":numberInt");
        int cartQtyIntNow=Integer.parseInt(cartQty.getText());
        System.out.println(cartQtyIntNow+":cartQtyIntNow");
        int cartQtyNumber= ConfigReader.getIntConfigValue("cartQtyNumber");
        if (cartQtyNumber+numberInt==cartQtyIntNow){
            ConfigReader.setConfigValue("cartQtyNumber",cartQty.getText());
            return true;

        }
        else{
            return false;
        }

    }

    public boolean HasCartQtyDecreased(){
        int cartQtyIntNow=Integer.parseInt(cartQty.getText());
        int cartQtyNumber= ConfigReader.getIntConfigValue("cartQtyNumber");
        if (cartQtyNumber-1==cartQtyIntNow){
            ConfigReader.setConfigValue("cartQtyNumber",cartQty.getText());
            return true;

        }
        else{
            return false;
        }
    }
}
