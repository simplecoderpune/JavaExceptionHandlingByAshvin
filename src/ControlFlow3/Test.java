/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow3;

/**
 *What will happen if catch block itself has an exception????
 * Let's See!!!!!!!!!!!!!!!
 */
public class Test {
    public static void main(String args[])
    {
        try 
        {
            System.out.println("Step 1");
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(10/0);
        }
        
        /*
        So any risky statement outside the try block will be considered as unhandled Exceprion....
        
        
        */
        
        
        
    }
}
