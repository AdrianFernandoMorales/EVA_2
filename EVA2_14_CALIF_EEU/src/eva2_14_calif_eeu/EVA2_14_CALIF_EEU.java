/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_eeu;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EVA2_14_CALIF_EEU extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        int Calific;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion (0-100");
        Calific = captu.nextInt();
        
        if((Calific >=90) && (Calific <=100)) 
            System.out.println("A");
        else if((Calific >=80) && (Calific <=89)) 
            System.out.println("B");
         else if((Calific >=70) && (Calific <=79)) 
            System.out.println("C");
         else if((Calific >=60) && (Calific <=69)) 
            System.out.println("D");
         else if((Calific >=0) && (Calific <=59)) 
            System.out.println("F");
         else 
             System.out.println("No es una calificacion valida");
        
    }
    
    
}
