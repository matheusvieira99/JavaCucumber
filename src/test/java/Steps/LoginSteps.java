package Steps;

import PageObjects.pages.HomePage;
import PageObjects.pages.LoginPage;
import Senha.Password;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps extends BaseSteps {
	Password password;
	
	public LoginSteps() {

	}

	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	
	


//	public LoginSteps(LoginPage LoginPage) {
//		loginPage = LoginPage;
//	}


	@Dado("que usuário está na página de login")
	public void que_usuário_está_na_página_de_login() {
	    loginPage.abrirPagina("https://instagram.com");
	    loginPage.maximizarPagina();

	}

	@Quando("usuário insere username e senha")
	public void usuário_insere_username_e_senha() {
	    loginPage.inserirUsername("matheusdepvieira");
	    Password pass = new Password();
		loginPage.inserirSenha(pass.password);

	}

	@Quando("clica no botão de login")
	public void clica_no_botão_de_login() {
	    loginPage.acionarBtnLogin();

	}

	@Então("usuário é direcionado para tela home")
	public void usuário_é_direcionado_para_tela_home() {
	    homePage.recusarSalvarLogin();
	    homePage.recusarNotificacoes();

	}


}
