package com.tfa.pedidosOnline.pedidosOnline;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public String baseurl = "http://newtours.demoaut.com/";
	public Login() {}	
	public WebElement usuarioInput() {return driver.findElement(By.name("Email"));}
	public WebElement contraseñaInput() {return driver.findElement(By.name("Password"));}
	public WebElement botonIngresar(){return driver.findElement(By.cssSelector("button.btn"));}
	public WebElement registrarLink(){return driver.findElement(By.cssSelector("a[href='/Account/Register']"));}	
	public WebElement nombreUsuario() {return driver.findElement(By.id("Nombre"));}
	public WebElement apellidoUsuario() {return driver.findElement(By.id("Apellido"));}
	public WebElement emailUsuario() {return driver.findElement(By.id("Email"));}
	public WebElement password() {return driver.findElement(By.id("Password"));}
	public WebElement repetirPassword() {return driver.findElement(By.id("ConfirmPassword"));}
	public WebElement checkbox() {return driver.findElement(By.cssSelector(".iCheck-helper"));}
	public WebElement campoBuscar() {return driver.findElement(By.cssSelector("input[name='q']"));}
	public WebElement botonBuscar() {return driver.findElement(By.cssSelector("input[name='btnK']"));}


	public WebElement user1() {return driver.findElement(By.cssSelector("input[name='userName']"));}
	public WebElement password1() {return driver.findElement(By.cssSelector("input[name='password']"));}
	public WebElement loginButton() {return driver.findElement(By.cssSelector("input[name='login']"));}
	public WebElement cantidadPasajeros() {return driver.findElement(By.name("passCount"));}
	public WebElement fromDrop() {return driver.findElement(By.name("fromPort"));}
	public WebElement toDrop() {return driver.findElement(By.name("toPort"));}


	public List<WebElement> resultado() {return driver.findElements(By.cssSelector("div>h3"));}
	public WebElement elemento() {return driver.findElement(By.id("h2_header"));}
	public WebElement resultadoPag2() {return driver.findElement(By.cssSelector("td>a"));}
	public WebElement pag2() {return driver.findElement(By.id("resultStats"));}

	/*public void ingresar(String email, String password){
	   this.usuarioInput().sendKeys(email);
	   this.contraseñaInput().sendKeys(password);
	   this.botonIngresar().click();
   }
	
	public void registrarUsuario(String nombre, String email, String pass){
		this.nombreUsuario().sendKeys(nombre);
		this.apellidoUsuario().sendKeys(nombre);
		this.emailUsuario().sendKeys(email);
		this.password().sendKeys(pass);
		this.repetirPassword().sendKeys(pass);
		this.checkbox().click();
		this.botonIngresar().click();
	}*/


	public void buscarTermino(String termino){
		this.campoBuscar().sendKeys(termino);
		this.campoBuscar().sendKeys(Keys.ESCAPE);
		this.botonBuscar().click();
	}
	public void ingresoMal(String usuario, String password){
		this.user1().sendKeys(usuario);
		this.password1().sendKeys(password);
		this.loginButton().click();
		this.driver.close();
	}
	public void ingresoBien(String usuario,String password){
		this.user1().sendKeys(usuario);
		this.password1().sendKeys(password);
		this.loginButton().click();

	}
	public void pasajeros(int cant){
		Select selectPasajeros = new Select(cantidadPasajeros());
		selectPasajeros.selectByVisibleText(Integer.toString(cant));
	}
	public void desde(int index){
		Select selectDesde = new Select(fromDrop());
		selectDesde.selectByIndex(index);
	}
	public void hacia(String city){
		Select selectHacia = new Select(toDrop());
		selectHacia.selectByValue(city);
	}
}
