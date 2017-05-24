package se.iths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShopTest {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testAddToCart() throws InterruptedException {
		
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		
		WebElement button = driver.findElement(By.xpath(".//*[@id='pageContainer']/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/a/img"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='input-1']/div/button")));
		element.click();
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,-500)", "");
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='open-cart']")));
		element.click();
		
		element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='1']/td[2]")));
		element.getText();
		assertEquals("1 Spring in Action", element.getText());	
		driver.close();
		
	}
	
	@Test
	public void testCheckout() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		
		WebElement button3 = driver.findElement(By.xpath(".//*[@id='pageContainer']/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/a/img"));
		button3.click();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='input-1']/div/button")));
		element.click();
			
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,-500)", "");
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='open-cart']")));
		element.click();
	
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='miniCartDetails']/li/div/a")));
		element.click();
		
		element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mainCartTable']/tbody/tr[1]/td[1]/div/div[2]/span/strong")));
		element.getText();
		assertEquals("Spring in Action", element.getText());	
		driver.close();
	}
	
	@Test
	public void testCheckWebBooks () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMain']/li[1]/a/span")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMain']/li[1]/ul/li/div/div/ul/li/a")));
		element.click();
		
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mainContent']/header/div[1]/div/h2")));
		element.getText();
		assertEquals("Web", element.getText());
		driver.close();
	}
	
	@Test
	public void testCollection () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMain']/li[1]/a/span")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMain']/li[1]/ul/li/div/div/h4/a")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='shop']/sidebar/ul[2]/li[3]/a")));
		element.click();
		
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='productsContainer']/div/div/div[2]/div/div/h3")));
		element.getText();
		assertEquals("Programming for PAAS", element.getText());
		driver.close();
		
	}
	
	@Ignore
	@Test
	public void testFailRemoveCart () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement button3 = driver.findElement(By.xpath(".//*[@id='pageContainer']/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/a/img"));
		button3.click();
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='input-1']/div/button")));
		element.click();
		
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,-500)", "");
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='open-cart']")));
		element.click();
	
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='miniCartDetails']/li/div/a")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='mainCartTable']/tbody/tr[1]/td[5]/button")));
		
		fail("När man trycker på Remove kraschar sidan");
		
	}
		
	@Test
	public void testSortBy () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMain']/li[1]/a/span")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMain']/li[1]/ul/li/div/div/h4/a")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='filter']")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='filter']/option[3]")));
		element.click();
		
		assertEquals("Price", element.getText());
		driver.close();	
	}
	
	@Test
	public void testRemoveFromCartMPage () throws InterruptedException {
			driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		
		WebElement button = driver.findElement(By.xpath(".//*[@id='pageContainer']/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/a/img"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='input-1']/div/button")));
		element.click();
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,-500)", "");
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='open-cart']")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='1']/td[4]/button")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='open-cart']")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='1']/td[4]/button")));
		element.click();
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='open-cart']")));
		element.click();
		
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='miniCartDetails']/li/h4")));
		element.getText();
		assertEquals("No items in your shopping cart", element.getText());
		driver.close();
		
	}
	
	/*
	 * Kunde inte komma på något sätt att hitta något att asserta med innan den timade ut
	 * Ska fortsätta att leta tills jag hittar något och sen meddela dig. 
	 @Test
	public void testLink () throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='footer']/div[2]/div/div/div[1]/a")));
		element.click();
		
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/header/div/div/div[1]")));
		element.getText();
		assertEquals("Shopizer", element.getText());
		
	}
	*/
}