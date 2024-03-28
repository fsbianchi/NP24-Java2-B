package br.com.senaisp.bauru.felipe.licao06.lacowhile;

public class Shape {
	public void criarRetangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// aqui começa o código
			for (int lin = 1; lin <= alt; lin++) {
				for (int col = 1; col <= lar; col++) {
					if (lin == 1 || lin == alt || col == lar || col == 1) {
						System.out.println("#");
					} else {
						System.out.println(" ");
					} // fim do else
				} // fim do col
				System.out.println();
			} // fim do for lin
		} // fim de código

	}// fim do criarRetangulo

	public void criarTriangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// aqui começa o código
			for (int lin = 1; lin <= alt; lin++) {
				for (int col = 1; col <= lar; col++) {
					if (col == 1 || col == lin || lin == alt) {
						System.out.println("#");
					} else {
						System.out.println(" ");
					} // fim do else
				} // fim do col
				System.out.println();
			} // fim do for lin
		} // fim de código

	}
}