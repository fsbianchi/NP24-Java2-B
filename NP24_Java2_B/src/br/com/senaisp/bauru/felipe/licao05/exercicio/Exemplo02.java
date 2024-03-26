package br.com.senaisp.bauru.felipe.licao05.exercicio;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class Exemplo02 {

	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner sc  = new Scanner(System.in);
		boolean bDataValida = false;
		System.out.println("Digite a sua data de nascimento:");
		String xDtNasc = sc.next();
		
		Scanner sc2 = new Scanner(xDtNasc);
		//usando a barra como delimitador
		sc2.useDelimiter("/");
		//Pegado as partes da data
		dia = sc2.nextInt();
		mes = sc2.nextInt();
		ano = sc2.nextInt();
		//fechando o Scanner 2
		sc2.close();
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Ano: " + ano);
		//verificando se a data é válida
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:bDataValida = dia >=1 && dia <=31; break;
		case 4:
		case 6:
		case 9:
		case 11:bDataValida = dia>=1 && dia <=30; break;
		case 2:bDataValida = dia>=1 && dia <=28 ||
							 dia>=1 && dia <=29 && ano%4==0 && ano%100!=0||
							 dia>=1 && dia <29 && ano%400==0; break;
		
		
	}
		if (bDataValida)//Vai executar spomoente uma linha
			System.out.println("Data é Valida");
		else //somente 1 comando se não tiver a {
			System.out.println("Data é valida");
	
}
	
}
