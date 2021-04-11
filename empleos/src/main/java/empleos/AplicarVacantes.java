package empleos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AplicarVacantes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desarrollo\\eclipse-workspace\\empleos\\src\\main\\chromedriver.exe");
		
		WebDriver empleos=new ChromeDriver();
		empleos.manage().window().maximize();
		empleos.get("https://www.choucairtesting.com/job/analista-de-pruebas-bogota/");
		
		empleos.findElement(By.xpath("//img[contains(@src,'https://www.choucairtesting.com/wp-content/uploads/2019/07/analista_pruebas.jpg')]")).click();
		
		JavascriptExecutor jsa = (JavascriptExecutor)empleos;
			jsa.executeScript("arguments[0].scrollIntoView(true)", empleos.findElement(By.xpath("//img[contains(@src,'https://www.choucairtesting.com/wp-content/uploads/2019/07/analista_pruebas.jpg')]")));
			Thread.sleep(4000);
			//empleos.findElement(By.xpath("//article[@id='post-7547']/div/div[2]/div[3]/input")).click();
			
			empleos.findElement(By.xpath("//input[@value='Apply for job']")).click();
			
			empleos.findElement(By.xpath("//input[@id='nombre-completo']")).sendKeys("Diego Parra");
			Thread.sleep(800);
			empleos.findElement(By.xpath("//input[@id='correo-electronico']")).sendKeys("Diego@gmail.com");
		    Thread.sleep(800);
			empleos.findElement(By.xpath("//input[@id='celular-o-telefono-de-contacto']")).sendKeys("311121314");
		    Thread.sleep(800);
		    empleos.findElement(By.xpath("//textarea[@id='que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente']")).sendKeys("ing proceso");
		    Thread.sleep(800);
			empleos.findElement(By.xpath("//textarea[@id='que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica']")).sendKeys("1");
			JavascriptExecutor js = (JavascriptExecutor)empleos;
			js.executeScript("arguments[0].scrollIntoView(true)", empleos.findElement(By.xpath("//input[@id='celular-o-telefono-de-contacto']")));
			Thread.sleep(300);
			empleos.findElement(By.xpath("//textarea[@id='conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica']")).sendKeys("si");
			Thread.sleep(800);
			empleos.findElement(By.xpath("//input[@id='cual-es-tu-aspiracion-salarial']")).sendKeys("2600000");
			Thread.sleep(800);
			JavascriptExecutor jsc = (JavascriptExecutor)empleos;
			jsc.executeScript("arguments[0].scrollIntoView(true)", empleos.findElement(By.xpath("//input[@id='cual-es-tu-aspiracion-salarial']")));
			Thread.sleep(300);
			empleos.findElement(By.xpath("//input[@id='si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias']")).sendKeys("inmediata");
			Thread.sleep(800);
			empleos.findElement(By.xpath("//textarea[@id='mensaje-adicional']")).sendKeys("prueba");
			Thread.sleep(800);	
			Actions action = new Actions(empleos);
			empleos.findElement(By.name("cv[]")).sendKeys("C:\\Users\\desarrollo\\Desktop\\Personal\\HV Diego Parra.docx");
			action.doubleClick();
			
			
			empleos.findElement(By.xpath("//input[@value='Send application']")).click();
			Thread.sleep(3000);

	}

}
