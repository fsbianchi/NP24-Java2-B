package br.com.senaisp.bauru.felipe.licao05.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da cor (1,2 ou 3):");
		int codigo = sc.nextInt(); 
		String cor = "Cor inválida";
		if (codigo == 1 ) {
			cor = "Próxima luz do semáforo será verde";
		} else if (codigo == 2) {
			cor = "Proxima luz do semáforo será amarelo";
	    } else if (codigo == 3) {
		   cor = "Proxima luz do semáforo será vermelho";
	}
}
}