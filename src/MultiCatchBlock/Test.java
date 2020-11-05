/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiCatchBlock;

/**
 *
 * Java 1.7v has added new feature to reduce the code which is called multi catch block where you can use |(or) symbol to add different exceptions
 */
public class Test {
    public static void main(String args[])
    {
        try
        {
            Object o=new Object();
            String s=(String)o;
        }
        catch(ArithmeticException|ClassCastException e)
        {
            e.printStackTrace();
        }
    }
}
