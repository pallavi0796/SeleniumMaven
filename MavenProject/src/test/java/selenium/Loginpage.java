package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Loginpage {
	    @Test
	    public void checkLoginPageheadind2() {
		System.out.println("TC02 : CheckLoginPageheadind2 ");
		System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("file:///D:/SELENIUM/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   
	    String heading =  driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText(); // getText method returning string
		System.out.println("heading >>> "+heading);
	    driver.close();
	    Assert.assertEquals(heading, "JAVA | SELENIUM | PYTHON");
	   	}
	

}
