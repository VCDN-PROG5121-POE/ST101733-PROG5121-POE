/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st101173;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

/**
 *
 * @author ctill
 */
public class ResponseTest {
    
    Response response = new Response();
    
    public ResponseTest() {
    }

    @Test
    public void testReturnResponse() 
    {
        
        String expected ="I see you there";
        String actual  = response.returnResponse();
        assertEquals(expected,actual);
    }

    @Test
    public void testCalculateNumResponses() 
    {
        int expected = 50;
        
        int actual  = response.calculateNumResponses(10, 40);
        
        assertEquals(expected,actual);
        
    }
    
    
}
