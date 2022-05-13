import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    public static void run(){
        JavaFXApplication.launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        Label label1 = new Label("Start Måling" );
        Label label2 = new Label("Stop Måling" );
        GridPane pane = new GridPane();
        pane.add(label1,0,0);
        pane.add(label2,0,1);
        Scene scene = new Scene(pane, 600, 600);
        stage.setScene(scene);
        stage.setTitle("JavaFxApplication");
        stage.setFullScreen(true);
        stage.show();


    }
}
