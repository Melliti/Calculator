package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
        System.out.println(t1.getText().length());
        if (t1.getText().length() >= 1)
        {
//            System.out.println();
            System.out.println(t1.getText().length());
            System.out.println(Character.isDigit(t1.getText().charAt(t1.getText().length() - 1)));
            if (!Character.isDigit(t1.getText().charAt(t1.getText().length() - 1)) ||
                    !Character.isDigit(t1.getText().charAt(0)))
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
        if (t1.getText().length() >= 1) {
            if (this.sign.equals("+"))
                add();
            if (this.sign.equals("-"))
                minus();
            if (this.sign.equals("*"))
                mult();
            if (this.sign.equals("/"))
                divide();
        }
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
