package br.com.senaisp.bauru.felipe.licao08.exercicio;

import java.util.Scanner;

public class JogoBlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Baralho br = new Baralho ();
		String jogador01, jogador02;
		int score1=0, score2=0;
		//Pedindo os nomes
		System.out.println("Digite o nome do jogador 1:");
		jogador01 = sc.nextLine();
		
		System.out.println("Digite o nome do jogador 2:");
		jogador02 = sc.nextLine();
		
		Carta ct = br.getCartaAleatoria();
		score1 += ct.getValor();
		System.out.println(ct);
		
		ct = br.getCartaAleatoria();
		score1 += ct.getValor();
		System.out.println(ct);
		
		System.out.println("Mostrando as Cartas do player 2...");
		ct = br.getCartaAleatoria();
		score2 += ct.getValor();
		System.out.println(ct);
		
		ct = br.getCartaAleatoria();
		score2 += ct.getValor();
		System.out.println(ct);
		//Verificando com o player 1 se deseja mais cartas
		String cond = "S";
		while(cond.equals("S"));
		System.out.println("Deseja mais cartas? (S/N)");
		cond = sc.nextLine();
		//se sim, sorteamos uma carta
		if (cond.equals("S")) {
			ct = br.getCartaAleatoria();
			score1 +=ct.getValor();
			System.out.println(ct);
			
		}
	
	}
}
