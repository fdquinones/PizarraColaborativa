package edu.utpl.pizarra.run;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import edu.utpl.pizarra.fx.components.Whiteboard;

public class Driver extends Application {

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Collaborative Whiteboard");
	primaryStage.setScene(new Scene(new Whiteboard(), 500, 500));
	primaryStage.show();
    }
}
