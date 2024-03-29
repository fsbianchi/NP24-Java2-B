package br.com.senaisp.bauru.felipe.licao07.exercicio;

public class TesteJogo {

	public static void main(String[] args) {
	
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		//intanciando terminal
		Terminal tm = new Terminal();
		//carregando saldo para cartão
		tm.carregarCartao(ct02, 140);
		tm.carregarCartao(ct01, 50);
		//Criando duas máquinas de jogo

		//criando a maquina
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		MaquinaFliperama m2 = new MaquinaFliperama("LoL");
		//Usar as maquinas
		System.out.println("Jogando....\n\n\n");
		m1.lerCartão(ct01);
		m1.lerCartão(ct02);
		System.out.println("Segunda rodada de jogos...\n\n");
		m1.lerCartão(ct02);
		m2.lerCartão(ct01);
		System.out.println("Transferindo o saldo do cartão...\n\n");
		tm.transferirCreditos(ct01, ct02);
		System.out.println("Tentar jogar com o cartão 1...\n\n");
		m1.lerCartão(ct01);
		System.out.println("Transferir um pouco para o cartão 1...\n\n");
		tm.transferirCreditos(ct01, ct02, 10);
		System.out.println("Consultar saldos de prêmios...\n\n\n");
		tm.consultarPremios();
		System.out.println("Resgatando um dos prêmios");
		tm.resgatarPremio(ct01, 1);

		
				}

}
