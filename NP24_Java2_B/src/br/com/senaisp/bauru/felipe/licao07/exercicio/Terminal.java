package br.com.senaisp.bauru.felipe.licao07.exercicio;
//https://github.com/richard-brosler-senai/NP24-Java-B
public class Terminal {
	private static int nId = 0;
	private CategoriaPremio categoria01;
	private CategoriaPremio categoria02;
	private CategoriaPremio categoria03;
	private int numeroTerminal;

	// Constructor
	public void name() {
		numeroTerminal = ++nId;
		categoria01 = new CategoriaPremio("Gold", 25);
		categoria02 = new CategoriaPremio("Silver", 50);
		categoria03 = new CategoriaPremio("Bronze", 75);

	}

	// Getters e Setters
	public CategoriaPremio getCategoria01() {
		return categoria01;
	}

	public CategoriaPremio getCategoria02() {
		return categoria02;
	}

	public CategoriaPremio getCategoria03() {
		return categoria03;
	}

	public int getNumeroTerminal() {
		return numeroTerminal;
	}

	// metódos
	public void consultarSaldoCartao(Cartao ct) {
		System.out.println("Operação Saldo do Cartão");
		System.out.println("-".repeat(20));
		System.out.println(ct);
		System.out.println("-".repeat(20));

	}

	public void carregarCartao(Cartao ct, int valor) {
		System.out.println("Operação: Carregar saldo cartão");
		System.out.println("-".repeat(20));
		int nrCreditos = valor * 2;
		// Atribuindo os créditos
		ct.setCreditos(nrCreditos);
		// Mostrando o saldo do cartão
		System.out.println("-".repeat(20));
	}

	public void transferirCreditos(Cartao ori, Cartao des, int qtde) {
		System.out.println("Operação: tranferência de Créditos");
		System.out.println("-".repeat(20));
		// teste de quantidade
		if (ori.getCreditos() >= qtde) { // posso trocar
			int vlr = ori.getCreditos() - qtde;
			// Ajustando o saldo
			ori.setCreditos(vlr);
			// transferindo os créditos
			des.setCreditos(des.getCreditos() + qtde);
		} else {
			System.out.println("Créditos insuficientes ou Quantidade zero!");
		}
		System.out.println("Cartão Origem");
		System.out.println(ori);
		System.out.println("Cartão Destino");
		System.out.println(des);
		System.out.println("-".repeat(20));

	}
	//Transferir na totalidade
	public void transferirCreditos(Cartao ori, Cartao des) {
		transferirCreditos(ori, des, ori.getCreditos());
	}
	public void consultarPremios() {
		System.out.println("Operação: Consultar Prêmios");
		System.out.println("-".repeat(20));
		System.out.println(categoria01);
		System.out.println(categoria02);
		System.out.println(categoria03);
		System.out.println("-".repeat(20));
	}
	
	public void resgatarPremio(Cartao ct, int nrCategoria) {
		CategoriaPremio apoio = null;
		System.out.println("Operação: Resgatar Prêmio");
		System.out.println("-".repeat(20));
		switch (nrCategoria) {
		case 1: apoio = categoria01; break;
		case 2: apoio = categoria02; break;
		case 3: apoio = categoria03; break;
		default: System.out.println("Categoria Inválida!");	
		
		}
		if (apoio !=null) {
			int qtdNTicket = apoio.getQtdetickets();
			if (ct.getTickets()>=qtdNTicket &&
					apoio.getSaldoPremio()>=1) { //posso trocar
				//debitando os tickets do cartão
				ct.setCreditos(ct.getTickets()- qtdNTicket);
				//Debitar o premio da categoria
				apoio.setSaldoPremio(apoio.getSaldoPremio()-1);			
				
			} else {
				System.out.println("Sem daldo de " + "tickets ou prêmios");
			}
			System.out.println("Prêmios");
			System.out.println(categoria01);
			System.out.println(categoria02);
			System.out.println(categoria03);
			System.out.println("Saldo Cartão");
			System.out.println(ct);
			
		}//if da categoria
	}//fim do metodo troca
}//fim da classe

