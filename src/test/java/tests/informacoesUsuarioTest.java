package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class informacoesUsuarioTest {
    private WebDriver navegador;
    @Before
    public void setup(){

        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vanderson\\Documents\\estudos\\paths\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        // Navegando para uma página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

        // Clicar no llink que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        // Identificando o formulário de Login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        // Digitar no campo name "login" que está dentro do formulário de id "signinbox" o texto "fulanodetall"
        formularioSignInBox.findElement(By.name("login")).sendKeys("fulanodetall");

        // Digitar no campo name "password" que está dentro do formulário de id "signinbox" o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        // Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        // Validar que dentro do elemento com class "me" está o texto "Hi, Fulano"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        Assert.assertEquals("Hi, Fulano de Tall", textoNoElementoMe);

    }
    @After
    public void tearDown(){
        //Fechar o navegador
        navegador.quit();
    }

}
