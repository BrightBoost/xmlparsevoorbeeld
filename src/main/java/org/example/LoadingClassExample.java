package org.example;

public class LoadingClassExample extends LoadingClassParentExample {
    // stap 1: laad de static variables in de volgorde waarop ze staan
    // stap 2: static blocks in de volgorde waarop ze staan
    // stap 3: instance variables
    // stap 4: instance initializer blocks
    // stap 5: constructor
    private String instanceVariable = "init";
    public static String staticVariable;

    static {
        System.out.println("static initializer block");
        staticVariable = "4";
    }

    {
        System.out.println("START non-static initializer block");
        System.out.println(instanceVariable);
        instanceVariable = "new";
        System.out.println(instanceVariable);
        System.out.println("END non-static initializer block");


    }

    public LoadingClassExample() {
        System.out.println("START constructor");
        System.out.println(instanceVariable);
        System.out.println("END constructor");
    }
}
