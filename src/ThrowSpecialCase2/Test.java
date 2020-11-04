/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowSpecialCase2;

/**
 *
 * @author DELL-PC
 */

//Default Throw
//Compiler doesnt know till 18th line that there is an Exception
public class Test {
 public static void main(String args[])
 {
     System.out.println(10/0);
     System.out.println("Hello");
 }
}


class A {
 public static void main(String args[])
 {
     throw new ArithmeticException();
    /// System.out.println("Hello");     ///Yessss It will show unreachable Code error as Compiler exlicity knows that there is an exception here
    //so below this statement none statement will execute
 }
}
