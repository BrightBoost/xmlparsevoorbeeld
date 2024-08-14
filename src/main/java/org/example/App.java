package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // begint bij static parent
        new LoadingClassExample();
        System.out.println("***********");
        // tweede keer niet static laden
        new LoadingClassExample();

    }
}
