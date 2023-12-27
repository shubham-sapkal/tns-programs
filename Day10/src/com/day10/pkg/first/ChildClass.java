package com.day10.pkg.first;

//import com.day10.pkg.first.BaseClass;

public class ChildClass extends BaseClass {
	public static void main(String args[])
    {
        ChildClass obj = new ChildClass();

        obj.defaultMethod();  // Inaccessible
        obj.publicMethod();   // Accessible
//        obj.privateMethod();  // Inccessible 
        obj.protectedMethod();  // Inaccessible

    }
}
