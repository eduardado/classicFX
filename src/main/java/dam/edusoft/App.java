package dam.edusoft;

import dam.edusoft.controller.IController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Stage mPrimaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        mPrimaryStage = stage;
        mPrimaryStage.setResizable(false);
        mPrimaryStage.show();

        changeScene("login");

    }



    public static void main(String[] args) {
        launch();
    }

    public static void changeScene(String fxml){

        try {
            // Obtenemos FXML
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
            Parent parent = fxmlLoader.load();

            // Obtenemos el Scene
            Scene scene = new Scene(parent);

            //Metemos scene en el stage
            mPrimaryStage.setScene(scene);

            //Obtenemos el controller del Scene
            IController iController = fxmlLoader.getController();
            iController.init();

        } catch (IOException e) {
            System.err.println("App.changeScene + error cargando fichero FXML");
            e.printStackTrace();
        }
    }

}