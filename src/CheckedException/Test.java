/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckedException;
import java.io.*;
/**
 *
 * @author DELL-PC
 */
/*
Checked Exception:---->Exceptions checked at compile time for smooth execution of program. so compiler raises an error to aware programmer that u must handle it compulsary....
It is analogous to "Hall Ticket Missing Exception" in exam where your mother is compiler who asks u to cross check it so that u are not stuck at runtime(exam time)


so Exception must be caught or thrown

............Either add try-catch or throw.....
*/
public class Test {
    public static void main(String args[]) throws IOException,FileNotFoundException     ///Compulsary Exception must be thrown to remain on the safe side 
    {
        FileOutputStream fis=new FileOutputStream("ABC.txt");
        fis.write(22);
    }
    
}

class A
{
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("I want to sleep very happily");
        Thread.sleep(2000);
        System.out.println("Now I will wake up");
/*
    Ur thread is sleeping there is a chance that someone can interrupt ur main function...so first report it         
*/
    }
}


