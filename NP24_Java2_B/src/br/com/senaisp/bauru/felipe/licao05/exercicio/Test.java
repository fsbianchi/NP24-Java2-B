package br.com.senaisp.bauru.felipe.licao05.exercicio;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Comparando Strings
		//O valor z é definido como sendo a concatenação de x+y
		//Quando uma expressão booliana testa a igualdade entre z e a concatenação de x+y, o resuldade é false
		
		String x = "Ora";
		String y = "cle";
		String z = x + y;
		boolean test = (z== x + y);
		System.out.println(test);		//Falso
		
		
		
		String x3 = "Ora";
		String y3 = "cle";
		String z4 = x3 + y3;
		boolean test3 = z4.equals(x3 + y3);
		System.out.println(test3);		//Verdadeiro
		
		//Comparando Primitivas
		//O valor de z2 é definido como a soma de x + y
		//Quando uma expressão booliana testa a igualdade z e a soma de x2+y2, o resultado é true
		int x2 = 3;
		int y2 = 2;
		int z2= x2 + y2;
		
		boolean test2 = (z2 == x2 + y2);
		System.out.println(test2);
	}

}
