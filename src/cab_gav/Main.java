package cab_gav;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Bulls and Covs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
