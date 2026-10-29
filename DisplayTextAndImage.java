
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {
        Label label = new Label("Welcome to JavaFX!");

        Image image = new Image("file:flower.jpg");
        ImageView view = new ImageView(image);

        view.setFitWidth(200);
        view.setFitHeight(200);

        VBox root = new VBox(15);
        root.getChildren().addAll(label, view);

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("JavaFX Image Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
