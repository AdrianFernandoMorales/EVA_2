/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_servicio_social;

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
public class EVA2_12_SERVICIO_SOCIAL extends Application {
    
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
        int Creditos, Semestre;
        Scanner captu = new Scanner(System.in);
        System.out.println("Que semestre cursas? ");
        Semestre = captu.nextInt();
        System.out.println("Cuantos creditos llevas?");
        Creditos = captu.nextInt();
        //INDICAR SI PUEDE O NO REALIZAR EL SERVICIO SOCIAL
        //IR EN 6TO SEMESTRE O SUPERIOR
        //TENER AL MENOS 150 CREDITOS
        if ((Semestre >=6) && (Creditos>=150))
                System.out.println("PUEDES REALIZAR EL SERVICIO SOCIAL!!");
        else
            System.out.println("NO PUEDES REALIZAR EL SERVICIO SOCIAL");
                

        
    }
    
}
