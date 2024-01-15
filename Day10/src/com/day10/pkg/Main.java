package com.day10.pkg;

import com.day10.pkg.first.BaseClass;

public class Main {
	// Out side the pkg 
    public static void main(String args[])
    {
        BaseClass obj = new BaseClass();

//        obj.defaultMethod();  // Inaccessible
        obj.publicMethod();   // Accessible
//        obj.privateMethod();  // Inccessible 
//        obj.protectedMethod();  // Inaccessible
    

        System.out.println("---------------------------------");
        obj.access();
        System.out.println("---------------------------------");

    }
}
