package com.automation.pages.ui;

public interface ProductDetailsPage {
    boolean isTitleWithKeyword(String keyword);

    void ClickOnAddToCartBtn1();

    void clickOnCartIcon();

    default void clickOnBackButton(){}

     void clickOnProductAddToCartBtn();

    default boolean HasCartQtyIncreased(String number){return true;}

    default boolean HasCartQtyDecreased(){return true;}

    default String getProductName(){return "abc";}

   default void clickOnProfileIcon(){}

    boolean isTitleWithKeyword(String keyword);
    void ClickOnAddToCartBtn();
    void clickOnCartIcon();
    default boolean isProductDetailsPageDisplayed() {
        return false;
    }

}
