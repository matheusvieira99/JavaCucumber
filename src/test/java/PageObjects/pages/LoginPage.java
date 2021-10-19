package PageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void inserirUsername(String username) {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys(username);
		
	}
	
	public void inserirSenha(String senha) {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys(senha);
	}
	
	public void acionarBtnLogin() {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	}
	
	
	
	

}
