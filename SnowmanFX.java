

import javafx.scene.control.*;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
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
	Pane animationPane;
	public static void main(String[] args){
		launch(args);
	}
	
	
	public void start(Stage primaryStage){
		
		root = new StackPane();
		animationPane = new Pane();
		can = new Canvas(300,300);
		gc = can.getGraphicsContext2D();
		
		
		root.getChildren().add(can);
		root.getChildren().add(animationPane);
		drawSnowman(gc, root, animationPane);
		
		
		primaryStage.setScene(new Scene(root, 500,500));
		primaryStage.show();
		
		
	}
	

	
	public void drawSnowman(GraphicsContext gc, StackPane sp, Pane pane){
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
		Rectangle leftArm = new Rectangle(0,0,100,10);
		leftArm.setFill(Color.BLACK);
		leftArm.setLayoutX(100);
		leftArm.setLayoutY(215);
		pane.getChildren().add(leftArm);
		RotateTransition leftArmAnimation = new RotateTransition(Duration.millis(1000), leftArm);
		leftArmAnimation.setByAngle(60);
		leftArmAnimation.setCycleCount(Timeline.INDEFINITE);
		leftArmAnimation.setAutoReverse(true);
		leftArmAnimation.play();
	     
	     Rectangle rightArm = new Rectangle(0,0,100,10);
			rightArm.setFill(Color.BLACK);
			rightArm.setLayoutX(300);
			rightArm.setLayoutY(215);
			pane.getChildren().add(rightArm);
			RotateTransition rightArmAnimation = new RotateTransition(Duration.millis(1000), rightArm);
			rightArmAnimation.setByAngle(-60);
			rightArmAnimation.setCycleCount(Timeline.INDEFINITE);
			rightArmAnimation.setAutoReverse(true);
			rightArmAnimation.play();
		
		
		//top hat
		//gc.setFill(Color.GREEN);
		//gc.fillRect(97.5, 10, 100, 5);
		//gc.fillRect(110, -60, 75, 75);
		
			Rectangle hatPart1 = new Rectangle (0, 0, 100, 5);
			Rectangle hatPart2 = new Rectangle (0, 0, 80, 80);
			hatPart1.setLayoutX(198);
			hatPart1.setLayoutY(110);
			hatPart2.setLayoutX(208);
			hatPart2.setLayoutY(30);
			pane.getChildren().add(hatPart1);
			pane.getChildren().add(hatPart2);
		  
		
		 
		     FillTransition hatAnimation1 = new FillTransition(Duration.millis(1000), hatPart1, Color.GREEN, Color.BLUE);
		     FillTransition hatAnimation2 = new FillTransition(Duration.millis(1000), hatPart2, Color.GREEN, Color.BLUE);
		     hatAnimation1.setCycleCount(Timeline.INDEFINITE);
		     hatAnimation1.setAutoReverse(true);
		 
		     hatAnimation1.play();
		     hatAnimation2.setCycleCount(Timeline.INDEFINITE);
		     hatAnimation2.setAutoReverse(true);
		 
		     hatAnimation2.play();
	}
	
	
}

