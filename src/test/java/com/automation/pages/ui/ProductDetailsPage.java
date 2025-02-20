package com.automation.pages.ui;

public interface ProductDetailsPage {
    boolean isTitleWithKeyword(String keyword);

    void ClickOnAddToCartBtn();

    void clickOnCartIcon();

    default void clickOnBackButton(){}

    default void clickOnProductAddToCartBtn(){}

    default boolean HasCartQtyIncreased(String number){return true;}

    default boolean HasCartQtyDecreased(){return true;}
}
