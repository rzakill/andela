package andela;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Amazon {
	
	public String baseUrl = "https://uat-frontend-webapp.ulesson.com/phone";
	 String chromePath = "/usr/local/bin/chromedriver3";
	  //String fireFoxPath = "webdriver/geckodriver.exe";
	 public WebDriver driver;
	 
	 
	  @Test
	  public void verifyAmazonSamsungFlow() {
		  
		  /*
		   * Identify Operating system and switch drivers
		   */
		  String os = System.getProperty("os.name").toLowerCase();
		  System.out.println(os);
		  
		  if(os.equals("mac"+" "+"os"+" "+"x")) {
		  System.out.println("This is a mac");
		  System.out.println("launching chrome browser"); 

		  System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver3");
	       
		  }
		  else {
			  String chromePath = "drivers/chromedriver.exe";
			  System.out.println("launching chrome browser"); 
		        System.setProperty("webdriver.chrome.driver", chromePath);
		  }
		  
			  /*
			   * Initialize driver and launch url
			   */
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		       //ChromeOptions options = new ChromeOptions();
		        //options.addArguments("--headless");
		        //driver = new ChromeDriver(options);
		        driver.get("https://www.amazon.in/"); 
		       
		 
	        
		        /*
		         * Making sure hamburger menu is visible
		         */
			   WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(12, 1));
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-hamburger-menu")));
		       driver.findElement(By.id("nav-hamburger-menu")).click();
		      
		      
		      	/*
		         * Making sure first link is visible and clicking on it
		         */
		       WebDriverWait waitSubMenu = new WebDriverWait(driver,  Duration.ofSeconds(12, 2));
		       waitSubMenu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/ul[1]/li[16]/a/div")));
		       driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[16]/a/div")).click();
		       
		       
		       String url = driver.getCurrentUrl();
		       System.out.println(url);
		      
		      /*
		       * Click on Televisions Link after checking link is active
		       *
		       */
		  
		       driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(3) > a")).click();
		      /*
		       * Input search filter and submit with the carriage return "\n" if you want to go that way
		       */
		     // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung" + "\n");
		      
		      
		      
		      	/*
		         * Making sure Samsung link is visible and clicking on it
		         */
		       WebDriverWait waitSubSubMenu = new WebDriverWait(driver,  Duration.ofSeconds(12, 2));
	
		       waitSubSubMenu.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#s-refinements > div:nth-child(17) > ul > li:nth-child(2) > span > a")));
		       driver.findElement(By.cssSelector("#s-refinements > div:nth-child(17) > ul > li:nth-child(2) > span > a")).click();
		      
		      
		       WebDriverWait waitForFilter = new WebDriverWait(driver,  Duration.ofSeconds(12, 2));
		       waitForFilter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-autoid-0-announce > span.a-dropdown-label")));
	
		      
		       driver.findElement(By.cssSelector("#a-autoid-0-announce > span.a-dropdown-label")).click();
		       driver.findElement(By.id("s-result-sort-select_2")).click();
		      
		      //driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div.a-section.a-spacing-small.s-padding-left-small.s-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-price-instructions-style > div > a > span:nth-child(1) > span.a-offscreen")).click();
		       WebDriverWait waitForLink = new WebDriverWait(driver,  Duration.ofSeconds(12, 2));
		       waitForLink.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div.a-section.a-spacing-small.s-padding-left-small.s-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")));
		      
	
		      driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div.a-section.a-spacing-small.s-padding-left-small.s-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")).click();
		     
		     
		     
		     	/*
		         * Wait for content to render 
		         */
		      WebDriverWait waitForContent = new WebDriverWait(driver,  Duration.ofSeconds(12, 1));
	     
				     Set<String> handles = driver.getWindowHandles();
				     String currentHandle = driver.getWindowHandle();
				     for (String handle : handles) {
			
				      if (!handle .equals(currentHandle))
				      {
				          driver.switchTo().window(handle);
				      }
				    }
				     
	     	/*
	         * Get feature list
	         */
	         waitForContent.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#feature-bullets > ul")));
	    
	         String source = driver.findElement(By.cssSelector("#feature-bullets > ul")).getText();
	     
	         System.out.println(source);
	    
		  }
	     
	    
	
	  
	  
	  
	  
	  
	  
  @AfterTest
  public void afterTest() {
	  
  }


}
