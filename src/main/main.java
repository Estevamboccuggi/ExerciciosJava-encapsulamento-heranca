package main;

import model.Aeronave;
import model.Eletrodomestico;

public class main {

	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		aeronave.setNome("Sputnik");
		eletrodomestico.setMarca("Caféteira");
		
		aeronave.voar();
		eletrodomestico.ligar();
		eletrodomestico.desligar();
	}

}
