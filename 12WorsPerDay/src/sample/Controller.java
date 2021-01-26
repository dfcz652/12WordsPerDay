package sample;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane P1Start;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private AnchorPane AP1Start;

    @FXML
    private Label L1Process;

    @FXML
    private AnchorPane APProsess;

    @FXML
    private Button StartButton;

    @FXML
    private Button BTest1;

    @FXML
    void MPressed(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #091533;");
    }

    @FXML
    void MReleased(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #2E3348;");
    }

    @FXML
    void MEntered(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #091533;");
    }

    @FXML
    void MExited(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #2E3348;");
    }

    @FXML
    void initialize() {
        L1Process.setText(String.valueOf(new Date()));
        //StartButton.setOnAction(event -> OpenThatWords());
    }



    public void OpenThatWords(){
        APProsess.setVisible(true);
        AP1Start.setVisible(false);
        L1.setVisible(false);
    }

}