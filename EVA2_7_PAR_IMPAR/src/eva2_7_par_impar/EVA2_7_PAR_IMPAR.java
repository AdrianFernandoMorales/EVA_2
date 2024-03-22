/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_par_impar;

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
public class EVA2_7_PAR_IMPAR extends Application {
    
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
        int Numero, Division, Residuo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        Numero = captu.nextInt();
        Division = Numero/2;
        System.out.println("Division entera de " + Numero + " / 2 = " + Division );
        Residuo = Numero % 2;
        System.out.println("el residuo de " + Numero + " % 2 = " + Residuo );
        
        //NUMERO PAR O IMPAR
        if(Residuo == 1)
            System.out.println(Numero + " Es impar");
        else
            System.out.println(Numero + " Es par");
         
            
        
        
    }
    
}
