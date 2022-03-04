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
public class Response 
{
    
    String response = "I see you there";
    
    public String returnResponse()
    {
        
        return response;
    
    }
    
    public int calculateNumResponses(int intialResponseCount, int newResponses)
    {
    
          int totalresponses = intialResponseCount+ newResponses;
          
          return totalresponses;
          
    
    
    }
    
}




