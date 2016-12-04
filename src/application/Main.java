package application;
	

import java.util.LinkedHashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//////// 捞亥飘 贸府
public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			
			//Image node 积己
			Image img1 = new Image("file:Chrysanthemum.jpg");
			Image img2 = new Image("file:Desert.jpg");
			Image img3 = new Image("file:Koala.jpg");
			Image img4 = new Image("file:Lighthouse.jpg");
			
			ImageView iv = new ImageView();
			
			iv.setFitWidth(400);
			iv.setPreserveRatio(true);
			
			// Label 积己
			Label label1= new Label("1");	
			Label label2= new Label("2");
			Label label3= new Label("3");
			Label label4= new Label("4");	
			//Container
			
			GridPane grid= new GridPane();
			
			grid.addRow(0, label1, label2, label3, label4);		
			grid.setAlignment(Pos.BOTTOM_CENTER);
			
			Map<Label, Image> map = new LinkedHashMap<Label, Image>();
			map.put(label1, img1);
			map.put(label2, img2);
			map.put(label3, img3);
			map.put(label4, img4);
			
			for(Label label : map.keySet()){
			
				label.setStyle("-fx-border-color:red;-fx-font-size:50;");
				
				label.setOnMouseEntered(e->{
					iv.setImage(map.get(label));
					
				});
				label.setOnMouseExited(e->{
					iv.setImage(null);
					
				});
				
			}
			
			StackPane pane = new StackPane();
			pane.getChildren().addAll(iv,grid);
			
			Scene scene = new Scene(pane,800,500);
			
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
