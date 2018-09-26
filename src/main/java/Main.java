import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml/Login2.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);

		stage.initStyle(StageStyle.TRANSPARENT);
		scene.setFill(Color.TRANSPARENT);

		stage.setTitle("Registration");
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}