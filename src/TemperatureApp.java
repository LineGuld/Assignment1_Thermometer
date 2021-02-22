import core.ModelFactory;
import core.ViewHandler;
import core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class TemperatureApp extends Application {
	public void start(Stage primaryStage) {
		// Model
		ModelFactory modelFactory = new ModelFactory();

		// Radiator


		// Thermometer


		// View
		ViewHandler view = new ViewHandler(new ViewModelFactory(modelFactory));
		view.start(primaryStage);
	}
}
