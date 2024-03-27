package br.com.senaisp.bauru.felipe.licao06.lacowhile;

import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		int tentativas = 0;
		final int PASSOWORD = 1597;
		do {
			System.out.println("Favor digitar a senha");
			senha = sc.nextInt();
			if (senha != PASSOWORD) {
				System.out.println("Senha inválida! Redigite.");
				tentativas++;
			}
		} while (senha != PASSOWORD && tentativas < 3);
		// inicio do if
		if (tentativas < 3) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso bloqueado!");
		} // fim do else
		sc.close();
	}

}
