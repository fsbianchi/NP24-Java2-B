package br.com.senaisp.bauru.felipe.licao09.exemplo03;



import java.awt.Polygon;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;

public class CoresEFormas extends Application 

{

	public static void main(String[] args) {
		// inicio
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Group root = new Group();
		//Criando componentes
		criarComponentes(root);
		//criando a scena
		Scene scena = new Scene(root,600,400,Color.BLACK);
	
		//Configuração a stage
		primeiraStage.setTitle("Cores e Formas");
		primeiraStage.setScene(scena);
		primeiraStage.show();
		
	}

	private void criarComponentes(Group root) {
		LinearGradient lg = new LinearGradient(0, 0, 0, 0, false, null, )
		Polygon pir = new Polygon(new double[]{
				210.0, 10.0,
				210.0, 210.0,
				10.0, 210.0
			});
		pir.setFill(Color.BLUE);
		//colando no nó root
		root.getChildren().add(pir);	
		
	}

}
