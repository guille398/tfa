package com.tfa.pedidosOnline.pedidosOnline;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
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
	
	
	public void ingresar(String email, String password){	   
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
	}
   

}
