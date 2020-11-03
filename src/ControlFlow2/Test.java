/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow2;

/**
 *Suppose there is no handler of that type then what will happen means U have catch block with NULL Pointer Exception but 
 * try block has raised Arithmetic One???
 * Wll It handle or not Lets have a look!!!!!
 */
public class Test {
    public static void main(String args[])
    {
        try
        {
            System.out.println("Statement 1");
            System.out.println(10/0);
            System.out.println("Statement 2");
        }
        catch(NullPointerException e)
        {
            System.out.println("Raised");
        }
        System.out.println("Statement 3");   /// It will not be printed Got it because it is abnormal termination
    }
}
