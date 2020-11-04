/*
 *<---------- USE OF THROW KEYWORD----------->
 *Throw Keyword is used to throw a user defined exception to the JVM... Throw Keyword is always used when there is a handler to handle that exception.
 *Suppose you have 30,000 in your saving account and you are withdrawing 350000... It must throw an Insufficient Fund Exception which is not pre defined Exception we have to explicitly raise it.
 */

package ThrowBasics;

/**
 *
 * @author DELL-PC
 */

//Without Using Throw Keyword

class A
{
    public static void main(String args[])
    {
        System.out.println(10/0);
    }
}

//With Throw Keyword
// You can explicitly raise the Exception with your own message//
public class Test {
    public static void main(String arg[])
    {
        throw new ArithmeticException("Division By Zero Ashvin");
    }
}
