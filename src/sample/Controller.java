package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

import javax.xml.soap.Text;

public class Controller {
    public Label tekst;
    public RadioButton rb1;
    public RadioButton rb2;
    public RadioButton rb3;

    public ToggleGroup grupa;


    public void handleClick(ActionEvent actionEvent) {

        if (grupa.getSelectedToggle()!= null){

        rb1.setUserData(rb1.getText());
        rb2.setUserData(rb2.getText());
        rb3.setUserData(rb3.getText());

        tekst.setText(grupa.getSelectedToggle().getUserData().toString());}

        else {tekst.setText("Nic nie wybrano");}
    }

}




