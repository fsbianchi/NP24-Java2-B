package br.com.senaisp.bauru.felipe.secao05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploScanner02 {

	public static void main(String[] args) {
		Scanner scn;
		String data = JOptionPane.showInputDialog(null, "digite uma data","Sistema de data",
				JOptionPane.QUESTION_MESSAGE);
		scn = new Scanner (data);
		scn.useDelimiter("/");
		int dia, mês, ano;
		dia = scn.nextInt();
		mês = scn.nextInt();
		ano = scn.nextInt();
		System.out.println(dia + " de " + mês + ano);
		

	}

}