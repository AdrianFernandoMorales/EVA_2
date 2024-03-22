/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_else_if;

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
public class EVA2_13_ELSE_IF extends Application {
    
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
        int Dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia de la semana en numeros del (1 - 7)");
        Dia = captu.nextInt();
        
        if(Dia == 1)
            System.out.println("Domingo");
        else if(Dia == 2)
            System.out.println("Lunes");
        else if (Dia == 3)
            System.out.println("Martes");
        else if (Dia == 4)
            System.out.println("Miercoles");
        else if (Dia == 5)
            System.out.println("Jueves");
        else if (Dia == 6)
            System.out.println("Viernes");
        else if (Dia == 7)
            System.out.println("Sabado");
        else
            System.out.println("El numero no es un dia valido");
                   
                   
                   
                   
                   
         
    }
    
}
