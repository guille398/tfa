package com.tfa.pedidosOnline.pedidosOnline;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tfa.pedidosOnline.pedidosOnline.Login;
public class LoginTests{
		
	public String baseurl = "http://www.pymesonline.ga/Account/Login";
	
    @Test
    public void ingresarAPagina(){
    	//inicia el Chrome  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaguirre\\workspace\\pedidosOnline\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();	
    	//se dirige a la pagina de login
		driver.get(baseurl);
		//ingresa usuario y contraseña
    	Login login = new Login(driver);
    	login.ingresar("admin@gmail.com", "abc123");    	
    	Inicio inicio = new Inicio(driver);
    	//Verificar que el usuario se pudo conectar satisfactoriamente
    	Assert.assertTrue(inicio.logoHome().isDisplayed(), "El usuario no pudo ingresar a la aplicacion");
    	//cierra el navegador
    	driver.quit();
    }
    
    @Test
    public void registrarUsuario(){
    	String name =  RandomStringUtils.randomAlphabetic(8);
    	String user = (name+"@test.com");
    	String pass = "abc123";
    	//inicia el Chrome  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaguirre\\workspace\\pedidosOnline\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();	
    	//se dirige a la pagina de login
    	driver.get(baseurl);
    	Login login = new Login(driver);
    	//accede al formulario de registro    	
    	login.registrarLink().click();
    	//ingresa campos
    	login.registrarUsuario(name, user, pass);
    	//Verificar que el usuario se pudo conectar satisfactoriamente
    	Inicio inicio = new Inicio(driver);
    	Assert.assertTrue(inicio.logoHome().isDisplayed(), "El usuario no pudo ingresar a la aplicacion");
    	//cierra el navegador
    	driver.quit();
    }
}
