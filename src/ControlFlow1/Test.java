/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow1;

/**
 *  Suppose in try block there are three statements and exception raised in second statement which is handled succesfully.. Will third statement be executed???
 *  Will Control again come to try block from catch?????
 * Lets see!!!!!!!!!!!
 */
public class Test {
public static void main(String args[])
{
    try
    {
        System.out.println("Statement-1");
        System.out.println(10/0);
        System.out.println("Statement-3");    // so answer is NOOOOOO it will not be executed
    }
    catch(ArithmeticException e)
    {
        System.out.println("Eception Raised");
    }
        System.out.println("Statement-4");
}

/*
so best practise is to use seperate catch block after each RiskyCode
*/

}
