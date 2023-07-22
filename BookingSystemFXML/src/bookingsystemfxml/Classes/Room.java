/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.Classes;

/**
 *
 * @author User
 */
public class Room extends Hall{
    String hallAddress;
    
    String customerName;
    boolean availability;
    int roomNo;
    int customerNo;
    
    Lease lease;
    
    public Room(int roomNo, int hallNo, String hallName, double rent){
        super(hallNo, hallName, rent);
        this.roomNo = roomNo;
        
        this.availability = false;
        this.rent = 0;
    }
    
    public int getRoomNo(){
        return this.roomNo;
    }
    
    public int getCustomerNo(){
        return this.customerNo;
    }
    
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public boolean getAvailability(){
        return this.availability;
    }
    
    public Lease getLease(){
        return this.lease;
    }
    
    public void setCustomerNo(int customerNo){
        this.customerNo = customerNo;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
    
    public void rentRoom(int customerNo, String customerName, int leaseNo, int duration){
        
        this.customerNo = customerNo;
        this.customerName = customerName;
        
        Lease lease = new Lease(leaseNo, duration, this.getRoomNo(), this.getHallNo(), this.getHallName(), this.getRent());
        this.lease = lease;
    }
    
    public void setDetails(int customerNo, String customerName, boolean availability, double rent){
        setCustomerNo(customerNo);
        setCustomerName(customerName);
        setAvailability(availability);
        setRent(rent);
    }
    
    public String[] getStringDetails(){
        String hallName = getHallName();
        String roomNo = Integer.toString(getRoomNo());
        String customerNo = Integer.toString(getCustomerNo());
        String customerName = getCustomerName();
        String availability = Boolean.toString(getAvailability());
        String rent = Double.toString(getRent());
        String[] stringDetails = {hallName,roomNo, customerNo, customerName, availability, rent};
        
        return stringDetails;
    }
    
    public String ToString(){
        return "Room No: " + getRoomNo() + "\n" +
                "Customer No: " + getCustomerNo() + "\n" +
                "Hall No: " + getHallNo() + "\n" +
                "Customer Name: " + getCustomerName() + "\n" +
                "Hall Name: " + getHallName() + "\n" +
                "availability: " + getAvailability() + "\n" +
                "Rent: " + getRent() + "\n";
    }
}