import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane layout = FXMLLoader.load(getClass().getResource("gui.fxml"));
        stage.setTitle("TicTacToe");
        stage.setScene(new Scene(layout, 750, 750));
        stage.show();

        stage.setMinHeight(750);
        stage.setMaxHeight(750);
        stage.setMinWidth(750);
        stage.setMaxWidth(750);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

