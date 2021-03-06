package sample;

import java.awt.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import javax.swing.*;


public class Controller {

    int evaluation = 0;

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
    private AnchorPane MainPane;

    @FXML
    private  AnchorPane MondayPane,TuesdayPane,WednesdayPane,ThursdayPane,FridayPane,SaturdayPane,SundayPane;

    @FXML
    private TextField SundayTF1,SundayTF2,SundayTF3,SundayTF4,SundayTF5,SundayTF6,SundayTF7,SundayTF8,SundayTF9,
            SundayTF10;

    @FXML
    private  Button SundayB1;

    @FXML
    private Label L1Process;

    @FXML
    private Label L1StartDayMachine;

    @FXML
    private Label L2StartTimeMachine;

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
        L1StartDayMachine.setText(KonvertDayMachine(TakeDayMashine()));
        L2StartTimeMachine.setText(TakeTimeMashine());
        MainPane.setVisible(true);
        MondayPane.setVisible(false);
        TuesdayPane.setVisible(false);
        WednesdayPane.setVisible(false);
        ThursdayPane.setVisible(false);
        FridayPane.setVisible(false);
        SaturdayPane.setVisible(false);
        SundayPane.setVisible(false);
        //StartButton.setOnAction(event -> OpenThatWords());
    }

    public void SundayTest(){
        if(SundayTF1.getText().equals("town")){
            evaluation++;
        }
        if(SundayTF2.getText().equals("tree")){
            evaluation++;
        }
        if(SundayTF3.getText().equals("history")){
            evaluation++;
        }
        if(SundayTF4.getText().equals("want")){
            evaluation++;
        }
        if(SundayTF5.getText().equals("take")){
            evaluation++;
        }
        if(SundayTF6.getText().equals("give")){
            evaluation++;
        }
        if(SundayTF7.getText().equals("sometimes")){
            evaluation++;
        }
        if(SundayTF8.getText().equals("always")){
            evaluation++;
        }
        if(SundayTF9.getText().equals("private")){
            evaluation++;
        }
        if(SundayTF10.getText().equals("ask")){
            evaluation++;
        }

    }
    public void EndOfTestMessageDialog() {
        SundayTest();
        String DialogMessage = "";
        DialogMessage += "Тест Пройден. Ваша оценка : " + evaluation;
        JOptionPane.showMessageDialog(null, DialogMessage, "", JOptionPane.PLAIN_MESSAGE);
    }

    public String TakeDayMashine(){
        Date currentDate = new Date();
        SimpleDateFormat DayFormat = null;
        DayFormat = new SimpleDateFormat("EEEE");
        String DayFormat1 = DayFormat.format( currentDate );
        //String BigDayFormat = DayFormat1.toUpperCase();
        return DayFormat1;

    }

    public String TakeTimeMashine(){
        Date currentDate = new Date();
        SimpleDateFormat TimeFormat = null;
        TimeFormat = new SimpleDateFormat("k:mm");
        String TimeFormat1 = TimeFormat.format( currentDate );

        return TimeFormat1;

    }

    public String KonvertDayMachine(String aStr) { //Универсальный метод с входящим параметром который делает первую букву входящего параметра Верхнего регистра
        String FirstSymbol = aStr.substring(0,1);
        String BigSymbol = FirstSymbol.toUpperCase();
        String Res = aStr.replaceFirst(FirstSymbol,BigSymbol);

        return Res;
    }

    public void OpenThatWords(){
        String tDay;

        tDay  = TakeDayMashine();

        if(tDay.equals("понедельник")){
            MondayPane.setVisible(true);
            MainPane.setVisible(false);
        }
        if(tDay.equals("вторник")){
            TuesdayPane.setVisible(true);
            MainPane.setVisible(false);
        }
        if(tDay.equals("среда")){
            WednesdayPane.setVisible(true);
            MainPane.setVisible(false);
        }
        if(tDay.equals("четверг")){
            ThursdayPane.setVisible(true);
            MainPane.setVisible(false);
        }
        if(tDay.equals("пятница")){
            FridayPane.setVisible(true);
            MainPane.setVisible(false);
        }
        if(tDay.equals("суббота")){
            SaturdayPane.setVisible(true);
            MainPane.setVisible(false);
        }
        if(tDay.equals("воскресенье")){
            SundayPane.setVisible(true);
            MainPane.setVisible(false);
        }

        else{
            MainPane.setVisible(true);
        }

    }

}