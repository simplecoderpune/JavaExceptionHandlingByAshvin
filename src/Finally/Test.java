/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finally;

/**
 *
 * @author DELL-PC
 */
/*
It is always recommended to write closeup code like close db connection inside finally block instead of try block as it is always executed whether Exception raised or Not
Suppose u r opening db, reading data,closing db in try block itself and u got exception whie reading data then db will not be closed as program will pass to catch block..
so u should write this code in finally block

*/
public class test {
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Catch");
        }
        finally
        {
            System.out.println("I have clean up or close up code I will be always executed");
        }
    }
    
}


class NoException
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("No Exception");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Catch");
        }
        finally
        {
            System.out.println("I have clean up or close up code I will be always executed");
        }
    }
}


/*
It is abnormal Execution as Exception is not handled then also finally will be executed then erro will be raised 
*/
class ExceptionNotHandled
{
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }
        catch(NullPointerException e)
        {
            System.out.println("Catch");
        }
        finally
        {
            System.out.println("Exception not handled then also I will be always executed");
        }
    }
}
