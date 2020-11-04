/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowSpecialCase3;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
      //  throw new Test();  //Test cant be converted to throwable
    }
}


class A extends RuntimeException {
    public static void main(String args[])
    {
     throw new A();  //A can be thrown as there is no handler code so it will raise an exception
    }
}


