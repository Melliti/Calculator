package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField t1;
    public Label l1;
    public Text result;
    public Text value = new Text("");
    public Button button;

    @FXML public void formatter() {
        if (!Character.isDigit(t1.getText().charAt(t1.getText().length() - 1)))
            t1.setText(value.getText());
        else
            value.setText(t1.getText());
    }

    public void add() {
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) + Integer.parseInt(t1.getText())));
        t1.clear();
    }

    public void minus() {
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) - Integer.parseInt(t1.getText())));
        t1.clear();
    }

    public void mult() {
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) * Integer.parseInt(t1.getText())));
        t1.clear();
    }

    public void divide() {
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) / Integer.parseInt(t1.getText())));
        t1.clear();
    }
}
