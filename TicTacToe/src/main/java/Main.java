import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;

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

class Write {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Nazik Esengulova\\IdeaProjects\\TicTacToe\\text\\output.txt"));
            bw.write("Program is succesfully running");
            bw.close();
        } catch (Exception ex) {
            return;
        }
    }
}

    class Read {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Nazik Esengulova\\IdeaProjects\\TicTacToe\\text\\output.txt"));
            String s;
            while(( s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (Exception ex) {
            return;
        }
    }
}


