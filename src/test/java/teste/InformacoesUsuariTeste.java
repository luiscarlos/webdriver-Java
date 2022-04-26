package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import junit.framework.Assert.*;

public class InformacoesUsuariTeste {
	

	
	
	@Test
	public void testeAdicionarUmaInformacaoAdicionalNoUsuario() {
		 
		// abrindo o navegador
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\luis.dasilva\\drivers\\chromedriver.exe");		
		  WebDriver navegador = new ChromeDriver();
		  
		  
		  navegador.get("http://www.juliodelima.com.br/taskit");
		  
		//assertEquals(1, 1);
	}
}
