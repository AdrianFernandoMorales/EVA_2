/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_operadores_logicos;

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
public class EVA2_10_OPERADORES_LOGICOS extends Application {
    
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
        double Moneda;
        int Adivinar;
        Scanner captu = new Scanner (System.in);
       System.out.println("Cara(0) o Cruz(1)? ");
       Adivinar = captu.nextInt();
       
       Moneda = Math.random();
       System.out.println("El valor de la moneda = " + Moneda);
       
       //0.5 es la mirdad del rango, > 0.5 Cara, MENOR ES CRUZ
       
       if(Moneda > 0.5 && Adivinar == 0)
           System.out.println("Adivinaste, es cara!!");
       else
           if(Moneda <= 0.5 && Adivinar ==1)
               System.out.println("Adivinaste es cruz!!");
       else
               System.out.println("PERDISTE!!!");
    }
    
}
