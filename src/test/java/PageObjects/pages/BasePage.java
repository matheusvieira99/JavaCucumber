package PageObjects.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrirPagina(String url) {
		driver.get(url);	
		
	}
	
	public void maximizarPagina() {
		driver.manage().window().maximize();
	}

}
