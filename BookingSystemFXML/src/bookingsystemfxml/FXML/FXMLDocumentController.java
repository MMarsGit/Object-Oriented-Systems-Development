/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.Parent;

import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Window;
import javafx.stage.Stage;
import java.io.*; 

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    //Recieved elements from FXML document
    @FXML
    private Label label;
    @FXML
    public Button buttonHalls;
    public Button button1;    
    
    public void newScene(Button button, String document){
        try{
        //Set stage by getting the scene linked to button object
        Stage stage = (Stage) button.getScene().getWindow();
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
    
    @FXML
    private void handleButtonLease(ActionEvent event) {
        
        FXMLController controller = new FXMLController(button1);
        controller.newScene("FXMLLease.fxml");
    }
    
    @FXML
    private void handlebuttonHalls(ActionEvent event){
        FXMLController controller = new FXMLController(buttonHalls);
        controller.newScene("FXMLHalls.fxml");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
