package PageTest;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageMethods.HomeMethods;
import PageObjects.Home;

public class HomeTestFireFoxTest {

	private HomeMethods homeMethods;
	private WebDriver driver;

	@Before
	public void setData() throws MalformedURLException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		driver = new RemoteWebDriver(new URL("http://172.16.7.38:4444/wd/hub"),cap);
		homeMethods = new HomeMethods(new Home(driver));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demoqa.com");
		
	}

	@After
	public void teardDown() {
		driver.quit();
	}

	@Test
	public void clickUniquePic() {
		assertTrue(homeMethods.canclickUniquePic());
	}

	@Test
	public void clickCustomerPic() {
		assertTrue(homeMethods.canClickCustomerPic());
	}

	@Test
	public void clickVeryFlexPic() {
		assertTrue(homeMethods.canClickFlexablePic());
	}

	@Test
	public void clickTabOne(){
		assertTrue(homeMethods.canClickTabOne());
	}
	
	@Test
	public void clickTabTwo() {
		assertTrue(homeMethods.canClickTabTwo());
	}

	@Test
	public void clickTabThree() {
		assertTrue(homeMethods.canClickTabThree());
	}

	@Test
	public void clickTabFour() {
		assertTrue(homeMethods.canClickTabFour());
	}

	@Test
	public void clickTabFive() {
		assertTrue(homeMethods.canClickTabFive());
	}

	@Test
	public void checkBreadCrumbs() {
		assertTrue(homeMethods.isBreadCrumbCorrect());
	}
	
	
	@Test
	public void clickAboutUs(){
		assertTrue(homeMethods.canClickAboutUs());
	}

	@Test
	public void hoverTwitter() {
		assertTrue(homeMethods.checkTwitToolTipTitle());
	}

	@Test
	public void hoverFacebook() {
		assertTrue(homeMethods.checkFbToolTipTitle());
	}

	@Test
	public void hoverGooglePlus() {
		assertTrue(homeMethods.checkGplusToolTipTitle());
	}

	@Test
	public void clickToolTip() {
		assertTrue(homeMethods.canClickTooltip());
	}

	@Test
	public void clickToolsQa() {
		assertTrue(homeMethods.canClickToolsQaLink());
	}

	@Test
	public void clickTabs() {
		assertTrue(homeMethods.canClickTabs());
	}

	@Test
	public void clickSlider() {
		assertTrue(homeMethods.canClickSlider());
	}

	@Test
	public void clickServices() {
		assertTrue(homeMethods.canClickServices());
	}

	@Test
	public void clickSelectable() {
		assertTrue(homeMethods.canClickSelectable());
	}

	@Test
	public void clickResizeable() {
		assertTrue(homeMethods.canClickResizeable());
	}

	@Test
	public void clickResgistration() {
		assertTrue(homeMethods.canClickRegistration());
	}

	@Test
	public void clickPoweredLink() {
		assertTrue(homeMethods.canClickPoweredLink());
	}

	@Test
	public void clickMenu() {
		assertTrue(homeMethods.canClickMenu());
	}

	@Test
	public void clickHomeIcon() {
		assertTrue(homeMethods.canClickHomeIcon());
	}

	@Test
	public void clickFrames() {
		assertTrue(homeMethods.canClickFramesAndWindows());
	}

	@Test
	public void clickDroppable() {
		assertTrue(homeMethods.canClickDroppable());
	}

	@Test
	public void clickDraggable() {
		assertTrue(homeMethods.canClickDraggable());
	}

	@Test
	public void clickDemo() {
		assertTrue(homeMethods.isDemoDropDownShown());
	}

	@Test
	public void clickDatePicker() {
		assertTrue(homeMethods.canClickDatePicker());
	}

	@Test
	public void clickContact() {
		assertTrue(homeMethods.canClickContact());
	}

	@Test
	public void clickBlog() {
		assertTrue(homeMethods.canClickBlog());
	}

	@Test
	public void clickAutoComplete() {
		assertTrue(homeMethods.canClickAutoComplete());
	}

	@Test
	public void clickAccordion() {
		assertTrue(homeMethods.canClickAccordion());
	}

	
	
}
