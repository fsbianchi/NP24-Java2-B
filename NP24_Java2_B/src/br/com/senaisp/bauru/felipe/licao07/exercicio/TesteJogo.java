package br.com.senaisp.bauru.felipe.licao07.exercicio;

public class TesteJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		//criando a maquina
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		m1.lerCartão(ct02);
				}

}
