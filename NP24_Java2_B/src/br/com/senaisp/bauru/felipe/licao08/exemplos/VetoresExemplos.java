package br.com.senaisp.bauru.felipe.licao08.exemplos;

public class VetoresExemplos {

	public static void main(String[] args) {
		//Criando um vetor de 50 posições inteiras
		int[] idades = new int[50];
		//Criando de forma estática vetores
		String[] cores  = {"Azul", "Amarelo", "Vermelho", "Verde"};
		//Esse linha representa o mesmo que a anterior
		String[] cor_n = new String[4];
		cor_n[0] = "Azul";
		cor_n[1] = "Amarelo";
		cor_n[2] = "Vermelho";
		cor_n[3] = "Verde";
		//cor_n[4] = "Roxo"; //ArrayIndexOutOfBounds
		//Utilizando o for inf
		for (String item : cores) {
			System.out.println(item);		
		}
			
	}

}
