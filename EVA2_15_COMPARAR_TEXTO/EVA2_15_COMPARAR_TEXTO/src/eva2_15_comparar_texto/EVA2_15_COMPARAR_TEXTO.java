/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_comparar_texto;

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
public class EVA2_15_COMPARAR_TEXTO extends Application {
    
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
        String Dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia (Lunes, Martes, etc");
        Dia = captu.nextLine();
        
        if(Dia.equals("Domingo"))//No podemos comparar cadenas con ==
            System.out.println("1");
        else if (Dia.equals("Lunes"))
        System.out.println("2");
         else if (Dia.equals("Martes"))
        System.out.println("3");
        else if (Dia.equals("Miercoles"))
        System.out.println("4");
        else if (Dia.equals("Jueves"))
        System.out.println("5");
        else if (Dia.equals("Viernes"))
        System.out.println("6");
        else if (Dia.equals("Sabado"))
        System.out.println("7");

        
          
    }
    
}
