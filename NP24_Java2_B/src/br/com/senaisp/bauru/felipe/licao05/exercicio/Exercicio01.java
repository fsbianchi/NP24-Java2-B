package br.com.senaisp.bauru.felipe.licao05.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de cor em nm:");
		double nmCor = sc.nextDouble();
		String cor = "Não é uma cor visivél no espectro";
		if (nmCor>=380 && nmCor<450) { 
			cor = "A cor violeta";
		}else if(nmCor>=450 && nmCor<495) {
			cor = "A cor azul";
		}else if(nmCor>=570 && nmCor<590) {
			cor = "A cor verde";
		}else if(nmCor>=590 && nmCor<620) {
			cor = "A cor Amarelo";
		}else if(nmCor>=620 && nmCor<750)
		{  cor = "A cor Laranja";
		}
	}
}
