

import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.collections.FXCollections;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.util.Duration;
import javafx.animation.*;
import javafx.scene.shape.*;


public class SnowmanFX extends Application {
	
	StackPane root;
	Canvas can;
	GraphicsContext gc;
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	public void start(Stage primaryStage){
		
		root = new StackPane();
		can = new Canvas(300,300);
		gc = can.getGraphicsContext2D();
		
		
		root.getChildren().add(can);

		drawSnowman(gc);
		
		primaryStage.setScene(new Scene(root, 500,500));
		primaryStage.show();
		
		
	}
	

	
	public void drawSnowman(GraphicsContext gc){
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(5);
		gc.stroke();
		
		//first oval
		gc.setFill(Color.WHITESMOKE);
		gc.fillOval(50,170,200,120);
		gc.strokeOval(50,170,200,120);
		
		//second oval
		gc.setFill(Color.WHITESMOKE);
		gc.fillOval(62.5,90,175,120);
		gc.strokeOval(62.5,90,175,120);
		gc.fillOval(53,170,195,115);
		
		//third oval
		gc.setFill(Color.WHITESMOKE);
		gc.fillOval(83,10,130,120);
		gc.strokeOval(83,10,130,120);
		gc.fillOval(65,90,170,115);
		
		//left eye
		gc.setFill(Color.BLACK);
		gc.fillOval(120,40,15,15);
		//right eye
		gc.fillOval(160,40,15,15);
		
		//nose
		gc.setFill(Color.ORANGE);
		double[] xpoints = new double[] {150,150,100};
		double[] ypoints = new double[] {70,80,75};
		gc.fillPolygon(xpoints, ypoints, 3);
		
		//buttons
		gc.setFill(Color.GOLD);
		gc.fillOval(145, 120, 10, 10);
		gc.fillOval(145, 150, 10, 10);
		gc.fillOval(145, 180, 10, 10);
		
		//left arm
		gc.setFill(Color.BLACK);
		gc.fillRect(10, 150, 75, 7.5);
		gc.fillRect(215, 150, 75, 7.5);
		
		//top hat
		gc.setFill(Color.GREEN);
		gc.fillRect(97.5, 10, 100, 5);
		gc.fillRect(110, -60, 75, 75);
	}
	
	
}
