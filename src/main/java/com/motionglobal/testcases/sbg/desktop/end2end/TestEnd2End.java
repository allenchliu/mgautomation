package com.motionglobal.testcases.sbg.desktop.end2end;

import org.testng.annotations.Test;

import com.motionglobal.pages.sbg.desktop.home.HomePage;
import com.motionglobal.pages.sbg.desktop.search.ResultGrid;
import com.motionglobal.pages.sbg.desktop.search.SearchResultItem;
import com.motionglobal.pages.sbg.desktop.search.SearchResultPage;
import com.motionglobal.testcases.sbg.desktop.AbstractBaseSbgDesktopTestCase;

public class TestEnd2End extends AbstractBaseSbgDesktopTestCase {

    @Test(groups = { "debug" })
    public void testSunGlassesHeaderMenus() {
        logger().info("started...");
        HomePage homePage = new HomePage();
        homePage.header().inputSearch.sendKeys("ray ban");
        homePage.header().iconSearch.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        ResultGrid resultGrid = searchResultPage.resultGrid();
        SearchResultItem item1 = resultGrid.getItem(0);
        item1.click();
        // searchResultPage.header().logo.click();
        // Assert.assertTrue(homePage.isTextPresent("Ray-Ban"));
    }

    @Override
    protected void initialize() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void tearDown() {
        // TODO Auto-generated method stub

    }

}