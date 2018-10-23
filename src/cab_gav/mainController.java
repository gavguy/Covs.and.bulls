package cab_gav;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class mainController {


    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Turn> turn;

    public void inicialize {

        System.out.println("hello!");
    }

    public void go() {
        turnNr++
        int n1 = num1.getValue(1);
        int n2 = num1.getValue(2);
        int n3 = num1.getValue(3);
        int n4 = num1.getValue(4);
        System.out.println("" + n1 + n2 + n3 + n4);
        Turn turn = new Turn();
        turn.setGuess("" + n1 + n2 + n3 + n4);


        turns.getItem();


    }
}
