/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_24_adivinar_while;

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
public class EVA2_24_ADIVINAR_WHILE extends Application {
   
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
       int Num = 5; //Numero que tiene que adivinar entre 1 y 10
      int Valor = 0; //Valor para almacenar lo que capture el usuario
      Scanner captu = new Scanner(System.in);
    while(Num != Valor){
      System.out.println("Cual es el numero? (entre 1 y 10)");
         Valor = captu.nextInt();
   }
      System.out.println("ADIVINASTE!!");
   }

}
