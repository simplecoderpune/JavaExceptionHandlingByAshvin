/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

/**
 *
 * @author DELL-PC
 */
public class Test {
//   Without try catch 
    static void m1()
    {
        System.out.println(10/0);
    }
    public static void main(String args[])
    {
        System.out.println("Hi");
        m1();
        System.out.println("Hello");
    }
  /*
    It will print hi then it will go to m1(),,,but unfortunately in m1() exception occurs 
    so JVM will ask m1() do u have handle code m1(0 will reply NO..JVM will fire him..then JVM 
    will ask main() if u have any handler main() will reply NO then JVM will terminate it..
    */  
//So thi is Non Graceful or abnormal termination not recommended
}
/*
****************************************USING TRY CATCH********************************** TRY CATCH*****************************************************************************************
*/
class ExceptionHandling
{
    static void m1()
    {
        try
        {
            System.out.println(10/0);          //RISKY PART SIRRRR KEEP IT IN TRY BLOCK
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception:-->Division By zero");
            System.out.println("USe alternative:---"+10/2);
        }
        
    }
    static void m2()
        {
         System.out.println(10/0);   
        }
    public static void main(String args[])
    {
      System.out.println("Step 1");
      m1();
      System.out.println("Reached at step 2 so Normal Termination");
      try{
          m2();
        }
      catch(Exception e)
      {
         System.out.println("Exception raised and handled by main try catch block") ;
      }
      System.out.println("m2 terminated succesfully");
    }
}
