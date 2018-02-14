package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FrmContainerController {

	public static Parent parentFrmLancamentosLavagens;

	public static Parent parentFrmCadastro;
	
	public static Parent parentFrmCaminhoBanco;

    @FXML
    private MenuItem mnClientes;
    
	@FXML
	private AnchorPane anchoPane;

	@FXML
	private MenuItem btnLavagens;

	@FXML
	private MenuItem btnUsuarios;
	
    @FXML
    private MenuItem btnBanco;

	@SuppressWarnings("static-access")
	@FXML
	void handleLavagens(ActionEvent event) {

		desativarPainel();

		try {

			parentFrmLancamentosLavagens = FXMLLoader
					.load(getClass().getClassLoader().getResource("view/FrmLancamentosLavagens.fxml"));

			anchoPane.setTopAnchor(parentFrmLancamentosLavagens, 0.0);
			anchoPane.setBottomAnchor(parentFrmLancamentosLavagens, 0.0);
			anchoPane.setLeftAnchor(parentFrmLancamentosLavagens, 0.0);
			anchoPane.setRightAnchor(parentFrmLancamentosLavagens, 0.0);

			anchoPane.getChildren().add(parentFrmLancamentosLavagens);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
    
	@SuppressWarnings("static-access")
	@FXML
	void handleUsuarios(ActionEvent event) {

		desativarPainel();

		try {
			parentFrmCadastro = FXMLLoader.load(getClass().getClassLoader().getResource("view/FrmCadastroUsuario.fxml"));

			anchoPane.setTopAnchor(parentFrmCadastro, 0.0);
			anchoPane.setBottomAnchor(parentFrmCadastro, 0.0);
			
			anchoPane.setLeftAnchor(parentFrmCadastro, 0.0);
			anchoPane.setRightAnchor(parentFrmCadastro, 0.0);
			
			anchoPane.getChildren().add(parentFrmCadastro);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

    @SuppressWarnings("static-access")
	@FXML
    void handleCadastroClientes(ActionEvent event) {
    	
    	desativarPainel();
    	
    	try {
			parentFrmCadastro = FXMLLoader.load(getClass().getClassLoader().getResource("view/FrmCadastroCliente.fxml"));

			anchoPane.setTopAnchor(parentFrmCadastro, 0.0);
			anchoPane.setBottomAnchor(parentFrmCadastro, 0.0);
			
			anchoPane.setLeftAnchor(parentFrmCadastro, 0.0);
			anchoPane.setRightAnchor(parentFrmCadastro, 0.0);
			
			anchoPane.getChildren().add(parentFrmCadastro);

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
	@SuppressWarnings("static-access")
	@FXML
	void handleBanco(ActionEvent event) {

		mostrarTelaBanco();

	}
	
	@SuppressWarnings("static-access")
	public void mostrarTelaBanco() {

		desativarPainel();
		
		try {
			parentFrmCaminhoBanco = FXMLLoader.load(getClass().getClassLoader().getResource("view/FrmCaminhoBanco.fxml"));

			anchoPane.setTopAnchor(parentFrmCaminhoBanco, 0.0);
			anchoPane.setBottomAnchor(parentFrmCaminhoBanco, 0.0);
			
			anchoPane.setLeftAnchor(parentFrmCaminhoBanco, 0.0);
			anchoPane.setRightAnchor(parentFrmCaminhoBanco, 0.0);
			
			anchoPane.getChildren().add(parentFrmCaminhoBanco);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean desativarPainel() {
		anchoPane.getChildren().clear();
		return true;
	}

}