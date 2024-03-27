package br.com.senaisp.bauru.felipe.licao06.lacowhile;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		while(opc<1 || opc>15 /*condição*/) {
				//bolco de execução
		System.out.println("Digite um valor entre 1 e 15:");
		opc = sc.nextInt();
	}
		System.out.println("Fim do jogo");
		//exemplo do while
		int idade;
		do { 
			System.out.println("Digite um valor entre 1 e 10:");
			idade = sc.nextInt();
			
				
		}while (idade>5 || idade>10);
		
		sc.close();
	}
}