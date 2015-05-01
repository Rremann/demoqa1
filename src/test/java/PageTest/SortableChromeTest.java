package PageTest;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageMethods.SortableMethods;
import PageObjects.Sortable;

public class SortableChromeTest {

	WebDriver driver; 
	SortableMethods sortMethods;
	
	@Before
	public void setData()throws MalformedURLException{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("http://172.16.7.38:4444/wd/hub"), cap);
		sortMethods = new SortableMethods(new Sortable(driver));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/sortable/#");
		
	}
	
	
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Ignore
	public void sortDefault(){
		assertTrue(sortMethods.canSortDefaultGC());
	}
	
	@Ignore
	public void sortConnect(){
		assertTrue(sortMethods.canSortConnectListGC());
	}
	
	@Ignore
	public void sortDisplay(){
		assertTrue(sortMethods.canSortDisplayAsGridGC());
	}
	
	@Ignore
	public void sortPortlets(){
		assertTrue(sortMethods.canSortPortletsGC());		
	}
	
	@Ignore
	public void checkBreadCrumb(){
		assertTrue(sortMethods.checkBreadCrumb());
	}

	@Ignore
	public void clickAboutUs(){
		assertTrue(sortMethods.canClickAboutUs());
	}

	@Ignore
	public void hoverTwitter() {
		assertTrue(sortMethods.checkTwitToolTipTitle());
	}

	@Ignore
	public void hoverFacebook() {
		assertTrue(sortMethods.checkFbToolTipTitle());
	}

	@Ignore
	public void hoverGooglePlus() {
		assertTrue(sortMethods.checkGplusToolTipTitle());
	}

	@Ignore
	public void clickToolTip() {
		assertTrue(sortMethods.canClickTooltip());
	}

	@Ignore
	public void clickToolsQa() {
		assertTrue(sortMethods.canClickToolsQaLink());
	}

	@Ignore
	public void clickTabs() {
		assertTrue(sortMethods.canClickTabs());
	}

	@Ignore
	public void clickSlider() {
		assertTrue(sortMethods.canClickSlider());
	}

	@Ignore
	public void clickServices() {
		assertTrue(sortMethods.canClickServices());
	}

	@Ignore
	public void clickSelectable() {
		assertTrue(sortMethods.canClickSelectable());
	}

	@Ignore
	public void clickResizeable() {
		assertTrue(sortMethods.canClickResizeable());
	}

	@Ignore
	public void clickResgistration() {
		assertTrue(sortMethods.canClickRegistration());
	}

	@Ignore
	public void clickPoweredLink() {
		assertTrue(sortMethods.canClickPoweredLink());
	}

	@Ignore
	public void clickMenu() {
		assertTrue(sortMethods.canClickMenu());
	}

	@Ignore
	public void clickHomeIcon() {
		assertTrue(sortMethods.canClickHomeIcon());
	}

	@Ignore
	public void clickFrames() {
		assertTrue(sortMethods.canClickFramesAndWindows());
	}

	@Ignore
	public void clickDroppable() {
		assertTrue(sortMethods.canClickDroppable());
	}

	@Ignore
	public void clickDraggable() {
		assertTrue(sortMethods.canClickDraggable());
	}

	@Ignore
	public void clickDemo() {
		assertTrue(sortMethods.isDemoDropDownShown());
	}

	@Ignore
	public void clickDatePicker() {
		assertTrue(sortMethods.canClickDatePicker());
	}

	@Ignore
	public void clickContact() {
		assertTrue(sortMethods.canClickContact());
	}

	@Ignore
	public void clickBlog() {
		assertTrue(sortMethods.canClickBlog());
	}

	@Ignore
	public void clickAutoComplete() {
		assertTrue(sortMethods.canClickAutoComplete());
	}

	@Ignore
	public void clickAccordion() {
		assertTrue(sortMethods.canClickAccordion());
	}

	
	
}
