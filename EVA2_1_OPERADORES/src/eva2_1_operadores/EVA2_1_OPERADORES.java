/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_operadores;

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
public class EVA2_1_OPERADORES extends Application {
   
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
      //OPERADORES ARITMETICOS
      
      int num1, num2;
      num1 = 5;
      num2 = 3;
      int Suma = num1 + num2; //OPERADOR de suma +
      //Si el operador + uno de los terminos es
      //Una cadena, todo se convierte en cadena y se unen
      //concatenacion: union de cadenas de texto
      System.out.println("La suma es:");
      System.out.println(Suma);
      
      boolean Prueba = true;
      System.out.println("El valor de prueba es " + Prueba);
      
      //MULTIPLICACION *
      int Multiplicacion;
      Multiplicacion = num1 * num2;
      System.out.println("La multiplicacion es: " + Multiplicacion);
      
      int Division = num1 / num2;
      System.out.println("La Division es: " + Division);
      
      double Dividouble = 7 /2.0 ;
      System.out.println("La Division es: " + Dividouble);
      
      //ACUMULADORES
      //SUMA +=
      //RESTA -=
     //MULTIPLICACION *=
      //DIVISION /=
      int Sumatoria = 0;
     /* Sumatoria = Sumatoria + 90;
      Sumatoria = Sumatoria + 80;
      Sumatoria = Sumatoria + 80;*/
      Sumatoria += 90;
      Sumatoria += 80;
      Sumatoria += 80;
      System.out.println("La sumatoria es" + Sumatoria);
      Sumatoria -= 70; //Le restp 70 a la sumatoria
      //Sumatoria = Sumatoria -70;
      System.out.println("La sumatoria es" + Sumatoria);
      //
      int MultiAcum = 1;
      MultiAcum *= 100;
          System.out.println("MultiAcum = " + MultiAcum);
           MultiAcum *= 5;
            System.out.println("MultiAcum = " + MultiAcum);
      
      
   }
   
}
