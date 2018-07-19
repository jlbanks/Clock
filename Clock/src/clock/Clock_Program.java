/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import com.sun.prism.paint.Color;
import java.time.LocalDateTime;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jodi
 */
public class Clock_Program extends Application {
    private LocalDateTime nowTime;
    private char hourVal[];
    private char minVal[];
    
    @Override
    public void start(Stage primaryStage) {
        Display nm = new Display();
        nm.LiveTime();
                
        Scene scene = new Scene(nm);
        primaryStage.setTitle("Digital Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
