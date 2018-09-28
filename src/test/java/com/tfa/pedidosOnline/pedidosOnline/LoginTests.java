package com.tfa.pedidosOnline.pedidosOnline;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tfa.pedidosOnline.pedidosOnline.Login;
public class LoginTests{
		
	//public String baseurl = "http://www.pymesonline.ga/Account/Login";
	public String baseurl = "http://newtours.demoaut.com/";
    /*@Test
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
    	System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
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
    }*/
    @Test
	public void ejercicio(){
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//se dirige a la pagina de login
		driver.get(baseurl);
		Login login = new Login(driver);
		login.buscarTermino("dolar");
		Assert.assertTrue(login.resultado().get(1).getText().toLowerCase().contains("dólar"),"los resultados no son correctos");
		driver.close();
	}
	@Test
    public void ejercicio2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        Login login = new Login(driver);
        login.buscarTermino("dolar");
        Thread.sleep(2000);
        login.resultado().get(1).click();
        Assert.assertTrue(login.elemento().isDisplayed(),"los resultados no son correctos");
        driver.close();
    }
    @Test
    public void ejercicio3(){
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        Login login = new Login(driver);
        login.buscarTermino("dolar");
        login.resultadoPag2().click();
        Assert.assertTrue(login.pag2().getText().toLowerCase().contains("página 2"), "los resultados no son correctos");
        driver.close();

    }
    @Test
	public void ejercicio4(){
    	System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get(baseurl);
    	Login login = new Login(driver);
    	login.user1().sendKeys("usuario");
    	login.password1().sendKeys("password");
    	login.loginButton().click();
    	driver.close();
    }
    @Test
	public void ejercicio5(){
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		Login login = new Login(driver);
		login.ingresoMal("nico","rodriguez");
	}
	@Test
	public void ejercicio6(){
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		Login login = new Login(driver);
		login.ingresoBien("mercury", "mercury");
	}
	@Test
	public void ejercicio7(){
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\tfa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		Login login = new Login(driver);
		login.ingresoBien("mercury","mercury");
		login.pasajeros(3);
		login.desde(6);
		login.hacia("Sydney");

	}

}
