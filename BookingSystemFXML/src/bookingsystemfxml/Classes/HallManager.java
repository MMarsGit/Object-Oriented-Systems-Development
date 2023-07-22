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
public class HallManager {
    String Name;
    int Telephone;
    String Email;
    
    public HallManager(String Name){
        this.Name = Name;
        this.Telephone = 0;
        this.Email = "";
    }
    
    public String getName(){
       return this.Name;
    }
    
    public int getTelephone(){
       return this.Telephone;
    }
    
    public String getEmail(){
       return this.Email;
    }
    
    public void setTelephone(int Telephone){
        this.Telephone = Telephone;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String ToString(){
        return "Name: " + getName() + "/n" +
                "Telephone: " + getTelephone() + "/n" +
                "Email: " + getEmail() + "/n";
    }
}
