package com.day10.pkg.first;


public class PackageClass {
	// within same package
    public static void main(String args[])
    {
        // System.out.println("dasds");

        BaseClass obj = new BaseClass();

        obj.defaultMethod();  // accessible
        obj.publicMethod();   // accessible
        // obj.privateMethod();  // Inaccessible
        obj.protectedMethod(); // accessible
    }
}
