package com.tfa.pedidosOnline.pedidosOnline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



/*public class PedidosTests {
	public String baseurl = "http://www.pymesonline.ga/Account/Login";
	
	/*@Test
	public void realizarPedido() throws Exception{
		//inicia el Chrome  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaguirre\\workspace\\pedidosOnline\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();    	
    	//se dirige a la pagina de login
		driver.get(baseurl);
		driver.manage().window().maximize();
		//ingresa usuario y contraseña
    	Login login = new Login(driver);
    	login.ingresar("admin@gmail.com", "abc123"); 
    	Inicio inicio = new Inicio(driver);
    	inicio.logoHome().click();
    	//elegir producto segun su ubicacion en la cuadrilla
    	inicio.elegirProductoPorIndice(3);
    	//agregar el producto seleccionado al carrito
    	inicio.botonAgregarCarrito().click();
    	//inicia el proceso de finalizar compra
    	inicio.concluirCompra().click();
    	//ingresa datos de tarjeta    	
    	inicio.finalizarPedido("111111111", "2018-09-10");    	
    	Assert.assertTrue(inicio.textoExitoso().getText().contains("Su compra fue realizada con éxito."), "La compra no fue realizada con exito");
    	//cierra el navegador
    	driver.quit();
	}
	
	
	@Test
	public void buscarProducto(){
		//inicia el Chrome  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaguirre\\workspace\\pedidosOnline\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	//se dirige a la pagina de login
    	driver.get(baseurl);
    	driver.manage().window().maximize();
    	//ingresa usuario y contraseña
    	Login login = new Login(driver);
    	login.ingresar("admin@gmail.com", "abc123"); 
    	Inicio inicio = new Inicio(driver);    	
    	inicio.logoHome().click();
    	//Ingresa el termino del producto a buscar
    	inicio.inputBuscarProducto().sendKeys("correa");
    	inicio.botonBuscar().click();  
    	//verifica si la busqueda arroja resultados
    	Assert.assertTrue(inicio.productos().size() > 0, "Productos no encontrados para esa busqueda");
    	//cierra el navegador
    	driver.quit();
	}
	
}*/
