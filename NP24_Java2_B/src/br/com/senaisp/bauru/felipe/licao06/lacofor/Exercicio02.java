package br.com.senaisp.bauru.felipe.licao06.lacofor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que deseja a tabuada:");
		int num = sc.nextInt();
		for(int i=1;i<=12;i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		} 
		sc.close();
		
	}

}
