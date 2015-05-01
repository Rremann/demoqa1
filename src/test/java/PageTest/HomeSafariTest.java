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

import PageMethods.HomeMethods;
import PageObjects.Home;

public class HomeSafariTest {


	private HomeMethods homeMethods;
	private WebDriver driver;

	@Before
	public void setData() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName(BrowserType.SAFARI);
		driver = new RemoteWebDriver(new URL("http://172.16.7.38:4444/wd/hub"), cap);
		homeMethods = new HomeMethods(new Home(driver));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demoqa.com");
		
	}

	@After
	public void teardDown() {
		driver.quit();
	}

	@Ignore
	public void clickUniquePic() {
		assertTrue(homeMethods.canclickUniquePic());
	}

	@Ignore
	public void clickCustomerPic() {
		assertTrue(homeMethods.canClickCustomerPic());
	}

	@Ignore
	public void clickVeryFlexPic() {
		assertTrue(homeMethods.canClickFlexablePic());
	}

	@Ignore
	public void clickTabOne(){
		assertTrue(homeMethods.canClickTabOne());
	}
	
	@Ignore
	public void clickTabTwo() {
		assertTrue(homeMethods.canClickTabTwo());
	}

	@Ignore
	public void clickTabThree() {
		assertTrue(homeMethods.canClickTabThree());
	}

	@Ignore
	public void clickTabFour() {
		assertTrue(homeMethods.canClickTabFour());
	}

	@Ignore
	public void clickTabFive() {
		assertTrue(homeMethods.canClickTabFive());
	}

	@Ignore
	public void checkBreadCrumbs() {
		assertTrue(homeMethods.isBreadCrumbCorrect());
	}
	
	@Ignore
	public void clickAboutUs(){
		assertTrue(homeMethods.canClickAboutUs());
	}

	@Ignore
	public void hoverTwitter() {
		assertTrue(homeMethods.checkTwitToolTipTitle());
	}

	@Ignore
	public void hoverFacebook() {
		assertTrue(homeMethods.checkFbToolTipTitle());
	}

	@Ignore
	public void hoverGooglePlus() {
		assertTrue(homeMethods.checkGplusToolTipTitle());
	}

	@Ignore
	public void clickToolTip() {
		assertTrue(homeMethods.canClickTooltip());
	}

	@Ignore
	public void clickToolsQa() {
		assertTrue(homeMethods.canClickToolsQaLink());
	}

	@Ignore
	public void clickTabs() {
		assertTrue(homeMethods.canClickTabs());
	}

	@Ignore
	public void clickSlider() {
		assertTrue(homeMethods.canClickSlider());
	}

	@Ignore
	public void clickServices() {
		assertTrue(homeMethods.canClickServices());
	}

	@Ignore
	public void clickSelectable() {
		assertTrue(homeMethods.canClickSelectable());
	}

	@Ignore
	public void clickResizeable() {
		assertTrue(homeMethods.canClickResizeable());
	}

	@Ignore
	public void clickResgistration() {
		assertTrue(homeMethods.canClickRegistration());
	}

	@Ignore
	public void clickPoweredLink() {
		assertTrue(homeMethods.canClickPoweredLink());
	}

	@Ignore
	public void clickMenu() {
		assertTrue(homeMethods.canClickMenu());
	}

	@Ignore
	public void clickHomeIcon() {
		assertTrue(homeMethods.canClickHomeIcon());
	}

	@Ignore
	public void clickFrames() {
		assertTrue(homeMethods.canClickFramesAndWindows());
	}

	@Ignore
	public void clickDroppable() {
		assertTrue(homeMethods.canClickDroppable());
	}

	@Ignore
	public void clickDraggable() {
		assertTrue(homeMethods.canClickDraggable());
	}

	@Ignore
	public void clickDemo() {
		assertTrue(homeMethods.isDemoDropDownShown());
	}

	@Ignore
	public void clickDatePicker() {
		assertTrue(homeMethods.canClickDatePicker());
	}

	@Ignore
	public void clickContact() {
		assertTrue(homeMethods.canClickContact());
	}

	@Ignore
	public void clickBlog() {
		assertTrue(homeMethods.canClickBlog());
	}

	@Ignore
	public void clickAutoComplete() {
		assertTrue(homeMethods.canClickAutoComplete());
	}

	@Ignore
	public void clickAccordion() {
		assertTrue(homeMethods.canClickAccordion());
	}

	
	
	
	
}
