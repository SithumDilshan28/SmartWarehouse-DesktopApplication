/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_warehouse;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SHEHARA
 */

public class user {
    
    //Encapsulation
    //variables
    private String id;
    private String fullName;
    private String companyName;
    private String phone;
    private String mail;
    private String address;
    private String nic;
    private Component rootPane;
    
    
     public user(String userID, String name, String cName, String phoneNo, String email, String userAddress, String nicNo) {
         
        this.id = userID;
        this.fullName = name;
        this.companyName = cName;
        this.phone = phoneNo;
        this.mail = email;
        this.address = userAddress;
        this.nic = nicNo;
        
    }
     
     public Component getRootPane(){
           return rootPane;
     }
     
      public void setRootPane (Component rootPane){
         this.rootPane = rootPane;
      }
     
     
    public user() {
    }
     
     public String getuserID() {
        return id;
    }

    public void setuserID(String userID) {
        this.id = userID;
    }

    public String getname() {
        return fullName;
    }

    public void setname(String name) {
        this.fullName = name;
    }

    public String getcName() {
        return companyName;
    }

    public void setcName(String cName) {
        this.companyName = cName;
    }

    public String getphoneNo() {
        return phone;
    }

    public void setphoneNo(String phoneNo) {
        this.phone = phoneNo;
    }

    public String getemail() {
        return mail;
    }

    public void setemail(String email) {
        this.mail = email;
    }
     
    public String getuserAddress() {
        return address;
    }

    public void setuserAddress(String userAddress) {
        this.address = userAddress;
    }
     
    public String getnicNo() {
        return nic;
    }

    public void setnicNo(String nicNo) {
        this.nic = nicNo;
    }
     
     
     public void addUser() {
             
         
         String Query = "select * FROM user WHERE nicNo = '"+nic+"' ";
         DataBase dataBase1 = new DataBase();
         ResultSet dataWrite1 = dataBase1.dataRead(Query);
         System.out.println("");
         
        try {
            if (dataWrite1.next()==true)
                
            {
                
                JOptionPane.showMessageDialog(rootPane,"'"+nic+ "'" +  "\r\nThis NIC Number Already Exist.\r\nPlease Try Again.");
                
            }
            
            else {
                
                String query = ("insert into user (userID,name,cName,phoneNo,email,userAddress,nicNo)values('"+id+"','"+fullName+"','"+companyName+"','"+phone+"','"+mail+"','"+address+"','"+nic+"')");
                DataBase dataBase = new DataBase();
                String dataWrite = dataBase.dataWrite(query);
                System.out.println(dataWrite);
                
                JOptionPane.showMessageDialog(rootPane,"User Registered Successfully.");
                  
            }
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
     
        
}
