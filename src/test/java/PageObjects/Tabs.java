package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tabs extends PageObjectBase{

	
	private static final By TABONE = By.id("ui-id-1");
	private static final By TABTWO = By.id("ui-id-2");
	private static final By TABTHREE = By.id("ui-id-3"); 
	private static final By TABONETXT = By.cssSelector("div#tabs-1>p");
	private static final By TABTWOTXT = By.cssSelector("div#tabs-2>p");
	private static final By TABTHREETXT1 = By.cssSelector("div#tabs-3>p:nth-child(1)");
	private static final By TABTHREETXT2 = By.cssSelector("div#tabs-3>p:nth-child(2)");
	
	
	
	public Tabs(WebDriver driver) {
		super(driver);
	}

	
	/**
	 * Clicks the "Tab 1" link
	 */
	public void clickTabOne(){
		find(TABONE).click();
	}
	
	/**
	 * Clicks the "Tab 2" link
 	 */
	public void clickTabTwo(){
		find(TABTWO).click();
	}
	
	/**
	 * Clicks the "Tab 3" link
	 */
	public void clickTabThree(){
		find(TABTHREE).click();
	}
	
	/**
	 * Returns text stored inside of tab one.
	 * @return
	 */
	public String getTabOneText(){
		return find(TABONETXT).getText();
	}
	
	/**
	 * Returns the text stored inside of tab two.
	 * @return
	 */
	public String getTabTwoText(){
		return find(TABTWOTXT).getText();
	}
	
	/**
	 * Returns the text stred inside of tab three.
	 * @return
	 */
	public String getTabThreeText(){
		return find(TABTHREETXT1).getText() + find(TABTHREETXT2).getText();
	}
}

