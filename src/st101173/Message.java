/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st101173;

/**
 *
 * @author ctill
 */
public class Message 
{
    String returnMessage ="I have arrived";
    
    public String getMessage()
    {
        return returnMessage;
    }
    
    
    //do not allow special characters and messages are not to be more 20 characters
    
    public boolean checkMessageFormat()
    {
        boolean valid = false;
        
        if (returnMessage.length()>20 ||returnMessage.contains("@#$$%%^") ) 
        {
            valid = false;
        }
        
        else
        {
           valid = true;
        
        }
        
        return valid;
    
    }
    
    
     public String checkNum(int num)
     {
         String returnValue= null;
         if (num > 5) 
         {
             returnValue = "please do not exceed 5 ";
         }
         
         else
         {
         
             returnValue =" perfect numbers ";
         }
         
         
        return returnValue;
     
     }
    
   
}
