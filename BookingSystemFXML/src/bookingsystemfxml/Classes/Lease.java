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
public class Lease extends Room{
    int leaseNo;
    int duration;
    
    public Lease(int LeaseNo, int Duration, int roomNo, int hallNo, String hallName, double rent){
        super(roomNo, hallNo, hallName, rent);
        this.leaseNo = LeaseNo;
        this.duration = Duration;
        
        this.hallAddress = "";
        this.roomNo = 0;
    }
    
    public int getLeaseNo(){
        return this.leaseNo;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public String getHallAddress(){
        return this.hallAddress;
    }
    
    public void setDuration(int Duration){
        this.duration = Duration;
    }
    
    public void setHallAddress(String HallAddress){
        this.hallAddress = HallAddress;
    }
    
    public void setRoomNo(int RoomNo){
        this.roomNo = RoomNo;
    }
    
    @Override
    public String[] getStringDetails(){
        String leaseNo = Integer.toString(getLeaseNo());
        String duration = Integer.toString(getDuration());
        String hallAddress = getHallAddress();
        String roomNo = Integer.toString(getRoomNo());
        String customerNo = Integer.toString(getCustomerNo());
        String customerName = getCustomerName();
        
        String stringDetails[] = {leaseNo, duration, hallAddress, roomNo, customerNo, customerName};
        
        return stringDetails;
    }
    
    @Override
    public String ToString(){
        return "Lease No: " + getLeaseNo() + "/n" +
                "Customer No: " + getCustomerNo() + "/n" +
                "Customer Name: " + getCustomerName() + "/n" +
                "Duration: " + getDuration() + "/n" +
                "Hall Address: " + getHallAddress() + "/n" +
                "Rooom No: " + getRoomNo() + "/n";
    }
    
}
