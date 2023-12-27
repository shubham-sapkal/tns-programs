package com.day10.pkg.first;

public class BaseClass {
	// Declare all types of data members
    int defaultData = 10;
    public int publicData = 20;
    private int privateData = 30;
    protected int protectedData = 40;

    // Methods 
    void defaultMethod()
    {
        System.out.println("Default Method!");
        System.out.println("DefaultData: " + defaultData);
    }

    public void publicMethod()
    {
        System.out.println("Public Method!");
        System.out.println("PublicData: " + publicData);
    }

    private void privateMethod()
    {
        System.out.println("Private Method!");
        System.out.println("PrivateData: " + privateData);
    }

    protected void protectedMethod()
    {
        System.out.println("Protected Method!");
        System.out.println("ProtectedData: " + protectedData);
    }

    // Access method
    public void access()
    {
        privateMethod();
        protectedMethod();
    }

    // Wihin the same class
    // public static void main(String args[])
    // {
    //     BaseClass obj = new BaseClass();

    //     obj.defaultMethod();  // accessible
    //     obj.publicMethod();   // accessible
    //     obj.privateMethod();  // accessible
    //     obj.protectedMethod(); // accessible
    // }
}
