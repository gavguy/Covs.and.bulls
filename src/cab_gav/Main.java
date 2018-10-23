package cab_gav;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
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

        Pane root = FXMLLoader.load(
                getClass().getResource("/cab_gav/main.fxml"));                                   //kazdij s novij stroki

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Bulls and Covs");
        primaryStage.setScene(scene);
        primaryStage.show();                                                ///zakoncili okosko


    }

}
