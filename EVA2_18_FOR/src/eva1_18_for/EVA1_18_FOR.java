/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_for;

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
public class EVA1_18_FOR extends Application {
   
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
      //INICIO; CONDICION; INCREMENTO/DECREMENTO
      for(int i = 1; i <= 10; i++){
         System.out.println(i + " - ");
         
      }
      System.out.println("");
      for(int i = 10; i >= 1; i--){
         System.out.println(i + " - ");
         
      }
      System.out.println("");
      // IMPRIMIR OS NUMEROS PARES DEL 0 Y 100
      for(int i = 0; i <= 100; i += 2){
         System.out.println(i + " - ");
         
      }
   }
   
}
