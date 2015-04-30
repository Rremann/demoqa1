package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class PageObjectBase {

	protected WebDriver driver;
	protected WebDriverWait waitDriver;
	protected Actions action;
	protected Robot bot; 
	private static final By PAGETITLE = By.cssSelector("h1.entry-title");

	// Title Bar Elements
	private static final By HOMEICON = By.cssSelector("a.site-anchor>img");
	private static final By HOMELINK = By.cssSelector("li#menu-item-38>a");
	private static final By ABOUTLINK = By.cssSelector("li#menu-item-158>a");
	private static final By SERVICELINK = By.cssSelector("li#menu-item-155>a");
	private static final By DEMOLINK = By.cssSelector("li#menu-item-66>a");
	private static final By DEMODRAGSUBLINK = By
			.cssSelector("li#menu-item-73>a:nth-child(1)");
	private static final By DEMOTABSUBLINK = By
			.cssSelector("li#menu-item-73>a:nth-child(2)");
	private static final By DEMODROPDOWN = By.cssSelector("ul.dropdown-menu");
	private static final By BLOGLINK = By.cssSelector("li#menu-item-65>a");
	private static final By CONTACTLINK = By.cssSelector("li#menu-item-64>a");
	private static final By BREADCRUMBSLIST = By
			.cssSelector("ol#breadcrumbs>li");
	private static final By BREADCRUMBSLAST = By
			.cssSelector("ol#breadcrumbs>li>span");
	private static final By BREADCRUMBLINKS = By
			.cssSelector("ol#breadcrumbs>li>a");

	// Side Bar Elements
	// REGISTRATION
	private static final By REGILINK = By.cssSelector("li#menu-item-374>a");

	// INTERACTION
	private static final By DRAGLINK = By.cssSelector("li#menu-item-140>a");
	private static final By DROPLINK = By.cssSelector("li#menu-item-141>a");
	private static final By RESIZELINK = By.cssSelector("li#menu-item-143>a");
	private static final By SELECTLINK = By.cssSelector("li#menu-item-142>a");
	private static final By SORTLINK = By.cssSelector("li#menu-item-151>a");

	// WIDGET
	private static final By ACCORDINLINK = By.cssSelector("li#menu-item-144>a");
	private static final By AUTOCOMPLINK = By.cssSelector("li#menu-item-145>a");
	private static final By DATEPAICKLINK = By
			.cssSelector("li#menu-item-146>a");
	private static final By MENULINK = By.cssSelector("li#menu-item-147>a");
	private static final By SILDERLINK = By.cssSelector("li#menu-item-97>a");
	private static final By TABSLINK = By.cssSelector("li#menu-item-98>a");
	private static final By TOOLTIPLINK = By.cssSelector("li#menu-item-99>a");

	// FRAMES AND WINDOWS
	private static final By FRAMWINLINK = By.cssSelector("li#menu-item-148>a");

	// BOTTOM BOARDER ELEMENTS
	private static final By FBLINK = By.cssSelector("li.facebook>a");
	private static final By TWITLINK = By.cssSelector("li.twitter>a");
	private static final By GPLUSLINK = By.cssSelector("li.gplus>a");
	private static final By TOOLSLINK = By
			.cssSelector("p.copyright>a[rel='designer']");
	private static final By POWERLINK = By
			.cssSelector("p.copyright>a[rel='generator']");
	private static final By BOARDERTXT = By.cssSelector("div.textwidget");

	public PageObjectBase(WebDriver driver) {
		this.driver = driver;
		waitDriver = new WebDriverWait(driver, 30);
		action = new Actions(driver);
		try{
			this.bot = new Robot();		
		}catch(AWTException e){
			
		}
		
	}

	// Class Helper Methods
	protected WebElement find(By by) {
		return driver.findElement(by);
	}

	/**
	 * Returns the title of the current page.
	 * 
	 * @return
	 */
	public String getTitle() {
		return find(PAGETITLE).getText();
	}

	/**
	 * Returns the title linked to the browser.
	 * @return
	 */
	public String getBrowserTitle(){
		return driver.getTitle();
	}
	
	/**
	 * Checks to see if the demo dropdown list is visible.
	 */
	public boolean isDemoDropVisible(){
		return find(DEMODROPDOWN).isDisplayed();
	}
	
	// Methods used to click Menu bar links

	/**
	 * Clicks the home "Tools" icon at the top right coner of the screen.
	 */
	public void clickHomeIcon() {
		waitDriver.until(ExpectedConditions.elementToBeClickable(HOMEICON)).click();
	}

	/**
	 * Clicks the "Home" link in the top menu bar.
	 */
	public void clickHome() {
		find(HOMELINK).click();
	}

	/**
	 * Clicks the "About us" link in the top menu bar.
	 */
	public void clickAboutUs() {
		find(ABOUTLINK).click();
	}

	/**
	 * Clicks the "Services" Link in the top menu bar.
	 */
	public void clickServices() {
		find(SERVICELINK).click();
	}

	/**
	 * Clicks the "Demo" Link in the top menu bar.
	 */
	public void clickDemo() {
		find(DEMOLINK).click();
	}

	/**
	 * Clicks the "Draggable" link inside of the demo title bar dropdown.
	 */
	public void clickDemoDrag() {
		find(DEMODRAGSUBLINK).click();
	}

	/**
	 * Clicks the "Tabs" link inside of the demo title bar dropdown.
	 */
	public void clickDemoTab() {
		find(DEMOTABSUBLINK).click();
	}

	/**
	 * Clicks the "Blog" Link in the top menu bar.
	 */
	public void clickBlog() {
		find(BLOGLINK).click();
	}

	/**
	 * Clicks the "Contact" Link in the top menu bar.
	 */
	public void clickContact() {
		find(CONTACTLINK).click();
	}

	/**
	 * Returns a string version of the breadcrumbs for the current page a user
	 * is on.
	 * 
	 * @return
	 */
	public String getBreadcrumbs() {
		Integer crumLen = driver.findElements(BREADCRUMBSLIST).size();
		List<WebElement> crumLinks = driver.findElements(BREADCRUMBLINKS);
		StringBuilder crumPath = new StringBuilder();

		for (int i = 0; i < crumLen; i++) {

			if (i == crumLen - 1) {
				crumPath.append(find(BREADCRUMBSLAST).getText());
			} else {
				crumPath.append(crumLinks.get(i).getText() + " / ");
			}
			
		}

		return crumPath.toString();

	}

	// Methods use to click Side bar links

	/**
	 * Clicks "Registration" link in the side menu bar.
	 */
	public void clickRegistration() {
		find(REGILINK).click();
	}

	/**
	 * Clicks "Draggable" link in the side menu bar.
	 */
	public void clickDraggable() {
		find(DRAGLINK).click();
	}

	/**
	 * Clicks "Droppable" link in the side menu bar.
	 */
	public void clickDroppable() {
		find(DROPLINK).click();
	}

	/**
	 * Clicks the "Resizeable" link in the side menu bar.
	 */
	public void clickResizeble() {
		find(RESIZELINK).click();
	}

	/**
	 * Clicks the "Selectable" link in the side menu bar.
	 */
	public void clickSelectable() {
		find(SELECTLINK).click();
	}

	/**
	 * Clicks the "Sortable" link in the side menu bar.
	 */
	public void clickSortable() {
		find(SORTLINK).click();
	}

	/**
	 * Clicks the "Accordian" link in the side menu bar.
	 */
	public void clickAccordion() {
		find(ACCORDINLINK).click();
	}

	/**
	 * Clicks the "AutoComplete" link in the side menu bar.
	 */
	public void clickAutoComplete() {
		find(AUTOCOMPLINK).click();
	}

	/**
	 * Clicks the "Datepicker" link in the side menu bar.
	 */
	public void clickDatePicker() {
		find(DATEPAICKLINK).click();
	}

	/**
	 * Clicks the "Menu" link in the side menu bar.
	 */
	public void clickMenu() {
		find(MENULINK).click();
	}

	/**
	 * Clicks the "Slider" link in the side menu bar.
	 */
	public void clickSlider() {
		find(SILDERLINK).click();
	}

	/**
	 * Clicks the "Tabs" link in the side menu bar.
	 */
	public void clickTabs() {
		find(TABSLINK).click();
	}

	/**
	 * Clicks the "Tooltip" link in the side menu bar.
	 */
	public void clickTooltip() {
		find(TOOLTIPLINK).click();
	}

	/**
	 * Clicks the "Frames and windows" link in the side menu bar.
	 */
	public void clickFramAndWin() {
		find(FRAMWINLINK).click();
	}

	// Methods use to click/get Bottom Boarder Links

	/**
	 * Clicks the "ToolsQA" link in the bottom boarder.
	 */
	public void clickTools() {
		find(TOOLSLINK).click();
	}

	/**
	 * Clicks the "Powered by Oneiric Tech Solutions Pvt. Ltd." link in the
	 * bottom boarder.
	 */
	public void clickPowered() {
		WebElement check = find(POWERLINK);
		waitForTimeout();
		check.click();
		
	}

	/**
	 * Clicks the connect to facebook icon in the bottom boarder.
	 */
	public void clickFB() {
		find(FBLINK).click();
	}

	/**
	 * Clicks teh connect to twitter icon in the bottom boarder.
	 */
	public void clickTwit() {
		find(TWITLINK).click();
	}

	/**
	 * Clicks the connect to google plus icon in the bottom boarder.
	 */
	public void clickGplus() {
		find(GPLUSLINK).click();
	}
	
	
	public WebElement getGplus(){
		return find(GPLUSLINK);
	}
	
	public WebElement getFaceBook(){
		return find(FBLINK);
	}
	
	public WebElement getTwitter(){
		return find(TWITLINK);
	}

	// Mehtod to get Text from Bottom Boarder

	/**
	 * Retrieves the text stored in the "About" section in the bottom boarder.
	 * 
	 * @return
	 */
	public String getAboutText() {
		return find(BOARDERTXT).getText();
	}
	
	/**
	 * Moves an element two pixels below another element.
	 * @param eleToMove
	 * @param eleToReplace
	 */
	public void dragToElementBelow(WebElement eleToMove, WebElement eleToReplace){
		action.clickAndHold(eleToMove).moveToElement(eleToReplace).moveByOffset(0, 2).release().build().perform();
	}

	/**
	 * Moves an element two pixels above another element. 
	 * @param eleToMove
	 * @param eleToReplace
	 */
	public void dragToElementAbove(WebElement eleToMove, WebElement eleToReplace){
		action.clickAndHold(eleToMove).moveToElement(eleToReplace).moveByOffset(0, -2).release().build().perform();
	}
	
	/**
	 * Moves an element two pixels to the right of another element. 
	 * @param eleToMove
	 * @param eleToReplace
	 */
	public void dragToElementsRight(WebElement eleToMove, WebElement eleToReplace){
		action.clickAndHold(eleToMove).moveToElement(eleToReplace).moveByOffset(2, 0).release().build().perform();
	

	}
	
	/**
	 * Moves an element 2 pixels to the left of another element. 
	 * @param eleToMove
	 * @param eleToReplace
	 */
	public void dragToElementsLeft(WebElement eleToMove, WebElement eleToReplace){
		action.clickAndHold(eleToMove).moveToElement(eleToReplace).moveByOffset(-2, 0).release().build().perform();
		action.build();
	}
	
	public void safDrag(WebElement eleToMove, WebElement eleToReplace){
		Point p1 = eleToMove.getLocation();
		Point p2 = eleToReplace.getLocation();

		String xto=Integer.toString(p2.x);
		String yto=Integer.toString(p2.y);
		((JavascriptExecutor)driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
		"simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
		eleToMove,xto,yto);

		
		
//		bot.mouseMove(p1.getX() +64,p1.getX());
//		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		bot.mouseMove(p2.getX() + 64, p2.getY());
//		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	
	}
	
	public void dragLeft(WebElement eleToMove, WebElement eleToReplace){
		
	
		
		
	}
	
	public void dragRight(){
		
	}
	

	
	
	/**
	 * Custom wait method to pause test for 10 seconds before continuing. 
	 */
	public void waitForTimeout(){
		Long start = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - start < 30000){
			continue;
		}
		
	}
	
	public void hoverOver(WebElement ele){
		action.moveToElement(ele).perform();
	}
	
	/**
	 * Returns the url of the current page.
	 * @return
	 */
	public String getUrl(){
		waitForTimeout();
		return driver.getCurrentUrl();
	}
	
	
	public boolean waitForTitle(String title){
		return waitDriver.until(ExpectedConditions.titleContains(title));
	}
	
	public void switchToNewWindow(){
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles){
			driver.switchTo().window(handle);
		}
	
		
	}
	
}
