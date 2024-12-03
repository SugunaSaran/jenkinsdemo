import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class Bstackdemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
		driver.get("https://bstackdemo.com/signin");
		driver.manage().window().maximize();
		/*WebElement Username_txtbox=driver.findElement(By.xpath("//div[text()='Select Username']"));
		Username_txtbox.click();
		//LOcate and click demouser
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		
		//Locate and click password textbox
		driver.findElement(By.xpath("//div[text()='Select Password']")).click();
		//locate and click the password
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();*/
		WebElement userName=driver.findElement(By.id("username"));
		userName.click();
		//select.sendKeys("fav_user").sendKeys(Keys.ENTER).perform();
		userName.findElement(By.xpath("//div[contains(text(),'fav_user')]")).click();
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id=\"3\"]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"10\"]/div[4]")).click();
		driver.findElement(By.className("buy-btn")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("firstNameInput")).sendKeys("suguna");
		driver.findElement(By.id("lastNameInput")).sendKeys("saran");
		driver.findElement(By.id("addressLine1Input")).sendKeys("petrick rd");
		driver.findElement(By.id("provinceInput")).sendKeys("GA");
		driver.findElement(By.id("postCodeInput")).sendKeys("12345");
		driver.findElement(By.id("checkout-shipping-continue")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button")).click();
		//driver.get("https://bstackdemo.com");
		driver.findElement(By.id("logout")).click();
	}

}
