/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowsSpecialCase1;

/**
 * Observe this case very carefully and special concern
 */
public class Test {
    public static void main(String args[])
    {
        dowork();
    }
    static void dowork()
    {
        domorework();
    }
    static void domorework()
    {
        //Thread.sleep(1000); //oye domorework do you have handler???
    }
}
 class A {
    public static void main(String args[])
    {
        dowork();
    }
    static void dowork()
    {
        //domorework();   //now compiler will ask him oye dowork where is ur handler s domorework asked me to go to dowork
    }
    static void domorework() throws InterruptedException
    {
        Thread.sleep(1000); //oye domorework do you have handler???
    }
}
 class B {
    public static void main(String args[])
    {
      //  dowork();   //It will ask main where is your handler main will throw it to JVM and JVM will handle it
    }
    static void dowork() throws InterruptedException
    {
        domorework();  
    }
    static void domorework() throws InterruptedException
    {
        Thread.sleep(1000); //oye domorework do you have handler???
    }
}
 class C {
    public static void main(String args[]) throws InterruptedException
    {
        dowork();   //It will ask main where is your handler main will throw it to JVM and JVM will handle it
    }
    static void dowork() throws InterruptedException
    {
        domorework();  
    }
    static void domorework() throws InterruptedException
    {
        Thread.sleep(1000); //oye domorework do you have handler???
    }
}
