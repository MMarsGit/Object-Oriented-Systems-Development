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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLLeaseController implements Initializable {
    
    @FXML
    private Button newLeaseButton;
    @FXML
    private Button currentLeaseButton;
    @FXML
    public Button backButton;
    /**
     * Initialises the controller class.
     */
    public void handleButtonNewLease(ActionEvent event){
        FXMLController controller = new FXMLController(newLeaseButton);
        controller.newScene("FXMLForm.fxml");
    }
    
    public void handleButtonCurrentLease(ActionEvent event){
        FXMLController controller = new FXMLController(currentLeaseButton);
    }
    
    public void handleButtonBack(ActionEvent event){
        FXMLController controller = new FXMLController(backButton);
        controller.newScene("FXMLDocument.fxml");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
