package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	Image image;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Image image = new Image("imagenes/Batman.png");
			scene.setCursor(new ImageCursor(image));
			Font.loadFont(getClass().getResourceAsStream("Pacifico-Regular.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("Vacations"),20);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
