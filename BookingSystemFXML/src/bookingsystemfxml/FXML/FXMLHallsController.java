/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.FXML;

import bookingsystemfxml.Classes.Hall;
import bookingsystemfxml.Classes.Room;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLHallsController implements Initializable {

    /**
     * initialises the controller class.
     */
    
    @FXML 
    private Button backButton;
    
    @FXML
    private VBox hallsInfoBox;
    
    @FXML
    private ComboBox hallComboBox;
    
    @FXML 
    private ComboBox roomComboBox;
    
    @FXML
    private VBox HallsActivityBox;
    
    @FXML
    public GridPane RoomsGrid;
    
    public Hall[] activeHall;
    
    public int activeHallNo;
    public String[] hallsArray;
    
    //Return to the previous page
    public void handleButtonBack(ActionEvent event){
        FXMLController controller = new FXMLController(backButton);
        controller.newScene("FXMLDocument.fxml");
    }
    
    public void hallSelect(ActionEvent event){
        String hall = (String) hallComboBox.getValue();
        String[] halls = hallsArray;
        int i;
        
        for(i=0; i < halls.length; i++){
            if(halls[i] == hall){
                this.activeHallNo = i;
            }
        
        }
        
        hallsInfoBox.getChildren().clear();
        String[] hallDetails = activeHall[activeHallNo].getHallDetails();
        addToVBox(hallDetails, hallsInfoBox);
        
        HallsActivityBox.getChildren().clear();
        String[] activitiesArray = activeHall[activeHallNo].getActivitiesList().toArray(new String[activeHall[activeHallNo].getActivitiesList().size()]);
        addToVBox(activitiesArray, HallsActivityBox);
        System.out.println("Hello!");
    }
    
    //Generates the halls and the rooms that make up the halls
    public Hall[] generateHalls(String[] hallNames){
        //The number of rooms in each hall
        int numRooms = 10;
        
        //Counters
        int i;
        int j;
        
        //Arrays to hold objects into memory
        Hall[] hallsArray = new Hall[hallNames.length];
        Room[] roomsArray = new Room[numRooms];
        
        //loop through the given array of names
        for(i=0;i < hallNames.length; i++){
            
            //Create a hall and add it into the array
            Hall hall = new Hall(i, hallNames[i], 6000);
            hallsArray[i] = hall;
            
            //Create a number of rooms for the hall
            for (j=0; j<numRooms; j++){
                Room room = new Room(j, hall.getHallNo(), hall.getHallName(), hall.getRent());
                room.setNumRooms(numRooms);
                //Adding into rooms array
                roomsArray[j] = room;
                System.out.println(room.ToString());
            }
            //Save the rooms array to the halls memory
            hall.setRoomsArray(roomsArray);
        }
        return hallsArray;
    }
    
    public void addToVBox(String[] array, VBox vbox){
        int i;
        
        for (i=0; i < array.length; i++){
            System.out.println(array[i]);
            vbox.getChildren().add(i, new Label(array[i])); 
        }
    }
    
    public void addToComboBox(String string, ComboBox comboBox){
        comboBox.getItems().add(string);
    }
    
    public void buildScene(String hallName){
        String[] halls = {"Mendip", "Carrol Court", "Glenside"}; 
        this.hallsArray = halls;
        int hallNo = 0;
        int i;
        for(i=0; i < halls.length; i++){
            if(halls[i] == hallName){
                hallNo = i;
            }
        }
        
        Hall hall;
        Hall[] hallArray = generateHalls(halls);
        hall = hallArray[hallNo];
        this.activeHall = hallArray;
        String[] hallDetails = hall.getHallDetails();
        
        hall.addActivity("1. Hall Party");
        
        addToVBox(hallDetails, hallsInfoBox);
        String[] activitiesArray = hall.getActivitiesList().toArray(new String[hall.getActivitiesList().size()]);
        addToVBox(activitiesArray, HallsActivityBox);
        
        Room[] roomsArray = hall.getRoomsArray();
        
        for(i=0; i < roomsArray.length; i++){
            addToComboBox("Room " + roomsArray[i].getRoomNo(), roomComboBox);
        }
        
        for(i=0; i < hallArray.length; i++){
            addToComboBox(hallArray[i].getHallName(), hallComboBox);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        buildScene("Mendip");
        
            
    }    
    
}
