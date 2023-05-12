/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_warehouse;

/**
 *
 * @author SHEHARA
 */

//Inheritance

public class manager extends systemUser {
    
    
    public manager(String ID, String userName, String password, String name, String phoneNo, String userAddress, String nicNo) {
        super(ID, userName, password, name, phoneNo, userAddress, nicNo);
    }
    
      
    
      public manager() {
    }
      
    @Override
      public void registerUser(user user){ 
      user.addUser();
    }
    
}
