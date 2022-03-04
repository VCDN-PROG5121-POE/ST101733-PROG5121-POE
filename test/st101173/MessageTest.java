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
public class MessageTest 
{
    Message message = new Message();
    public MessageTest() { }

    @Test
    public void testGetMessage() 
    {
        String expected ="I have arrived";
        String actual = message.getMessage();
        
        assertEquals(expected,actual);
    }

    @Test
    public void testCheckMessageFormat() 
    {
        assertTrue(message.checkMessageFormat());
    }

    @Test
    public void testCheckNumSuccess() 
    {
        
        for (int i = 0; i < 3; i++) 
        {
            String expected = " perfect numbers ";
            String actual  = message.checkNum(i);
            assertEquals(expected,actual);
        }
    }
    
  
    
}
