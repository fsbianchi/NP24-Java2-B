package br.com.senaisp.bauru.felipe.licao04.secao01;

public class FestaAlex {
	//constantes
			final static double IMPOSTO = 0.05;
			final static double GORJETA = 0.15;
			
	public static double CalcularConta(double valor) {
		return valor * ( 1 + IMPOSTO ) * ( 1 +GORJETA );
	}
			
	public static void main(String[] args) {
		
		//inicio da lição
		double pessoa1 = 10;
		double pessoa2 = 12;
		double pessoa3 = 9;
		double pessoa4 = 8;
		double pessoa5 = 7;
		double pessoa6 = 15;
		double pessoa7 = 11;
		double pessoa8 = 30;

 		//vamos as contas
		double total1 = CalcularConta(pessoa1);
		double total2 = CalcularConta(pessoa2);
		double total3 = CalcularConta(pessoa3);
		double total4 = CalcularConta(pessoa4);
		double total5 = CalcularConta(pessoa5);
		double total6 = CalcularConta(pessoa6);
		double total7 = CalcularConta(pessoa7);
		double total8 = CalcularConta(pessoa8);
		
		//Mostrando os valores
		System.out.println("Pessoa 1: $" + total1);
		System.out.println("Pessoa 2: $" + total2);
		System.out.println("Pessoa 3: $" + total3);
		System.out.println("Pessoa 4: $" + total4);
		System.out.println("Pessoa 5: $" + total5);
		System.out.println("Pessoa 6: $" + total6);
		System.out.println("Pessoa 7: $" + total7);
		System.out.println("Pessoa 8: $" + total8);
	}

}
