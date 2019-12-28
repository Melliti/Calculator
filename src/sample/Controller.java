package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public TextField t1;
    public Label l1;
    public Text result;
    public Button button;
    public List<Integer> input = new ArrayList<Integer>();

    public void add() {
        if (input.size() == 0)
            input.add(Integer.parseInt(t1.getText()));
    }

    public void minus() {
        if (input.size() == 0)
            input.add(Integer.parseInt(t1.getText()));
        else {
            result.setText(String.valueOf(input.get(0) + Integer.parseInt(t1.getText())));
            input.clear();
        }
    }
}
