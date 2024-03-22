/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_comparar;

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
public class EVA2_6_COMPARAR extends Application {
   
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
      //CUAL ES EL MAYOR VALOR ENTRE DOS NUMEROS
      //PIDAN AL USUARIO DOS VALORES ENTEROS
      int Numero1, Numero2;
      Scanner captu = new Scanner(System.in);
      System.out.println("Valor1");
      Numero1 = captu.nextInt();
         System.out.println("Valor2");
      Numero2 = captu.nextInt();
      //CUAL ES EL NUMERO MAYOR}
      if(Numero1 > Numero2)
         System.out.println(Numero1 + " Es mayor!!!");
      else{
         if (Numero1 == Numero2)//Numero1 es igual a Numero2 
            System.out.println("Son iguales");
         
         else
           System.out.println(Numero2 + " Es mayor!!!");
         
      
      }
      }
   }

