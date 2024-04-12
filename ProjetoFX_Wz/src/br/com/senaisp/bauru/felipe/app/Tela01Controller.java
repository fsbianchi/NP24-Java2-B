package br.com.senaisp.bauru.felipe.app;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Tela01Controller {

	@FXML TextField txtCodigo;
	@FXML TextField txtDescricao;
	@FXML TextField textSaldo;
	@FXML TextField txtCusto;
	
	@FXML Button btnCancelar;
	@FXML Button btnGravar;
	
	@FXML public void btnGravarAct() {
		System.out.println("Gravar");
		Main.mainStage.setScene(Main.mainScene);
	}
	
	@FXML public void btnCancelarAct() {
		System.out.println("Cancelei");
		Main.mainStage.setScene(Main.mainScene);
	}

	
}
