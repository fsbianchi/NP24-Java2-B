package br.com.senaisp.bauru.felipe.licao07.exercicio;

public class Cartao {
	private static int contador = 0;
	private int numero;
	private int creditos;
	private int tickets;

	// Constructor
	public Cartao() {
		numero = ++contador;
		creditos = 0;
		tickets = 0;

	}

	// metodos
	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public int getNumero() {
		return numero;

	}

	public String toString() {
		return "=".repeat(20) + "\n" + "Nr. cartão: " + getNumero() + "\n" + "Saldo Créditos: " + getCreditos() + "\n"
				+ "Saldo tickets: " + getTickets();
	}
}