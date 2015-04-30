package PageMethods;

import org.openqa.selenium.WebElement;

import PageObjects.Home;

public class HomeMethods {

	private static final String PICURL = "http://http://demoqa.com/wp-content/uploads/2014/08/pattern-14.png";
	
	private Home home;
	
	
	public HomeMethods(Home home){
		this.home = home;
	}
	
	/**
	 * Check that the correct url is displayed when clicking the image under unique. 
	 * @return
	 */
	public boolean canclickUniquePic(){
		home.waitForTimeout();
		home.clickUniquePic();
		return home.getUrl().equals(PICURL);
	}
	
	/**
	 * Checks that the correct url is displayed when clicking the image
	 * under the customer support section.
	 */
	public boolean canClickCustomerPic(){
		home.waitForTimeout();
		home.clickCustomerPic();
		return home.getUrl().equals(PICURL);
	}
	
	/**
	 * Check that the correct url is displayed when clicking the image under the 
	 * Very Flexable section.
	 * @return
	 */
	public boolean canClickFlexablePic(){
		home.waitForTimeout();
		home.clickVeryFlexPic();
		return home.getUrl().equals(PICURL);
	}
	
	/**
	 * Clicks the "Tab 1" link.
	 * @return
	 */
	public boolean canClickTabOne(){
		home.clickTabOne();
		home.waitForTimeout();
		return home.getTabOneTitle().isDisplayed();
	}
	
	/**
	 * Clicks the "Tab 2" Link.
	 * @return
	 */
	public boolean canClickTabTwo(){
		home.clickTabTwo();
		home.waitForTimeout();

		return home.getTabTwoTitle().isDisplayed();
	}
	
	/**
	 * Clicks the "Tab 3" Link.
	 * @return
	 */
	public boolean canClickTabThree(){
		home.clickTabThree();
		home.waitForTimeout();

		return home.getTabThreeTitle().isDisplayed();
	}
	
	/**
	 * Clicks the "Tab 4" Link. 
	 * @return
	 */
	public boolean canClickTabFour(){
		home.clickTabFour();
		home.waitForTimeout();
		return home.getTabFourTitle().isDisplayed();
	}
	
	/**
	 * Clicks the "Tab 5" Link. 
	 * @return
	 */
	public boolean canClickTabFive(){
		home.clickTabFive();
		return home.getTabFiveTitle().isDisplayed();
	}

	/**
	 * Check that the breadcrumbs are displayed correctly. 
	 * @return
	 */
	public boolean isBreadCrumbCorrect(){
		return home.getBreadcrumbs().equals("Home");
	}
	
	
	public boolean canClickAboutUs(){
		home.clickAboutUs();
		return home.getUrl().equals("http://demoqa.com/about-us/");
	}
	
	public boolean canClickServices(){
		home.clickServices();
		return home.getUrl().equals("http://demoqa.com/services/");
	}
	

	public boolean isDemoDropDownShown(){
		home.clickDemo();
		return home.isDemoDropVisible();
		
	}
	
	public boolean canClickBlog(){
		home.clickBlog();
		return home.getUrl().equals("http://demoqa.com/blog/");

	}
	
	public boolean canClickContact(){
		home.clickContact();
		return home.getUrl().equals("http://demoqa.com/contact/");
	}

	public boolean canClickRegistration(){
		home.clickRegistration();
		return home.getUrl().equals("http://demoqa.com/registration/");
	}
	
	public boolean canClickDraggable(){
		home.clickDraggable();
		return home.getUrl().equals("http://demoqa.com/draggable/");
	}
	
	public boolean canClickDroppable(){
		home.clickDroppable();
		return home.getUrl().equals("http://demoqa.com/droppable/");
	}
	
	public boolean canClickResizeable(){
		home.clickResizeble();
		return home.getUrl().equals("http://demoqa.com/resizable/");
	}
	
	public boolean canClickSelectable(){
		home.clickSelectable();
		return home.getUrl().equals("http://demoqa.com/selectable/");
	}
	
	public boolean canClickSortable(){
		home.clickSortable();
		return home.getUrl().equals("http://demoqa.com/sortable/");
	}
	
	public boolean canClickAccordion(){
		home.clickAccordion();
		return home.getUrl().equals("http://demoqa.com/accordion/");
	}
	
	public boolean canClickAutoComplete(){
		home.clickAutoComplete();
		return home.getUrl().equals("http://demoqa.com/autocomplete/");
	}
	
	public boolean canClickDatePicker(){
		home.clickDatePicker();
		return home.getUrl().equals("http://demoqa.com/datepicker/");
	}
	
	public boolean canClickMenu(){
		home.clickMenu();
		return home.getUrl().equals("http://demoqa.com/menu/");
	}
	
	public boolean canClickSlider(){
		home.clickSlider();
		return home.getUrl().equals("http://demoqa.com/slider/");
	}
	
	public boolean canClickTabs(){
		home.clickTabs();
		return home.getUrl().equals("http://demoqa.com/tabs/");
	}
	
	public boolean canClickTooltip(){
		home.clickTooltip();
		return home.getUrl().equals("http://demoqa.com/tooltip/");
	}
	
	public boolean canClickFramesAndWindows(){
		home.clickFramAndWin();
		return home.getUrl().equals("http://demoqa.com/frames-and-windows/");
	}					
	
	public boolean canClickHomeIcon(){
		home.clickHomeIcon();
		return  home.getUrl().equals("http://demoqa.com/");
	}
	
	public boolean checkFbToolTipTitle(){
		Boolean isThere;
		WebElement face = home.getFaceBook();
		isThere = face.getAttribute("title").equals("Like us on Facebook"); 
		return 	isThere;
	}
	
	public boolean checkTwitToolTipTitle(){
		Boolean isThere;
		WebElement face = home.getTwitter();
		isThere = face.getAttribute("title").equals("Follow us on Twitter");
		return 	isThere;
	}
	
	public boolean checkGplusToolTipTitle(){
		Boolean isThere;
		WebElement face = home.getGplus();
		isThere = face.getAttribute("title").equals("Circle us on Google Plus");
		return isThere;
	}
	
	public boolean canClickToolsQaLink(){
		home.clickTools();
		return home.getUrl().equals("http://www.toolsqa.com/");
	}
	
	public boolean canClickPoweredLink(){
		home.clickPowered();
		home.switchToNewWindow();
		return home.getUrl().equals("http://oneiricindia.com/");
		
	}
}
