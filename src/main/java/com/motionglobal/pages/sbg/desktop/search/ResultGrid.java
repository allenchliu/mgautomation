package com.motionglobal.pages.sbg.desktop.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.motionglobal.pages.sbg.desktop.AbstractBaseSbgDesktopPage;

public class ResultGrid extends AbstractBaseSbgDesktopPage {

    @Override
    protected void waitPageLoad() {
        waitForVisibility(By.cssSelector(".s_r_pn_pager"), 10);
    }

    public SearchResultItem getItem(int index) {
        List<WebElement> resultItems = getResultItems();
        if (resultItems == null) {
            this.waitForVisibility(By.cssSelector(".searchPart > .s_rpl_block"), 10);
            resultItems = getResultItems();
            if (resultItems == null) {
                logger.error("Search results not displayed.");
                return null;
            }
        }
        if (resultItems.size() < index || resultItems.size() == 0) {
            logger.error(String.format("No so many result items in this page. Total: %s, expected index: %s", resultItems.size(), index));
            return null;
        }
        return new SearchResultItem(resultItems.get(index));
    }

    private List<WebElement> getResultItems() {
        return driver.findElements(By.cssSelector(".searchPart > .s_rpl_block"));
    }

    /*
     * 
     * public SearchResultItem get(String itemName) { return null; }
     * 
     * public void clickPreviousPage(int index) {
     * 
     * }
     * 
     * public void clickFirstPage() {
     * 
     * }
     * 
     * public void clickNextPage(int index) {
     * 
     * }
     * 
     * public void clickLastPage() {
     * 
     * }
     * 
     * public int currentPageNum() { return 0; }
     * 
     * public void clickPageNum() { }
     * 
     * public int totalResultNum() { return 0; }
     * 
     * public int pageResultNum() { return 0; }
     */
}
