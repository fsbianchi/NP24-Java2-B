package br.com.senaisp.bauru.felipe.licao04.exercicio;

import java.util.Random;

public class MestodosCalculos {
	/**
	 * Método que calculaa temperatura Celsius a partir de uma 
	 * temperatura em Fahrenheit.
	 * @param temp Informar a temperatura em °C
	 * @return Retorna a temperatura em °C
	 */
	public double converterF2c(double temp) {
		return (temp -32) * 5 / 9;
	}
	
	/**
	 * Método que calcula a Hipotenusa
	 * @param co informar o cateto oposto
	 * @param ca
	 * @return
	 */
	
	public double calcularHipotunusa(double co,double ca) {
		return Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
		
	public int jogarDados() {
		Random rnd = new Random();
		return rnd.nextInt(6)+1+ rnd.nextInt(6) +1;
}
}
