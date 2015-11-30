package com.motionglobal.pages.sbg.desktop.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.motionglobal.pages.sbg.desktop.AbstractBaseSbgDesktopPage;

public class ProductDetailPage extends AbstractBaseSbgDesktopPage {

    @FindBy(css = ".pro_r_buynow .formSubmit")
    public WebElement btnBuyNow;
    @FindBy(xpath = "//map[@name='RX_pop_map']/area[1]")
    public WebElement btnAddLenses;
    @FindBy(xpath = "//map[@name='RX_pop_map']/area[last()]")
    public WebElement btnFrameOnly;

    public ProductDetailPage() {
        super();
    }

    @Override
    protected void waitPageLoad() {
        waitForVisibility(By.cssSelector(".pro_big_title>h1"), 20);
    }

}
