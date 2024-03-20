package br.com.senaisp.bauru.felipe.secao05;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    	String xVlr = JOptionPane.showInputDialog("Digite valor inteiro");
    	JOptionPane.showConfirmDialog(null, xVlr);
    	
    	
        //Parse the input as an int.
        //Print its value +1
        JOptionPane.showConfirmDialog (null, Integer.parseInt(xVlr)+1);
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int valor = Integer.parseInt(JOptionPane.showInputDialog("digite o valor:"));
        
       JOptionPane.showConfirmDialog (null,valor);

        
    }
}
