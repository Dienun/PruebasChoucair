package empleos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsultarVacantes {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\desarrollo\\eclipse-workspace\\empleos\\src\\main\\chromedriver.exe");
			
			WebDriver empleos=new ChromeDriver();
			empleos.manage().window().maximize();
			empleos.get("https://www.choucairtesting.com/");
			
			empleos.findElement(By.xpath("//a[contains(@href, 'https://www.choucairtesting.com/empleos-testing/')]")).click();
			JavascriptExecutor js = (JavascriptExecutor)empleos;
			js.executeScript("arguments[0].scrollIntoView(true)", empleos.findElement(By.xpath("//input[@id='search_keywords']")));
		    Thread.sleep(800);
		
			JavascriptExecutor keywords = (JavascriptExecutor)empleos;
			Thread.sleep(800);
			keywords.executeScript("arguments[0].scrollIntoView(true)", empleos.findElement(By.xpath("//input[@id='search_keywords']")));
			empleos.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("pruebas");
			Thread.sleep(800);
			JavascriptExecutor location = (JavascriptExecutor)empleos;
			location.executeScript("arguments[0].scrollIntoView(true)", empleos.findElement(By.xpath("//input[@id='search_location']")));
			empleos.findElement(By.xpath("//input[@id='search_location']")).sendKeys("Bogotá");
			empleos.findElement(By.xpath("//li[2]/a/div/h3")).click(); 
			Thread.sleep(1000);
	}

}
