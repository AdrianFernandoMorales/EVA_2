/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_break;

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
public class EVA2_26_BREAK extends Application {
   
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
      //Vamos a generar un acceso for usuario y contraseña 
     String usuario, pwd;
     
     String USUARIO = "Admin";
     String PASSWORD = "Admin";
     
     Scanner captu = new Scanner(System.in);
     
    
     //Como es un control de acceso, debemos preguntar un
     //numero indeterminado de veces, hasta que el usuario
     //y contraseña sean correctos 
     
     while(true){
        System.out.println("Usuario:");
        usuario = captu.nextLine();
        System.out.println("Contraseña:");
        pwd = captu.nextLine();
        if(usuario.equals(USUARIO)&& pwd.equals (PASSWORD))
           break;
        
        else
           System.out.println("Datos no validos!");
        }
     System.out.println("Bienvenido al Sistema!");
   }
   
}
