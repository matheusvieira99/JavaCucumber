package PageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MensagensPage extends BasePage {

	public MensagensPage(WebDriver driver) {
		super(driver);
	}
	
	public void acionarBtnMensagem() {
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[2]/a")).click();
	}
	
	public void acionarBtnDeNovaMensagem() {
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div/div[1]/div[1]/div/div[3]/button")).click();
	}
	
	public void digitarUsuario(String user) {
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[1]/div/div[2]/input")).sendKeys(user);
	}
	
	public void selecionarUsuario() {
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div/div/div[3]/button")).click();
	}
	
	public void acionarBtnAvancar() {
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div/div[2]/div/button")).click();
	}
	
	public void digitarMensagem(String msg) {
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")).sendKeys(msg);
	}
	
	public void acionarEnviar() {
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button")).click();
		
	}
	
//	public void verificarResultado() {
//		
//	}
}
