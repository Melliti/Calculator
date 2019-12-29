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
    public String sign = "";

    // This function bloc non numeric input
    @FXML public void formatter() {
        if (t1.getText().length() >= 1)
        {
            if (!Character.isDigit(t1.getText().charAt(t1.getText().length() - 1)))
                t1.setText(value.getText());
            else
                value.setText(t1.getText());
        }
    }

    public void clearField() {
        result.setText("");
        value.setText("");
        t1.clear();
    }

    public void submit() {
        System.out.println(this.sign);
        System.out.println("ok");
    }

    public void add() {
        this.sign = "+";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) + Integer.parseInt(t1.getText())));
        t1.clear();
    }

    public void minus() {
        this.sign = "-";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) - Integer.parseInt(t1.getText())));
        t1.clear();
    }

    public void mult() {
        this.sign = "*";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) * Integer.parseInt(t1.getText())));
        t1.clear();
    }

    public void divide() {
        this.sign = "/";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Integer.parseInt(result.getText()) / Integer.parseInt(t1.getText())));
        t1.clear();
    }
}
