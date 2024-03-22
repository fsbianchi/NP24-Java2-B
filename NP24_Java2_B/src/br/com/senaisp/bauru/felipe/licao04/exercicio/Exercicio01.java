package br.com.senaisp.bauru.felipe.licao04.exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		
		MetodosCaculo mc = new MetodosCalculo();
		double tempC = mc.converterF2c(60.5);
		System.out.println("temperatura em °C é " + tempC);
		
		//Calculando a hipotenusa 
		double hip = mc.calculoHipotenusa(15, 10);
		System.out.println("Hipotenusa é " + hip);
		
		//Sorteando os valores
		System.out.println("Valores dos dados foi " + mc.jogadorDados());

	}

}
