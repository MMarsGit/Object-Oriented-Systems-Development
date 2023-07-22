/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.Classes;

import java.util.ArrayList;

/**
 *
 * @author User
 * 
 * 
 */
public class Hall {
    
    int hallNo;
    String hallName;
    
    int numRooms;
    String hallOfficeEmail;
    int hallOfficeTelephone;
    
    int availableRooms;
    double rent;
    
    //Holds all the rooms as objects
    Room[] roomsArray;
    
    ArrayList<String> activitiesList = new ArrayList<String>();
    
    public Hall(int hallNo, String hallName, double rent){
        this.hallNo = hallNo;
        this.hallName = hallName;
        
        this.numRooms = 0;
        this.availableRooms = 0;
        this.hallOfficeEmail = hallName + "@halls.uwe.ac.uk";
        this.hallOfficeTelephone = 0;
        this.rent = 0;
    }
    
    //Setters and getters
    public int getHallNo(){
        return this.hallNo;
    }
    
    public String getHallName(){
        return this.hallName;
    }
    
    public int getNumRooms(){
        return this.numRooms;
    }
    
    public int getAvailableRooms(){
        return this.availableRooms;
    }
    
    public String getEmail(){
        return this.hallOfficeEmail;
    }
    
    public int getTelephone(){
        return this.hallOfficeTelephone;
    }
    
    public double getRent(){
        return this.rent;
    }
   
    public Room[] getRoomsArray(){
        return this.roomsArray;
    }
    
    public ArrayList<String> getActivitiesList(){
        return this.activitiesList;
    }
    
    public void setRent(double rent){
        this.rent = rent;
    }
    
    public void setNumRooms(int numRooms){
        this.numRooms = numRooms;
    }
    public void setEmail(String HallOfficeEmail){
        this.hallOfficeEmail = HallOfficeEmail;
    }
    
    public void setTelephone(int HallOfficeTelephone){
        this.hallOfficeTelephone = HallOfficeTelephone;
    }
    
    public void setRoomsArray(Room[] roomsArray){
        this.roomsArray = roomsArray;
    }
    // END Setters and Getters
    
    //A method to quickly set hall details 
    public void setHallDetails(int numRooms, String email, int telephone){
        this.setNumRooms(numRooms);
        this.setEmail(email);
        this.setTelephone(telephone);
    }
    
    //Adds an activity to the ActivitiesList
    public void addActivity(String activity){
        activitiesList.add(activity);
    }
    
    //Removes an activity from the activitiesList
    public void removeActivity(int activityIndex){
        int i;
        this.activitiesList.remove(activityIndex);
    }
    
    //Loops through roomsArray and counts each that is available
    public int checkAvailableRooms(){
        int i;
        int roomCount = 0;
        int arraySize = this.roomsArray.length;
        for (i=0; i < arraySize;i++){
            boolean availability = roomsArray[i].getAvailability();
            if(availability == true){
                roomCount += 1;
            }
            
        }
        this.availableRooms = roomCount;
        return roomCount;
    }
    
    public String[] getHallDetails(){
        String[] hallDetails = {"Hall Name: " + hallName, "Number of Rooms: " + Integer.toString(this.numRooms), "Available Rooms: " + Integer.toString(this.availableRooms), "Telephone: " + Integer.toString(this.hallOfficeTelephone), "Email: " + this.hallOfficeEmail };
        return hallDetails;
    }
    
    @Override
    public String toString(){
        return "HallNo: " + getHallNo() + "\n" +
                "Hall Name: " + getHallName() + "\n" +
                "Number of Rooms: " + getNumRooms() + "\n" +
                "Available Rooms: " + getAvailableRooms() + "\n" +
                "Hall Email: " + getEmail() + "\n" +
                "Hall Telephone: " + getTelephone() + "\n";
    }
}

