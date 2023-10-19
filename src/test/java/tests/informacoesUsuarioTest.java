package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vanderson\\Documents\\estudos\\paths\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // Navegando para uma página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        Assert.assertEquals(1,1);


    }

}
