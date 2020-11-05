/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowsKeyword;

/**
 *
 * @author DELL-PC
 */

// If there is a possibility of Exception then handle it
public class Test {
    public static void main(String args[])
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            
        }
    }
    //Otherwise just report it.We are reporting
    static void min() throws InterruptedException
    {
        Thread.sleep(1000);
    }
    
}
