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
        boolean isNumber = true;
        try {
            System.out.println(t1.getText());
            if (t1.getText().length() > 0)
                Float.parseFloat(t1.getText());
        } catch (NumberFormatException e) {
            System.out.println("NOPE !");
            isNumber = false;
            sign = t1.getText().replaceAll("^[\\s\\.\\d]+", "");
        }

        if (!isNumber) {
            t1.setText(t1.getText().replaceAll("[^\\d.]", ""));
            switch (sign) {
                case "+":
                    add();
                    break;
                case "-":
                    minus();
                    break;
                case "/":
                    divide();
                    break;
                case "*":
                    mult();
                    break;
                default:
                    t1.setText(value.getText());
                    t1.positionCaret(value.getText().length());
                    break;

            }
        }
        else
            value.setText(t1.getText());
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
            result.setText(String.valueOf(Float.parseFloat(result.getText()) + Float.parseFloat(t1.getText())));
        t1.clear();
    }

    public void minus() {
        this.sign = "-";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Float.parseFloat(result.getText()) - Float.parseFloat(t1.getText())));
        t1.clear();
    }

    public void mult() {
        this.sign = "*";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Float.parseFloat(result.getText()) * Float.parseFloat(t1.getText())));
        t1.clear();
    }

    public void divide() {
        this.sign = "/";
        if (result.getText() == "")
            result.setText(t1.getText());
        else
            result.setText(String.valueOf(Float.parseFloat(result.getText()) / Float.parseFloat(t1.getText())));
        t1.clear();
    }
}
