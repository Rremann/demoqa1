package PageMethods;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;

import PageObjects.Sortable;

public class SortableMethods {

	 private Sortable sort;
	 
	public SortableMethods(Sortable sort){
		this.sort = sort;

	}
	
	/**
	 * Sorts Element on the Default Functionallity portion of sortable in firefox. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortDefaultFF(){
		sort.clickSortable();
		WebElement itemOne = sort.getDefaultFunc().getFirstBox();
		WebElement itemTwo = sort.getDefaultFunc().getSecondBox();
		WebElement itemThree = sort.getDefaultFunc().getThirdBox();
		WebElement itemFour = sort.getDefaultFunc().getFourthBox();
		WebElement itemFive = sort.getDefaultFunc().getFifthBox();
		WebElement itemSix = sort.getDefaultFunc().getSixthBox();
		WebElement itemSeven = sort.getDefaultFunc().getSeventhBox();
		
		sort.dragToElementAbove(itemOne, itemSeven);
		sort.dragToElementBelow(itemSix, itemTwo);
		sort.dragToElementBelow(itemFive, itemThree);
		
		return sort.getDefaultFunc().getOrder().equals("Item 2 Item 6 Item 3 Item 5 Item 4 Item 1 Item 7");
		
	}
	
	/**
	 * Sorts Element on the Connect List portion of sortable in firefox. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortConnectListFF(){
		sort.clickConnectList();
		
		WebElement gItemOne = sort.getConnectList().getGreyOne();
		WebElement gItemTwo = sort.getConnectList().getGreyTwo();
		WebElement gItemThree = sort.getConnectList().getGreyThree();
		WebElement gItemFour = sort.getConnectList().getGreyFour();
		WebElement gItemFive = sort.getConnectList().getGreyFive();

		WebElement yItemOne = sort.getConnectList().getYellowOne();
		WebElement yItemTwo = sort.getConnectList().getYellowTwo();
		WebElement yItemThree = sort.getConnectList().getYellowThree();
		WebElement yItemFour = sort.getConnectList().getYellowFour();
		WebElement yItemFive = sort.getConnectList().getYellowFive();

		WebElement listOne = sort.getConnectList().getFirstList();
		WebElement listTwo = sort.getConnectList().getSecList();
		
		
		sort.dragToElementBelow(yItemOne, gItemOne);
		sort.dragToElementBelow(yItemTwo, gItemOne);
		sort.dragToElementBelow(yItemThree, gItemThree);
		sort.dragToElementBelow(yItemFour, gItemFour);
		sort.dragToElementBelow(yItemFive, gItemFive);
		
		sort.dragToElementAbove(gItemFive, listTwo);
		sort.dragToElementBelow(gItemFour, gItemFive);
		sort.dragToElementBelow(gItemThree, gItemFour);
		sort.dragToElementBelow(gItemTwo, gItemThree);
		sort.dragToElementBelow(gItemOne, gItemTwo);
		return sort.getConnectList().getLstOneOrder().equals("Item 2 Item 1 Item 3 Item 4 Item 4 Item 3 Item 2 Item 1 Item 5 ") &&
				sort.getConnectList().getLstTwoOrder().equals("Item 5 ");
		
		
	}
	
	/**
	 * Sorts Element on the Display As Grid portion of sortable in firefox. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortDisplayAsGridFF(){
		sort.clickDisplayAsGrid();
		
		
		WebElement boxOne = sort.getDisplay().getOne(); 
		WebElement boxTwo = sort.getDisplay().getTwo(); 
		WebElement boxThree = sort.getDisplay().getThree(); 
		WebElement boxFour = sort.getDisplay().getFour(); 
		WebElement boxFive = sort.getDisplay().getFive(); 
		WebElement boxSix = sort.getDisplay().getSix(); 
		WebElement boxSeven = sort.getDisplay().getSeven(); 
		WebElement boxEight = sort.getDisplay().getEight(); 
		WebElement boxNine = sort.getDisplay().getNine(); 
		WebElement boxTen = sort.getDisplay().getTen(); 
		WebElement boxEleven = sort.getDisplay().getEleven(); 
		WebElement boxTweleve = sort.getDisplay().getTwelve(); 
		
		
		sort.dragToElementsLeft(boxOne, boxTweleve);
		sort.dragToElementsLeft(boxTwo, boxTweleve);
		sort.dragToElementsLeft(boxThree, boxTweleve);
		sort.dragToElementAbove(boxFour, boxTweleve);
		sort.dragToElementsLeft(boxFive, boxTweleve);
		sort.dragToElementsLeft(boxSix, boxTweleve);
		sort.dragToElementsLeft(boxSeven, boxTweleve);
		sort.dragToElementAbove(boxEight, boxTweleve);
		sort.dragToElementsLeft(boxNine, boxTweleve);
		sort.dragToElementsLeft(boxTen, boxTweleve);
		sort.dragToElementsLeft(boxEleven, boxTweleve);
		return sort.getDisplay().getOrder().equals("1 2 3 5 6 7 9 10 11 12 8 4 ");
		
		
		
		
	}
	
	/**
	 * Sorts Element on the portlet portion of sortable in firefox. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortPortletsFF(){
		sort.clickPortlets();
		
		WebElement images = sort.getPortlets().getImages();
		WebElement shopping = sort.getPortlets().getShopping();
		WebElement links = sort.getPortlets().getLinks();
		WebElement feeds = sort.getPortlets().getFeeds();
		WebElement news = sort.getPortlets().getNews();
		
		sort.dragToElementBelow(feeds, links);
		sort.dragToElementsLeft(links, shopping);
		sort.dragToElementsRight(news, images);
		
		return sort.getPortlets().getOrder().equals("Links Shopping Feeds News Images ");
		
	}
	
	/**
	 * Sorts Element on the Default Functionallity portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortDefaultGC(){

		WebElement itemOne = sort.getDefaultFunc().getFirstBox();
		WebElement itemTwo = sort.getDefaultFunc().getSecondBox();
		WebElement itemThree = sort.getDefaultFunc().getThirdBox();
		WebElement itemFour = sort.getDefaultFunc().getFourthBox();
		WebElement itemFive = sort.getDefaultFunc().getFifthBox();
		WebElement itemSix = sort.getDefaultFunc().getSixthBox();
		WebElement itemSeven = sort.getDefaultFunc().getSeventhBox();
		
		sort.dragToElementAbove(itemOne, itemSeven);
		sort.dragToElementBelow(itemSix, itemTwo);
		sort.dragToElementBelow(itemFive, itemThree);
		
		return sort.getDefaultFunc().getOrder().equals("Item 6 Item 2 Item 5 Item 3 Item 4 Item 1 Item 7");
		
	}
	
	/**
	 * Sorts Element on the Connect list portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortConnectListGC(){
		sort.clickConnectList();
		
		WebElement gItemOne = sort.getConnectList().getGreyOne();
		WebElement gItemTwo = sort.getConnectList().getGreyTwo();
		WebElement gItemThree = sort.getConnectList().getGreyThree();
		WebElement gItemFour = sort.getConnectList().getGreyFour();
		WebElement gItemFive = sort.getConnectList().getGreyFive();

		WebElement yItemOne = sort.getConnectList().getYellowOne();
		WebElement yItemTwo = sort.getConnectList().getYellowTwo();
		WebElement yItemThree = sort.getConnectList().getYellowThree();
		WebElement yItemFour = sort.getConnectList().getYellowFour();
		WebElement yItemFive = sort.getConnectList().getYellowFive();

		WebElement listOne = sort.getConnectList().getFirstList();
		WebElement listTwo = sort.getConnectList().getSecList();
		
		
		sort.dragToElementBelow(yItemOne, gItemOne);
		sort.dragToElementBelow(yItemTwo, gItemOne);
		sort.dragToElementBelow(yItemThree, gItemThree);
		sort.dragToElementBelow(yItemFour, gItemFour);
		sort.dragToElementBelow(yItemFive, gItemFive);
		
		sort.dragToElementAbove(gItemFive, listTwo);
		sort.dragToElementBelow(gItemFour, gItemFive);
		sort.dragToElementBelow(gItemThree, gItemFour);
		sort.dragToElementBelow(gItemTwo, gItemThree);
		sort.dragToElementBelow(gItemOne, gItemTwo);

		return sort.getConnectList().getLstOneOrder().equals("Item 1 Item 2 Item 3 Item 4 Item 5 ") &&
				sort.getConnectList().getLstTwoOrder().equals("Item 1 Item 2 Item 3 Item 4 Item 5 ");
		
		
	}
	
	/**
	 * Sorts Element on the display as grid portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortDisplayAsGridGC(){
		sort.clickDisplayAsGrid();
		
		
		WebElement boxOne = sort.getDisplay().getOne(); 
		WebElement boxTwo = sort.getDisplay().getTwo(); 
		WebElement boxThree = sort.getDisplay().getThree(); 
		WebElement boxFour = sort.getDisplay().getFour(); 
		WebElement boxFive = sort.getDisplay().getFive(); 
		WebElement boxSix = sort.getDisplay().getSix(); 
		WebElement boxSeven = sort.getDisplay().getSeven(); 
		WebElement boxEight = sort.getDisplay().getEight(); 
		WebElement boxNine = sort.getDisplay().getNine(); 
		WebElement boxTen = sort.getDisplay().getTen(); 
		WebElement boxEleven = sort.getDisplay().getEleven(); 
		WebElement boxTweleve = sort.getDisplay().getTwelve(); 
		
		
		sort.dragToElementsLeft(boxOne, boxTweleve);
		sort.dragToElementsLeft(boxTwo, boxTweleve);
		sort.dragToElementsLeft(boxThree, boxTweleve);
		sort.dragToElementAbove(boxFour, boxTweleve);
		sort.dragToElementsLeft(boxFive, boxTweleve);
		sort.dragToElementsLeft(boxSix, boxTweleve);
		sort.dragToElementsLeft(boxSeven, boxTweleve);
		sort.dragToElementAbove(boxEight, boxTweleve);
		sort.dragToElementsLeft(boxNine, boxTweleve);
		sort.dragToElementsLeft(boxTen, boxTweleve);
		sort.dragToElementsLeft(boxEleven, boxTweleve);
		return sort.getDisplay().getOrder().equals("1 2 3 4 5 6 7 8 9 10 11 12 ");
		
		
		
		
	}
	
	/**
	 * Sorts Element on the portlet portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortPortletsGC(){
		sort.clickPortlets();
		
		WebElement images = sort.getPortlets().getImages();
		WebElement shopping = sort.getPortlets().getShopping();
		WebElement links = sort.getPortlets().getLinks();
		WebElement feeds = sort.getPortlets().getFeeds();
		WebElement news = sort.getPortlets().getNews();
		
		sort.dragToElementBelow(feeds, links);
		sort.dragToElementsLeft(links, shopping);
		sort.dragToElementsRight(news, images);
		
		return sort.getPortlets().getOrder().equals("Links Shopping Feeds News Images ");
		
	}
	
	
	/**
	 * Sorts Element on the Default Functionallity portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortDefaultSF(){

		WebElement itemOne = sort.getDefaultFunc().getFirstBox();
		WebElement itemTwo = sort.getDefaultFunc().getSecondBox();
		WebElement itemThree = sort.getDefaultFunc().getThirdBox();
		WebElement itemFour = sort.getDefaultFunc().getFourthBox();
		WebElement itemFive = sort.getDefaultFunc().getFifthBox();
		WebElement itemSix = sort.getDefaultFunc().getSixthBox();
		WebElement itemSeven = sort.getDefaultFunc().getSeventhBox();
		
		
		
		return sort.getDefaultFunc().getOrder().equals("Item 6 Item 2 Item 5 Item 3 Item 4 Item 1 Item 7");
		
	}
	
	/**
	 * Sorts Element on the Connect list portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortConnectListSF(){
		sort.clickConnectList();
		
		WebElement gItemOne = sort.getConnectList().getGreyOne();
		WebElement gItemTwo = sort.getConnectList().getGreyTwo();
		WebElement gItemThree = sort.getConnectList().getGreyThree();
		WebElement gItemFour = sort.getConnectList().getGreyFour();
		WebElement gItemFive = sort.getConnectList().getGreyFive();

		WebElement yItemOne = sort.getConnectList().getYellowOne();
		WebElement yItemTwo = sort.getConnectList().getYellowTwo();
		WebElement yItemThree = sort.getConnectList().getYellowThree();
		WebElement yItemFour = sort.getConnectList().getYellowFour();
		WebElement yItemFive = sort.getConnectList().getYellowFive();

		WebElement listOne = sort.getConnectList().getFirstList();
		WebElement listTwo = sort.getConnectList().getSecList();
		
		
		sort.safDrag(yItemOne, gItemOne);
		sort.safDrag(yItemTwo, gItemOne);
		sort.safDrag(yItemThree, gItemThree);
		sort.safDrag(yItemFour, gItemFour);
		sort.safDrag(yItemFive, gItemFive);
		
		sort.safDrag(gItemFive, listTwo);
		sort.safDrag(gItemFour, gItemFive);
		sort.safDrag(gItemThree, gItemFour);
		sort.safDrag(gItemTwo, gItemThree);
		sort.safDrag(gItemOne, gItemTwo);
		return sort.getConnectList().getLstOneOrder().equals("Item 1 Item 2 Item 3 Item 4 Item 5 ") &&
				sort.getConnectList().getLstTwoOrder().equals("Item 1 Item 2 Item 3 Item 4 Item 5 ");
		
		
	}
	
	/**
	 * Sorts Element on the display as grid portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortDisplayAsGridSF(){
		sort.clickDisplayAsGrid();
		
		
		WebElement boxOne = sort.getDisplay().getOne(); 
		WebElement boxTwo = sort.getDisplay().getTwo(); 
		WebElement boxThree = sort.getDisplay().getThree(); 
		WebElement boxFour = sort.getDisplay().getFour(); 
		WebElement boxFive = sort.getDisplay().getFive(); 
		WebElement boxSix = sort.getDisplay().getSix(); 
		WebElement boxSeven = sort.getDisplay().getSeven(); 
		WebElement boxEight = sort.getDisplay().getEight(); 
		WebElement boxNine = sort.getDisplay().getNine(); 
		WebElement boxTen = sort.getDisplay().getTen(); 
		WebElement boxEleven = sort.getDisplay().getEleven(); 
		WebElement boxTweleve = sort.getDisplay().getTwelve(); 
		
		
		sort.dragToElementsLeft(boxOne, boxTweleve);
		sort.dragToElementsLeft(boxTwo, boxTweleve);
		sort.dragToElementsLeft(boxThree, boxTweleve);
		sort.dragToElementAbove(boxFour, boxTweleve);
		sort.dragToElementsLeft(boxFive, boxTweleve);
		sort.dragToElementsLeft(boxSix, boxTweleve);
		sort.dragToElementsLeft(boxSeven, boxTweleve);
		sort.dragToElementAbove(boxEight, boxTweleve);
		sort.dragToElementsLeft(boxNine, boxTweleve);
		sort.dragToElementsLeft(boxTen, boxTweleve);
		sort.dragToElementsLeft(boxEleven, boxTweleve);
		return sort.getDisplay().getOrder().equals("1 2 3 4 5 6 7 8 9 10 11 12 ");
		
		
		
		
	}
	
	/**
	 * Sorts Element on the portlet portion of sortable in chrome. 
	 * Then checks to see if the order is correct.
	 * @return
	 */
	public boolean canSortPortletsSF(){
		sort.clickPortlets();
		
		WebElement images = sort.getPortlets().getImages();
		WebElement shopping = sort.getPortlets().getShopping();
		WebElement links = sort.getPortlets().getLinks();
		WebElement feeds = sort.getPortlets().getFeeds();
		WebElement news = sort.getPortlets().getNews();
		
		sort.dragToElementBelow(feeds, links);
		sort.dragToElementsLeft(links, shopping);
		sort.dragToElementsRight(news, images);
		
		return sort.getPortlets().getOrder().equals("Links Shopping Feeds News Images ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Checks to see if the Bread Crumbs are correct when on the sortable page. 
	 */
	public boolean checkBreadCrumb(){
		return sort.getBreadcrumbs().equals("Home / Sortable");
	}
	

	
	public boolean canClickAboutUs(){
		sort.clickAboutUs();
		return sort.getUrl().equals("http://demoqa.com/about-us/");
	}
	
	public boolean canClickServices(){
		sort.clickServices();
		return sort.getUrl().equals("http://demoqa.com/services/");
	}
	

	public boolean isDemoDropDownShown(){
		sort.clickDemo();
		return sort.isDemoDropVisible();
		
	}
	
	public boolean canClickBlog(){
		sort.clickBlog();
		return sort.getUrl().equals("http://demoqa.com/blog/");

	}
	
	public boolean canClickContact(){
		sort.clickContact();
		return sort.getUrl().equals("http://demoqa.com/contact/");
	}

	public boolean canClickRegistration(){
		sort.clickRegistration();
		return sort.getUrl().equals("http://demoqa.com/registration/");
	}
	
	public boolean canClickDraggable(){
		sort.clickDraggable();
		return sort.getUrl().equals("http://demoqa.com/draggable/");
	}
	
	public boolean canClickDroppable(){
		sort.clickDroppable();
		return sort.getUrl().equals("http://demoqa.com/droppable/");
	}
	
	public boolean canClickResizeable(){
		sort.clickResizeble();
		return sort.getUrl().equals("http://demoqa.com/resizable/");
	}
	
	public boolean canClickSelectable(){
		sort.clickSelectable();
		return sort.getUrl().equals("http://demoqa.com/selectable/");
	}
	
	public boolean canClickSortable(){
		sort.clickSortable();
		return sort.getUrl().equals("http://demoqa.com/sortable/");
	}
	
	public boolean canClickAccordion(){
		sort.clickAccordion();
		return sort.getUrl().equals("http://demoqa.com/accordion/");
	}
	
	public boolean canClickAutoComplete(){
		sort.clickAutoComplete();
		return sort.getUrl().equals("http://demoqa.com/autocomplete/");
	}
	
	public boolean canClickDatePicker(){
		sort.clickDatePicker();
		return sort.getUrl().equals("http://demoqa.com/datepicker/");
	}
	
	public boolean canClickMenu(){
		sort.clickMenu();
		return sort.getUrl().equals("http://demoqa.com/menu/");
	}
	
	public boolean canClickSlider(){
		sort.clickSlider();
		return sort.getUrl().equals("http://demoqa.com/slider/");
	}
	
	public boolean canClickTabs(){
		sort.clickTabs();
		return sort.getUrl().equals("http://demoqa.com/tabs/");
	}
	
	public boolean canClickTooltip(){
		sort.clickTooltip();
		return sort.getUrl().equals("http://demoqa.com/tooltip/");
	}
	
	public boolean canClickFramesAndWindows(){
		sort.clickFramAndWin();
		return sort.getUrl().equals("http://demoqa.com/frames-and-windows/");
	}					
	
	public boolean canClickHomeIcon(){
		sort.clickHomeIcon();
		return  sort.getUrl().equals("http://demoqa.com/");
	}
	
	public boolean checkFbToolTipTitle(){
		Boolean isThere;
		WebElement face = sort.getFaceBook();
		isThere = face.getAttribute("title").equals("Like us on Facebook"); 
		return 	isThere;
	}
	
	public boolean checkTwitToolTipTitle(){
		Boolean isThere;
		WebElement face = sort.getTwitter();
		isThere = face.getAttribute("title").equals("Follow us on Twitter");
		return 	isThere;
	}
	
	public boolean checkGplusToolTipTitle(){
		Boolean isThere;
		WebElement face = sort.getGplus();
		isThere = face.getAttribute("title").equals("Circle us on Google Plus");
		return isThere;
	}
	
	public boolean canClickToolsQaLink(){
		sort.clickTools();
		return sort.getUrl().equals("http://www.toolsqa.com/");
	}
	
	public boolean canClickPoweredLink(){
		sort.clickPowered();
		sort.switchToNewWindow();
		return sort.getUrl().equals("http://oneiricindia.com/");
		
	}
	
	
	
}
