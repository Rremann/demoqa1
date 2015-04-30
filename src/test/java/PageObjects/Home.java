package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends PageObjectBase {

	// Unique & Clean Locators
	private static final By UNIQCLEANLBL = By
			.cssSelector("article#post-9>div>div>h5:nth-child(1)");
	private static final By WOODPIC = By
			.cssSelector("img.alignnone");
	private static final By UNIQCLEANTXT = By
			.cssSelector("article#post-9>div>div>div>p:nth-child(1)");

	// Customer Support Locators
	private static final By CUSSUPTLBL = By
			.cssSelector("article#post-9>div>div>h5:nth-child(2)");
	private static final By CUSSUPTTXT = By
			.cssSelector("article#post-9>div>div>div>p:nth-child(1)");

	// Very Flexible Locators
	private static final By VERYFLEXLBL = By
			.cssSelector("article#post-9>div>div>h5:nth-child(3)");
	private static final By VERYFLEXTXT = By
			.cssSelector("article#post-9>div>div>div>p:nth-child(1)");

	// Tab 1 Locators
	private static final By TABONELNK = By.id("ui-id-1");
	private static final By TABONETITL = By.cssSelector("div#tabs-1>b");
	private static final By TABONETXT = By
			.cssSelector("div#tabs-1>p:nth-child(2)");

	// Tab 2 Locators
	private static final By TABTWOLNK = By.id("ui-id-2");
	private static final By TABTWOTITL = By.cssSelector("div#tabs-2>b");
	private static final By TABTWOTXT = By
			.cssSelector("div#tabs-2>p:nth-child(2)");

	// Tab 3 Locators
	private static final By TABTHREELNK = By.id("ui-id-3");
	private static final By TABTHREETITL = By.cssSelector("div#tabs-3>b");
	private static final By TABTHREETXT = By
			.cssSelector("div#tabs-3>p:nth-child(2)");

	// Tab 4 Locators
	private static final By TABFOURLNK = By.id("ui-id-4");
	private static final By TABFOURTITL = By.cssSelector("div#tabs-4>b");
	private static final By TABFOURTXT = By
			.cssSelector("div#tabs-4>p:nth-child(2)");

	// Tab 5 Locators
	private static final By TABFIVELNK = By.id("ui-id-5");
	private static final By TABFIVETITL = By.cssSelector("div#tabs-5>p>b");
	private static final By TABFIVETXT = By.cssSelector("div#tabs-5>p:nth-child(2)");

	public Home(WebDriver driver) {
		super(driver);
	}

	/**
	 * Returns the text stored under the unique and clean picture.
	 * 
	 * @return
	 */
	public String getUniqueText() {
		return find(UNIQCLEANTXT).getText();
	}

	/**
	 * Returns the text stored under the customer support picture.
	 * 
	 * @return
	 */
	public String getCustomerText() {
		return find(CUSSUPTTXT).getText();
	}

	/**
	 * Returns the text stored under the very flexible picture.
	 * 
	 * @return
	 */
	public String getVeryFlexText() {
		return find(VERYFLEXTXT).getText();
	}

	/**
	 * Returns the Label stored above the unique and clean picture.
	 * 
	 * @return
	 */
	public String getUniqueLblText() {
		return find(UNIQCLEANLBL).getText();
	}

	/**
	 * Returns the Label stored above the customer support picture.
	 * 
	 * @return
	 */
	public String getCustomerLblText() {
		return find(CUSSUPTLBL).getText();
	}

	/**
	 * Returns the Label stored above the very clean picture.
	 * 
	 * @return
	 */
	public String getVeryFlexLblText() {
		return find(VERYFLEXLBL).getText();
	}

	
	/**
	 * Clicks the unique and clean picture.
	 */
	public void clickUniquePic() {
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(WOODPIC));
		driver.findElements(WOODPIC).get(0).click();
	}

	/**
	 * Clicks the customer support picture.
	 */
	public void clickCustomerPic() {
		driver.findElements(WOODPIC).get(1).click();
	}

	/**
	 * Clicks very flexable pic.
	 */
	public void clickVeryFlexPic() {
		driver.findElements(WOODPIC).get(2).click();
	}

	/**
	 * Clicks "Tab 1"
	 */
	public void clickTabOne() {
		find(TABONELNK).click();
	}

	/**
	 * Clicks "Tab 2"
	 */
	public void clickTabTwo() {
		find(TABTWOLNK).click();
	}

	/**
	 * Clicks "Tab 3"
	 */
	public void clickTabThree() {
		find(TABTHREELNK).click();
	}

	/**
	 * Clicks "Tab 4"
	 */
	public void clickTabFour() {
		find(TABFOURLNK).click();
	}

	/**
	 * Clicks "Tab 5"
	 */
	public void clickTabFive() {
		find(TABFIVELNK).click();
	}

	/**
	 * Return the title inside of tab one.
	 * 
	 * @return
	 */
	public WebElement getTabOneTitle() {
		return find(TABONETITL);
	}

	/**
	 * Return the title inside of tab two.
	 * 
	 * @return
	 */
	public WebElement getTabTwoTitle() {
		return find(TABTWOTITL);
	}

	/**
	 * Return the title inside of tab three.
	 * 
	 * @return
	 */
	public WebElement getTabThreeTitle() {
		return find(TABTHREETITL);
	}

	/**
	 * Return the title inside of tab four.
	 * 
	 * @return
	 */
	public WebElement getTabFourTitle() {
		return find(TABFOURTITL);
	}

	/**
	 * Return the title inside of tab five.
	 * 
	 * @return
	 */
	public WebElement getTabFiveTitle() {
		return find(TABFIVETITL);
	}

	/**
	 * Return the text element inside of tab one.
	 * 
	 * @return
	 */
	public WebElement getTabOneText() {
		return find(TABONETXT);
	}

	/**
	 * Return the text element inside of tab two.
	 * 
	 * @return
	 */
	public WebElement getTabTwoText() {
		return find(TABTWOTXT);
	}

	/**
	 * Return the text element inside of tab three.
	 * 
	 * @return
	 */
	public WebElement getTabThreeText() {
		return find(TABTHREETXT);
	}

	/**
	 * Return the text element inside of tab four.
	 * 
	 * @return
	 */
	public WebElement getTabFourText() {
		return find(TABFOURTXT);
	}

	/**
	 * Returns the text element inside of tab five.
	 * 
	 * @return
	 */
	public WebElement getTabFiveText() {
		return find(TABFIVETXT);
	}


	
	
}
