/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IllegalArgumentException;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String arg[]) 
    {
        Thread t=new Thread();
        t.setPriority(10);
        t.setPriority(100);
        //Not possible as 100 priority is not there
    }
}
