/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_.pkg19_.for_2;

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
public class EVA2_19_FOR_2 extends Application {
    
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
        int NumAlum;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        NumAlum = captu.nextInt();
        //Hay que capturar todas las calificaciones
        // for (int i = 0; i -< NumAlum; i++) { AHORA FOR HACE LO MISMO
        for (int i = 1; i <= NumAlum; i++) {
            System.out.println("Calificacion: ");
            int Calif = captu.nextInt();
            
       
            
        }
    }
    
    
}
