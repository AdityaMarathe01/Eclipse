package devOp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\devops\\chromedriver-win64\\chromedriver.exe"); 
//		create object of web driver
		WebDriver driver = new ChromeDriver();
//		send url to chrome using get
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ASKXGp3RGyt1gGjRQUYnTCdctIjuuFzzYi9azLpg2e1eFzCEySB13hKejWi4h3NRJjDt52we_Azi&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();

		WebElement user_id = driver.findElement(By.id("identifierId"));
		user_id.sendKeys("adityamarathe1102003@gmail.com");
		
//		identify the next button by id and automated next
//		WebElement next = driver.findElement(By.id("identifierNext"));
//		next.click();
		
		WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		next.click();
//		xpath=//tagname[@attribute='value']
//				//input[@inp
		
//		username using XPATH
//		WebElement us_id = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
//		us_id.sendKeys("adityamarathe1102003@gmail.com");
		
		
		
		
		
		
			}

}