package br.com.senaisp.bauru.felipe.licao04.exercicio;

public class ProcessadorNome {
	public String processador(String nome) {
		//Pegando o sobrenome
		String sbnom = nome.substring(nome.lastIndexOf(' ')+1);
		String iniNom = ""+nome.charAt(0)+".";
		return sbnom + ", " + iniNom;

}
	}
