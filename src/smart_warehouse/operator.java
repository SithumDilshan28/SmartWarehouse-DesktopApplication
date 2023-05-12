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
public class operator extends systemUser {

    public operator(String ID, String userName, String password, String name, String phoneNo, String userAddress, String nicNo) {
        super(ID, userName, password, name, phoneNo, userAddress, nicNo);
    }
    
    public operator() {
    }
    
    @Override
      public void registerUser(user user){ 
      user.addUser();
    }
  
}