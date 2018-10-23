package cab_gav;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Pane root = new FlowPane()    //drug za druzkoj       ///sdelali okoshko
        Pane root = new VBox();                                     //kazdij s novij stroki

//        Button btn = new Button("Hello!");                  /// sozdali knopku
        Label lbl = new Label("^>");
        TextField txt = new TextField();                    //polje dlja voda dobavleno

        lbl.textProperty().bind(Bindings.concat("HellO!, ", txt.textProperty(), "1"));

//        btn.setOnAction(e -> {
//            lbl.setText("Hello, " + txt.getText() + "1");
//        }); //pri


        root.getChildren().addAll( lbl, txt);                             //u rootu dobavili knopku

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Bulls and Covs");
        primaryStage.setScene(scene);
        primaryStage.show();                                                ///zakoncili okosko


    }

}
