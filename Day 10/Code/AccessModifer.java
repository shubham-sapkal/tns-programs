
import pkg.BaseClass;

public class AccessModifer
{   
    // Out side the pkg 
    public static void main(String args[])
    {
        BaseClass obj = new BaseClass();

        obj.defaultMethod();  // Inaccessible
        obj.publicMethod();   // Accessible
        obj.privateMethod();  // Inccessible 
        obj.protectedMethod();  // Inaccessible
    

        System.out.println("---------------------------------");
        obj.access();
        System.out.println("---------------------------------");

    }
}