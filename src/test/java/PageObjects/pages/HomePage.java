package PageObjects.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void recusarSalvarLogin() {
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div/div/button")).click();
	}
	
	public void recusarNotificacoes() {
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/button[2]")).click();
	}
	
	public void irParaMensagens() {
		driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[2]/a"));
	}

}
