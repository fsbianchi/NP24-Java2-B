package br.com.senaisp.bauru.felipe.secao05;

import java.util.OptionalLong;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
    	
    	//Início do questionário
        boolean resp = JOptionPane.showConfirmDialog(null,
        		"Você quer mesmo participar?","Participação", JOptionPane.YES_NO_OPTION,
        		JOptionPane.QUESTION_MESSAGE)
        		==JOptionPane.YES_OPTION;
        
        //Para entrada de texto valor padrão
        String msg01 = (String)JOptionPane.showInputDialog(null,"Qual o seu nome completo?","título da caixa de diálogo",
        		JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui");
        
        String msg02 = (String)JOptionPane.showInputDialog(null,"Qual a sua idade?","título da caixa de diálogo",
        		JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui");
        
        String msg03 = (String)JOptionPane.showInputDialog(null,"Qual a sua cidade?","título da caixa de diálogo",
        		JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui");
        
              
        
        String[] acceptableValues = {"São Paulo", "Bahia", "Amazonas"};
        String input01 = (String)JOptionPane.showInputDialog(null,
                "Qual o seu estado?",
                "Dialog Title",
                JOptionPane.QUESTION_MESSAGE,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        
     
    }   
}