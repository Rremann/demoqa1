package PageTest;

import static org.junit.Assert.*;

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

import PageMethods.SortableMethods;
import PageObjects.Sortable;

public class SortableFireFox {

	private SortableMethods sortMethods;
	private WebDriver driver;

	@Before
	public void setData()throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName(BrowserType.FIREFOX);
		driver = new RemoteWebDriver(new URL("http://172.16.7.38:4444/wd/hub"),cap);
		sortMethods = new SortableMethods(new Sortable(driver));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/sortable/#");
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void sortDefault() {
		assertTrue(sortMethods.canSortDefaultFF());
	}

	@Test
	public void sortConnect() {
		assertTrue(sortMethods.canSortConnectListFF());
	}

	@Test
	public void sortDisplay() {
		assertTrue(sortMethods.canSortDisplayAsGridFF());
	}

	@Test
	public void sortPortlets() {
		assertTrue(sortMethods.canSortPortletsFF());
	}

	@Test
	public void checkBreadCrumb() {
		assertTrue(sortMethods.checkBreadCrumb());
	}

	@Test
	public void clickAboutUs(){
		assertTrue(sortMethods.canClickAboutUs());
	}

	@Test
	public void hoverTwitter() {
		assertTrue(sortMethods.checkTwitToolTipTitle());
	}

	@Test
	public void hoverFacebook() {
		assertTrue(sortMethods.checkFbToolTipTitle());
	}

	@Test
	public void hoverGooglePlus() {
		assertTrue(sortMethods.checkGplusToolTipTitle());
	}

	@Test
	public void clickToolTip() {
		assertTrue(sortMethods.canClickTooltip());
	}

	@Test
	public void clickToolsQa() {
		assertTrue(sortMethods.canClickToolsQaLink());
	}

	@Test
	public void clickTabs() {
		assertTrue(sortMethods.canClickTabs());
	}

	@Test
	public void clickSlider() {
		assertTrue(sortMethods.canClickSlider());
	}

	@Test
	public void clickServices() {
		assertTrue(sortMethods.canClickServices());
	}

	@Test
	public void clickSelectable() {
		assertTrue(sortMethods.canClickSelectable());
	}

	@Test
	public void clickResizeable() {
		assertTrue(sortMethods.canClickResizeable());
	}

	@Test
	public void clickResgistration() {
		assertTrue(sortMethods.canClickRegistration());
	}

	@Test
	public void clickPoweredLink() {
		assertTrue(sortMethods.canClickPoweredLink());
	}

	@Test
	public void clickMenu() {
		assertTrue(sortMethods.canClickMenu());
	}

	@Test
	public void clickHomeIcon() {
		assertTrue(sortMethods.canClickHomeIcon());
	}

	@Test
	public void clickFrames() {
		assertTrue(sortMethods.canClickFramesAndWindows());
	}

	@Test
	public void clickDroppable() {
		assertTrue(sortMethods.canClickDroppable());
	}

	@Test
	public void clickDraggable() {
		assertTrue(sortMethods.canClickDraggable());
	}

	@Test
	public void clickDemo() {
		assertTrue(sortMethods.isDemoDropDownShown());
	}

	@Test
	public void clickDatePicker() {
		assertTrue(sortMethods.canClickDatePicker());
	}

	@Test
	public void clickContact() {
		assertTrue(sortMethods.canClickContact());
	}

	@Test
	public void clickBlog() {
		assertTrue(sortMethods.canClickBlog());
	}

	@Test
	public void clickAutoComplete() {
		assertTrue(sortMethods.canClickAutoComplete());
	}

	@Test
	public void clickAccordion() {
		assertTrue(sortMethods.canClickAccordion());
	}

}
