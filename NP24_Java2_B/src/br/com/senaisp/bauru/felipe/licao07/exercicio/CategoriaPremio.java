package br.com.senaisp.bauru.felipe.licao07.exercicio;

import java.util.Random;

public class CategoriaPremio {
	private String nome;
	private int qtdetickets;
	private int saldoPremio;

	// Constructor
	public CategoriaPremio(String nm, int sld) {
		nome = nm;
		saldoPremio = sld;
		Random rnd = new Random();
		qtdetickets = rnd.nextInt(10) + 1;

	}

	public int getSaldoPremio() {
		return saldoPremio;
	}

	public void setSaldoPremio(int saldoPremio) {
		this.saldoPremio = saldoPremio;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdetickets() {
		return qtdetickets;
	}

	public String toSttring() {
		return "=".repeat(30)+ "\n" +
				"Categoria Nome: " + getNome()+"\n" + "Custo Tickets: "+ getQtdetickets()+"\n"+
				"Saldo Prêmios: " + getSaldoPremio();
				}
}
