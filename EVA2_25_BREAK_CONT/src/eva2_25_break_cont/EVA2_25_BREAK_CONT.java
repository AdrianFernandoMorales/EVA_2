/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_break_cont;

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
public class EVA2_25_BREAK_CONT extends Application {
   
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
      for (int i = 0; i < 100; i++) {
         int Mod = i % 2;
         if (Mod != 0)//Queremos que los casos sean pares
            continue; //Cuando se ejecuta, se interrumple la interaccion actual 
         System.out.println(i);
         
      } 
      System.out.println("BREAK>>>>>>>>>>>>");
          for (int i = 0; i < 100; i++) {
        System.out.println(i);
     if(i == 50)
        break;
          }
     
   }
}
      
     
     
   
  

