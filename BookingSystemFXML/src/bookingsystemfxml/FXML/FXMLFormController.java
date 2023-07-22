/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLFormController implements Initializable {

    /**
     * initialises the controller class.
     */
    @FXML
    private Button backButton;
    @FXML
    private GridPane detailsGrid;
    @FXML
    private Button enterButton;
    
    public TextField[] responsesArray;
    
    public void handleButtonBack(ActionEvent event){
        FXMLController controller = new FXMLController(backButton);
        controller.newScene("FXMLDocument.fxml");
    }
    
    /**
     *
     * @param labels
     */
    public void SetLabels(String[] labels){
        int i;
        for (i=0; i < labels.length; i++){
           Label label = new Label(labels[i] + ": ");
           detailsGrid.addRow(i, label);
        }
    }
    
    public void showAlert(Alert.AlertType alertType, Window owner, String title, String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    
    
    public TextField[] SetFields(){
        int i;
        TextField[] responses = new TextField[detailsGrid.getRowConstraints().size()+1];
        //Create a column of TextFields for each label
        for (i=0; i < detailsGrid.getRowConstraints().size()+1; i++){
            
            TextField response = new TextField();
            //Holds the TextFields in memory
            responses[i] = response;
            System.out.println(responses[i]);
            detailsGrid.addRow(i, response); 
        }
        //To get the responses later
        return responses;
    }
    
    public void SetDetails(){
        //Get room id

        //use getter methods

       //Make labels for each field

       //hide edit and done buttons
    }
    
    public void CreateRoomForm(){
        String[] labels = {"Test", "Test"};
        SetLabels(labels);

        SetDetails();
    }

    public void NewLeaseForm(){
        String[] labels = {"Item1", "Item2"};
        SetLabels(labels);

        TextField[] responsesArray = SetFields();
            System.out.println(responsesArray[0]);

            //Event for enter button to submit form
            enterButton.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    int item;
                    for (item=0;item < detailsGrid.getColumnConstraints().size(); item++){

                        if (responsesArray[item].getText().isEmpty()){
                            //In each field make sure they are filled in
                            showAlert(Alert.AlertType.ERROR, detailsGrid.getScene().getWindow(),
                            "Form Error!", "Fill in all fields");
                        }
                        else{
                            //Create new lease
                        }
                       }
                }
            });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        NewLeaseForm();
        //Retrieve room from hallController
        //add details to form
    }    
    
}
