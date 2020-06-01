package model;

public class Aeronave {
	//atributos
	private String nome;
	private String tamanho;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void voar() {
		System.out.println(" A Aeronave " + this.nome + " está voando");
	}
	
		
	

}		