package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the chrome browser using the webdriver
		
				WebDriver driver = new ChromeDriver();

				//Maximize the window
				
				driver.manage().window().maximize();
				
				//navigate to the url
				
				driver.get("https://the-internet.herokuapp.com/iframe");
				//Using ImplicitlyWait for page to wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//locating the iframe element
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
				
				//switch to iframe
				
				driver.switchTo().frame(iframe);
				
				//locating the p tag and sending keys as Hello people
				
				WebElement content = driver.findElement(By.xpath("//p[text()=\"Your content goes here.\"]"));
				
				content.clear();
				
				content.sendKeys("Hello People");
				 //Printing on console
				WebElement text = driver.findElement(By.tagName("p"));
				System.out.println("\n Given Text -> " + text.getText());
				Thread.sleep(3000);
				
				//Close the browser
				
				driver.close();		  

			
				

			

	}

}
