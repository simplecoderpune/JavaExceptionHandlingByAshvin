/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultException;

/**
 *
 * @author DELL-PC
 */
public class Test {
    void cat()
    {
        dog();
    }
    void dog()
    {
        System.out.println(10/0);
    }
    public static void main(String args[])
    {
        Test t=new Test();
        t.cat();
    }
    
}
