/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowSpecialCase1;

/**
 *
 * @author DELL-PC
 */

// Since It is instantiating and Using the no arg constructor of AE hence it will throw Arithmetic Exception
public class Test {
    static ArithmeticException e=new ArithmeticException();
    public static void main(String args[])
    {
           throw e;
    }
}

// As it is static variable since we have only declared it so its default value is null.
// Hence It will raise Null Pointer Exception

class A {
    static ArithmeticException e;
    public static void main(String args[])     
    {
           throw e;
    }
}
