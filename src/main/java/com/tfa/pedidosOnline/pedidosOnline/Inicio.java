package com.tfa.pedidosOnline.pedidosOnline;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inicio {
	WebDriver driver;
	
	public Inicio(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement logoHome(){return driver.findElement(By.cssSelector("span.logo-lg>b"));}
	public List<WebElement> productos(){return driver.findElements(By.cssSelector("a.my-class"));}
	public WebElement botonAgregarCarrito(){return driver.findElement(By.cssSelector(".AddLink.btn-block"));}
	public WebElement botonFinalizarCompra(){return driver.findElement(By.cssSelector(".modal-footer>button.btn.btn-primary"));}
	public WebElement botonFinalizar(){return driver.findElement(By.cssSelector(".btn.btn-success.btn-block"));}
	public WebElement numeroTarjeta(){return driver.findElement(By.id("TarjetaCredito"));}
	public WebElement fechaVencimiento(){return driver.findElement(By.id("FechaExpiracion"));}
	public WebElement concluirCompra(){return driver.findElement(By.cssSelector(".btn-primary"));}
	public WebElement textoExitoso(){return driver.findElement(By.cssSelector("h2"));}
	public WebElement inputBuscarProducto(){return driver.findElement(By.id("productosBuscar"));}
	public WebElement botonBuscar(){return driver.findElement(By.cssSelector(".input-group-btn>button.btn.btn-default"));}
	public WebElement AbrirForm(){return driver.findElement(By.cssSelector("i.fa.fa-plus"));}
	
	public void elegirProductoPorIndice(int index){
		this.productos().get(index).click();
	}
	
	public void finalizarPedido(String nroTarjeta, String fecha) throws InterruptedException{			
		this.botonFinalizar().click();
		this.numeroTarjeta().sendKeys(nroTarjeta);
		this.fechaVencimiento().clear();
		this.fechaVencimiento().sendKeys(fecha);
		this.concluirCompra().click();
	}
	
	
}
