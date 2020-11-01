/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UncheckedException;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
       System.out.println(10/0);   //Arithematic Exception
       int arr[]=new int[10];
       arr[11]=123;
       System.out.println(arr[11]);   //ArrayIndexOutOfBound Exception
    }
    
}
