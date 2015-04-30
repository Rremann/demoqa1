package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sortable extends PageObjectBase {

	private static final By INFO = By.cssSelector("article#post-149>div>h2");
	
	// Sortable menu links locators
	private static final By DEFFUNLNK = By.id("ui-id-1");
	private static final By CONLSTLNK = By.id("ui-id-2");
	private static final By DISASGRDLNK = By.id("ui-id-3");
	private static final By PROTLNK = By.id("ui-id-4");

	// Locators inside default functionallity
	private static final By BOXONE = By
			.cssSelector("ul#sortable>li:nth-child(1)");
	private static final By BOXTWO = By
			.cssSelector("ul#sortable>li:nth-child(2)");
	private static final By BOXTHREE = By
			.cssSelector("ul#sortable>li:nth-child(3)");
	private static final By BOXFOUR = By
			.cssSelector("ul#sortable>li:nth-child(4)");
	private static final By BOXFIVE = By
			.cssSelector("ul#sortable>li:nth-child(5)");
	private static final By BOXSIX = By
			.cssSelector("ul#sortable>li:nth-child(6)");
	private static final By BOXSEVEN = By
			.cssSelector("ul#sortable>li:nth-child(7)");	
	private static final By ITEMONE = By
			.xpath("//ul[@id='sortable']//li[.='Item 1']");
	private static final By ITEMTWO = By
			.xpath("//ul[@id='sortable']//li[.='Item 2']");
	private static final By ITEMTHREE = By
			.xpath("//ul[@id='sortable']//li[.='Item 3']");
	private static final By ITEMFOUR = By
			.xpath("//ul[@id='sortable']//li[.='Item 4']");
	private static final By ITEMFIVE = By
			.xpath("//ul[@id='sortable']//li[.='Item 5']");
	private static final By ITEMSIX = By
			.xpath("//ul[@id='sortable']//li[.='Item 6']");
	private static final By ITEMSEVEN = By
			.xpath("//ul[@id='sortable']//li[.='Item 7']");

	
	
	
	
	// Locators inside of connect list
	private static final By GITEMONE = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-default ui-corner-left'][contains(.,'Item 1')]");
	private static final By GITEMTWO = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-default ui-corner-left'][contains(.,'Item 2')]");
	private static final By GITEMTHREE = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-default ui-corner-left'][contains(.,'Item 3')]");
	private static final By GITEMFOUR = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-default ui-corner-left'][contains(.,'Item 4')]");
	private static final By GITEMFIVE = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-default ui-corner-left'][contains(.,'Item 5')]");
	private static final By YITEMONE = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-highlight ui-corner-left'][contains(.,'Item 1')]");
	private static final By YITEMTWO = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-highlight ui-corner-left'][contains(.,'Item 2')]");
	private static final By YITEMTHREE = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-highlight ui-corner-left'][contains(.,'Item 3')]");
	private static final By YITEMFOUR = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-highlight ui-corner-left'][contains(.,'Item 4')]");
	private static final By YITEMFIVE = By
			.xpath("//div[@id='tabs-2']//li[@class='ui-state-highlight ui-corner-left'][contains(.,'Item 5')]");
	private static final By LISTONE = By.id("sortable1");
	private static final By LISTTWO = By.id("sortable2");
	private static final By LISTONEITEMS = By.xpath("//ul[@id='sortable1']//li");
	private static final By LISTTWOITEMS = By.xpath("//ul[@id='sortable2']//li");		
	
	
	// Locators inside of Display as Grid
	private static final By ONE = By.xpath("//li[.='1']");
	private static final By TWO = By.xpath("//li[.='2']");
	private static final By THREE = By.xpath("//li[.='3']");
	private static final By FOUR = By.xpath("//li[.='4']");
	private static final By FIVE = By.xpath("//li[.='5']");
	private static final By SIX = By.xpath("//li[.='6']");
	private static final By SEVEN = By.xpath("//li[.='7']");
	private static final By EIGHT = By.xpath("//li[.='8']");
	private static final By NINE = By.xpath("//li[.='9']");
	private static final By TEN = By.xpath("//li[.='10']");
	private static final By ELEVEN = By.xpath("//li[.='11']");
	private static final By TWELEVE = By.xpath("//li[.='12']");
	private static final By BOXES = By.cssSelector("ul#sortable_grid>li");
	
	
	// Locators insdie of Portlets
	private static final By SHOPPING = By.xpath("//div[.='Shopping']");
	private static final By NEWS = By.xpath("//div[.='News']");
	private static final By LINKS = By.xpath("//div[.='Links']");
	private static final By FEEDS = By.xpath("//div[.='Feeds']");
	private static final By IMAGES = By.xpath("//div[.='Images']");
	private static final By COLONE = By.cssSelector("div.column:nth-child(1)");
	private static final By COLTWO = By.cssSelector("div.column:nth-child(2)");
	private static final By COLTHREE = By.cssSelector("div.column:nth-child(3)");
	private static final By PORTORDER = By.cssSelector("div.portlet-header");
	
	
	public Sortable(WebDriver driver) {
		super(driver);
		
	}

	/**
	 * Returns an instance of the DefaultFunc class.
	 * @return
	 */
	public DefaultFunc getDefaultFunc(){
		return new DefaultFunc();
	}

	/**
	 * Returns an instance of the ConnectList class.
	 * @return
	 */
	public ConnectList getConnectList(){
		return new ConnectList();
	}
	
	/**
	 * Returns an instance of the DisplayAsGrid class.
	 * @return
	 */
	public DisplayAsGrid getDisplay(){
		return new DisplayAsGrid();
	}
	
	/**
	 * Returns an instance of the Portlets class.
	 * @return
	 */
	public portlets getPortlets(){
		return new portlets();
	}
	
	/**
	 * Returns the text stored above the main content on sortable.
	 */
	public String getInfo() {
		return find(INFO).getText();
	}

	// Clicks the links displayed only on the sortable page

	/**
	 * Clicks the "Default functionallity" link
	 */
	public void clickDefaultFunc() {
		find(DEFFUNLNK).click();
	}

	/**
	 * Clicks the "Connect List" link
	 */
	public void clickConnectList() {
		find(CONLSTLNK).click();
	}

	/**
	 * Clicks the "Display as gird" link
	 */
	public void clickDisplayAsGrid() {
		find(DISASGRDLNK).click();
	}

	/**
	 * Clicks the "Portlets" link
	 */
	public void clickPortlets() {
		find(PROTLNK).click();
	}

	// Methods to return WebElements to be used with Actions
	
	
	// Default Functionallity Elements
	public class DefaultFunc {

		/**
		 * Returns the order of the sorted elements 
		 * @return
		 */
		public String getOrder(){
			StringBuilder order = new StringBuilder();
			order.append(find(BOXONE).getText());
			order.append(" ");
			order.append(find(BOXTWO).getText());
			order.append(" ");
			order.append(find(BOXTHREE).getText());
			order.append(" ");
			order.append(find(BOXFOUR).getText());
			order.append(" ");
			order.append(find(BOXFIVE).getText());
			order.append(" ");
			order.append(find(BOXSIX).getText());
			order.append(" ");
			order.append(find(BOXSEVEN).getText());
			
			return order.toString(); 
		}
		
		
		/**
		 * Return the first element in the sortable list.
		 * 
		 * @return
		 */
		public WebElement getFirstBox() {
			return find(ITEMONE);
		}

		/**
		 * Returns the second element in the sortable list.
		 * 
		 * @return
		 */
		public WebElement getSecondBox() {
			return find(ITEMTWO);
		}

		/**
		 * Returns the third element in the sortable list.
		 * 
		 * @return
		 */
		public WebElement getThirdBox() {
			return find(ITEMTHREE);
		}

		/**
		 * Return the fourth element in the sortable list.
		 * 
		 * @return
		 */
		public WebElement getFourthBox() {
			return find(ITEMFOUR);
		}

		/**
		 * Returns the fifth element in the sortable list.
		 * 
		 * @return
		 */
		public WebElement getFifthBox() {
			return find(ITEMFIVE);
		}

		/**
		 * Returns the sixth element in hte sortable list.
		 * 
		 * @return
		 */
		public WebElement getSixthBox() {
			return find(ITEMSIX);
		}

		/**
		 * Returns the seventh element in the sortable list.
		 * 
		 * @return
		 */
		public WebElement getSeventhBox() {
			return find(ITEMSEVEN);
		}
	}

	// Connect List Elements
	public class ConnectList {
		
		
		/**
		 * Returns the order of the sorted elements from list one.
		 * @return
		 */
		public String getLstOneOrder(){
			List<WebElement> listOne = driver.findElements(LISTONEITEMS);
			StringBuilder order = new StringBuilder();
			for(WebElement ele: listOne){
				order.append(ele.getText() + " ");
			}
			return order.toString();
		}
		
		/**
		 * Returns the order of the sorted elements from list two.
		 * @return
		 */
		public String getLstTwoOrder(){
			List<WebElement> listTwo = driver.findElements(LISTTWOITEMS);
			StringBuilder order = new StringBuilder();
			for(WebElement ele: listTwo){
				order.append(ele.getText() + " ");
			}
			return order.toString();
			
		}
		
		
		/**
		 * Returns the first list element.
		 */
		public WebElement getFirstList(){
			return find(LISTONE);
		}
		
		/**
		 * Returns the second list element.
		 */
		public WebElement getSecList(){
			return find(LISTTWO);
		}
		
		/**
		 * Returns the greyed out "Item 1"
		 * 
		 * @return
		 */
		public WebElement getGreyOne() {
			return find(GITEMONE);
		}

		/**
		 * Returns the greyed out "Item 2"
		 * 
		 * @return
		 */
		public WebElement getGreyTwo() {
			return find(GITEMTWO);
		}

		/**
		 * Returns the greyed out "Item 3"
		 * 
		 * @return
		 */
		public WebElement getGreyThree() {
			return find(GITEMTHREE);
		}

		/**
		 * Returns the greyed out "Item 4"
		 * 
		 * @return
		 */
		public WebElement getGreyFour() {
			return find(GITEMFOUR);
		}

		/**
		 * Returns the greyed out "Item 5"
		 * 
		 * @return
		 */
		public WebElement getGreyFive() {
			return find(GITEMFIVE);
		}

		/**
		 * Returns the highlighted "Item 1"
		 * 
		 * @return
		 */
		public WebElement getYellowOne() {
			return find(YITEMONE);
		}

		/**
		 * Returns the greyed out "Item 2"
		 * 
		 * @return
		 */
		public WebElement getYellowTwo() {
			return find(YITEMTWO);
		}

		/**
		 * Returns the greyed out "Item 3"
		 * 
		 * @return
		 */
		public WebElement getYellowThree() {
			return find(YITEMTHREE);
		}

		/**
		 * Returns the greyed out "Item 4"
		 * 
		 * @return
		 */
		public WebElement getYellowFour() {
			return find(YITEMFOUR);
		}

		/**
		 * Returns the greyed out "Item 5"
		 * 
		 * @return
		 */
		public WebElement getYellowFive() {
			return find(YITEMFIVE);
		}
	}

	// Display as Grid Elements

	public class DisplayAsGrid {

		/**
		 * Returns the order of the sorted elements 
		 * @return
		 */
		public String getOrder(){
			List<WebElement> boxes = driver.findElements(BOXES);
			StringBuilder order = new StringBuilder();
			
			for(WebElement ele : boxes){
				order.append(ele.getText() + " ");
			}
			return order.toString();
		}
		
		
		/**
		 * Returns the box with the number one.
		 * @return
		 */
		public WebElement getOne() {
			return find(ONE);
		}

		/**
		 * Retuns the box with the number two.
		 * @return
		 */
		public WebElement getTwo() {
			return find(TWO);
		}

		/**
		 * Returns the box with the number three.
		 * @return
		 */
		public WebElement getThree() {
			return find(THREE);
		}

		/**
		 * Returns the box with the numbe four.
		 * @return
		 */
		public WebElement getFour() {
			return find(FOUR);
		}

		/**
		 * Returns the box with the number five.
		 * @return
		 */
		public WebElement getFive() {
			return find(FIVE);
		}

		/**
		 * Returns the box with the number six.
		 * @return
		 */
		public WebElement getSix() {
			return find(SIX);
		}

		/**
		 * Returns the box with the number seven.
		 * @return
		 */
		public WebElement getSeven() {
			return find(SEVEN);
		}

		/**
		 * Returns the box with the number eight.
		 * @return
		 */
		public WebElement getEight() {
			return find(EIGHT);
		}
		
		/**
		 * Returns the box with the number nine.
		 * @return
		 */
		public WebElement getNine() {
			return find(NINE);
		}

		/**
		 * Returns the box with the number ten.
		 * @return
		 */
		public WebElement getTen() {
			return find(TEN);
		}

		/**
		 * Returns the box with the number eleven.
		 * @return
		 */
		public WebElement getEleven() {
			return find(ELEVEN);
		}

		/**
		 * Returns the box with the number twelve.
		 * @return
		 */
		public WebElement getTwelve() {
			return find(TWELEVE);
		}
	}
	
	// Portlet Elements 
	public class portlets{
		
		/**
		 * Returns the order of the sorted elements 
		 * @return
		 */
		public String getOrder(){
			List<WebElement> boxes = driver.findElements(PORTORDER);
			StringBuilder order = new StringBuilder();
			
			for(WebElement ele : boxes){
				order.append(ele.getText() + " ");
			}
			return order.toString();
		}
		
		
		
		/**
		 * Returns the Shopping label element.
		 * @return
		 */
		public WebElement getShopping(){
			return find(SHOPPING);
		}
		
		/**
		 * Returns the News label element.
		 * @return
		 */
		public WebElement getNews(){
			return find(NEWS);
		}
		
		/**
		 * Returns the links label element.
		 * @return
		 */
		public WebElement getLinks(){
			return find(LINKS);
		}
		
		/**
		 * Returns the feeds label element.
		 * @return
		 */
		public WebElement getFeeds(){
			return find(FEEDS);
		}
		
		/**
		 * Returns the images label element. 
		 * @return
		 */
		public WebElement getImages(){
			return find(IMAGES);
		}
	}
	
}
