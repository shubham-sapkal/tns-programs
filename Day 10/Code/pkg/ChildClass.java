
import pkg.BaseClass;

public class ChildClass extends BaseClass
{
    public static void main(String args[])
    {
        ChildClass obj = new ChildClass();

        obj.defaultMethod();  // Inaccessible
        obj.publicMethod();   // Accessible
        obj.privateMethod();  // Inccessible 
        obj.protectedMethod();  // Inaccessible

    }
}