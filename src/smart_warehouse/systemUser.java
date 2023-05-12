/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_warehouse;

import java.awt.Component;

/**
 *
 * @author SHEHARA
 */
public class systemUser {
    
    //Encapsulation
    //variables
    private String id;
    private String userName;
    private String password;
    private String fullName;
    private String phone;
    private String address;
    private String nic;
    private Component rootPane;
    
    
     public systemUser (String ID, String userName, String password,String name, String phoneNo, String userAddress, String nicNo) {
         
        this.id = ID;
        this.userName = userName;
        this.password = password;
        this.fullName = name;
        this.phone = phoneNo;
        this.address = userAddress;
        this.nic = nicNo;
    
}

      public Component getRootPane(){
           return rootPane;
     }
     
      public void setRootPane (Component rootPane){
         this.rootPane = rootPane;
      }
     
     
    public systemUser() {
    }
     
     public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = ID;
    }
    
     public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }
    
      public String getpassword() {
        return password;
    }

    public void setemail(String password) {
        this.password = password;
    }

    public String getname() {
        return fullName;
    }

    public void setname(String name) {
        this.fullName = name;
    }


    public String getphoneNo() {
        return phone;
    }

    public void setphoneNo(String phoneNo) {
        this.phone = phoneNo;
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
     
     
      public void registerUser(user user){ 
      user.addUser();
    }
    
   
 }
    

