package devops2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\6th Sem\\devOPS\\chromedriver-win64\\chromedriver.exe");
//		create object of web driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");

		
		//test cases verify login success
		WebElement userName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		userName.sendKeys("Admin");
		WebElement password= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		password.sendKeys("admin123");
		WebElement next = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		next.click();
		WebElement msgWelcome= driver.findElement(By.id("welcome"));
		if(msgWelcome.isDisplayed())
		{
			//if(msgWelcome.getText()=="welcome Admin")
			if(msgWelcome.getText().contentEquals("welcome "))
			System.out.println("test pass");
			else
				System.out.println("test fail msg print"+msgWelcome.getText());
				
		}
		else
			System.out.println("test fail");
		

	}
	}


