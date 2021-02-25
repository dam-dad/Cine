package dad.cine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CineApp extends Application {

	private CineController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new CineController();
		
		primaryStage.setTitle("CineApp");
		primaryStage.setScene(new Scene(controller.getView(), 640, 480));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
