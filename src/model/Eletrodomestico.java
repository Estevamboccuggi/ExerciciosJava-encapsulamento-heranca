package model;

public class Eletrodomestico {

	private String marca;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void ligar() {
		System.out.println(" A " + this.marca + " está ligada");
	}
	
	public void desligar() {
		System.out.println(" A " +  this.marca + " está desligado");
	}
	
}
