package br.com.senaisp.bauru.felipe.licao04.exercicio;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome completo:");
		ProcessadorNome pn = new ProcessadorNome();
		System.out.println(pn.processador(nome));
	}

}
