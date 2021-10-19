package Steps;

import PageObjects.pages.HomePage;
import PageObjects.pages.LoginPage;
import PageObjects.pages.MensagensPage;
import Senha.Password;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class MensagemSteps extends BaseSteps{
	HomePage homePage = new HomePage(driver);
	LoginPage loginPage = new LoginPage(driver);
	MensagensPage mensagemPage = new MensagensPage(driver);
	
	
	@Dado("que usuário está na página home")
	public void que_usuário_está_na_página_home() {
		loginPage.abrirPagina("https://instagram.com");
	    loginPage.maximizarPagina();
	    loginPage.inserirUsername("matheusdepvieira");
	    Password pass = new Password();
		loginPage.inserirSenha(pass.password);
		loginPage.acionarBtnLogin();
		homePage.recusarSalvarLogin();
	    homePage.recusarNotificacoes();
	    homePage.irParaMensagens();
		
	    
	}

	@Quando("o usuário aciona o botão de direct, no canto superior direito, entre os ícones home e explorer")
	public void o_usuário_aciona_o_botão_de_direct_no_canto_superior_direito_entre_os_ícones_home_e_explorer() {
		mensagemPage.acionarBtnMensagem();
	    
	}

	@Quando("aciona o botão de nova mensagem, ao lado da username do usuário")
	public void aciona_o_botão_de_nova_mensagem_ao_lado_da_username_do_usuário() {
		mensagemPage.acionarBtnDeNovaMensagem();
	    
	}

	@Quando("digita o usuário {string} no campo Para:")
	public void digita_o_usuário_no_campo(String user) {
		mensagemPage.digitarUsuario("matheusdepvieira");
		//driver.findElement(By.xpath(""))
	    
	}
	
	@Quando("seleciona o usuário matheusdepvieira")
	public void seleciona_o_usuário_matheusdepvieira() {
	    mensagemPage.selecionarUsuario();
	}

	@Quando("aciona o botão Avançar")
	public void aciona_o_botão() {
		mensagemPage.acionarBtnAvancar();
	   
	}

	@Quando("digita a mensagem {string} no campo Mensagem...")
	public void digita_a_mensagem_no_campo(String msg) {
		mensagemPage.digitarMensagem("oi");
	    
	}
	
	@Quando("aciona o botão Enviar")
	public void aciona_o_botão_enviar() {
		mensagemPage.acionarEnviar();
	}

	@Então("a mensagem é enviada ao usuário matheusdepvieira")
	public void a_mensagem_é_enviada_ao_usuário_matheusdepvieira() {
	    
	}

}
