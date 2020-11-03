/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintExceptionInformation;

/**
 * To  print the Exception Information we use simpy three methods which are avilable under throwable class
 * e.printStackTrace()
 * e.getMessage()
 * e.toString()
 */
public class Test {
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            //e.printStackTrace()
            e.printStackTrace();    //Print whole information only
            //e.toString()
         System.out.println(e.toString());  //Print Name and Description
         //e.getMessage()
         System.out.println(e.getMessage());  //Print Description Only
        }
    }
}
