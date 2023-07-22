/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.FXML;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 *
 * @author User
 */

//NOT CURRENTLY IN USE
public class FXMLController {
    //Creates a new Scene
    @FXML
    Button button;
    
    public FXMLController(Button button){
        this.button = button;
        String id = this.button.getId();
        System.out.println(id);
}   
    public void setButton(Button button){
        this.button = button;
    }
    public void newScene(String document){
        try{
        //Set stage by getting the scene linked to button object
        Stage stage = (Stage) this.button.getScene().getWindow();
        //Set the root element as the FXML document 'Halls'
        Parent root = FXMLLoader.load(getClass().getResource(document));
        //Create a new scene
        Scene scene = new Scene(root);
        //Set a new scene on the stage
        stage.setScene(scene);
        //Reveal the stage
        stage.show();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
