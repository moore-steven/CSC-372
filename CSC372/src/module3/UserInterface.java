package module3;

import javafx.scene.paint.Color;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserInterface extends Application {
	
	
    public Color randomColor() { 
    	
    	// Method to return random shade of green, array initialized with all shades of green and random value shade returned.
    	
        Color[] gcol = new Color[22];
        gcol[0] = Color.YELLOWGREEN;
        gcol[1] = Color.CHARTREUSE;
        gcol[2] = Color.LAWNGREEN;
        gcol[3] = Color.LIME;
        gcol[4] = Color.LIMEGREEN;
        gcol[5] = Color.PALEGREEN;
        gcol[6] = Color.LIGHTGREEN;
        gcol[7] = Color.MEDIUMSPRINGGREEN;
        gcol[8] = Color.SPRINGGREEN;
        gcol[9] = Color.MEDIUMSEAGREEN;
        gcol[10] = Color.SEAGREEN;
        gcol[11] = Color.FORESTGREEN;
        gcol[12] = Color.GREEN;
        gcol[13] = Color.DARKGREEN;
        gcol[14] = Color.YELLOWGREEN;
        gcol[15] = Color.OLIVEDRAB;
        gcol[16] = Color.DARKOLIVEGREEN;
        gcol[17] = Color.MEDIUMAQUAMARINE;
        gcol[18] = Color.DARKSEAGREEN;
        gcol[19] = Color.LIGHTSEAGREEN;
        gcol[20] = Color.DARKCYAN;
        gcol[21] = Color.TEAL;
        
        Random rand = new Random();
        
		
        
        return gcol[rand.nextInt(21)]; 
		
	}

	  
    public void start(Stage PrimaryStage) 
    
    { 
        // set title for the stage 
        PrimaryStage.setTitle("User Interface"); 
        
        // create a Menu bar 
        MenuBar menuBar = new MenuBar(); 
        
        // Create all four required menu items
        
        MenuItem menuItem1 = new MenuItem("Date / Time");
        MenuItem menuItem2 = new MenuItem("Output Log");
        MenuItem menuItem3 = new MenuItem("Change Frame Background Color");
        MenuItem menuItem4 = new MenuItem("Quit");
        
        // Create text box to return date and time
        
        Text textBox = new Text();
        
        // Create text box to return file write success or error
        
        Text textBox2 = new Text();
        
        
        // Menu Item 1 retrieves date and time and then outputs it to text box.
        
        menuItem1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	String timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
            	textBox.setText(timeStamp);

            	
            }
        });
        
        
        // Menu Item 2 writes the information from the text box to a log.txt file. Try-catch for errors. Will output blank if no
        // Information has been set to the text box.
        menuItem2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	try {
            	      FileWriter myWrite = new FileWriter("log.txt");
            	      myWrite.write(textBox.getText());
            	      myWrite.close();
            	      textBox2.setText("File Write Successful");
            	    } catch (IOException e) {
            	      textBox2.setText("File Write Error");
            	      e.printStackTrace();
            	    }

            	
            }
        });
        
        
        // Menu Item 3 uses the random color method to set the background of the VBox to a random shade of green.
        
        menuItem3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	VBox vBox = new VBox(100, menuBar, textBox, textBox2);
                vBox.setAlignment(Pos.BASELINE_CENTER);
                vBox.setBackground((new Background(new BackgroundFill(randomColor(), CornerRadii.EMPTY, Insets.EMPTY))));
                //vBox.setStyle("-fx-background-color: #00FF00;");
                Scene sc = new Scene(vBox, 500, 300, Color.BLUE); 
                PrimaryStage.setScene(sc); 
                
                PrimaryStage.show();
            	
            }
        });     
        
        // Menu Item 4 Exits when selected.
        
        menuItem4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	System.exit(0);

            	
            }
        });     
        
        // Creation of menu
        
        Menu menu1 = new Menu("Menu", null, menuItem1, menuItem2, menuItem3, menuItem4);

        
        // Addition of menu to menubar
        
        menuBar.getMenus().add(menu1);
     
        
  
        // create a VBox 
        VBox vBox = new VBox(100, menuBar, textBox, textBox2);
        vBox.setAlignment(Pos.BASELINE_CENTER);
            
         
  
        // create a scene 
        Scene sc = new Scene(vBox, 500, 300, Color.BLUE); 
        
  
        // set the scene 
        PrimaryStage.setScene(sc); 
  
        // Show the scene
        
        PrimaryStage.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        // launch the application 
        launch(args); 
    } 
} 