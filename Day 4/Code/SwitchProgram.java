

public class SwitchProgram
{
    public static void main(String args[])
    {

        System.out.println("\nEnter Your Choice");
        System.out.println("\n1. Addition");
        System.out.println("\n2. Subtraction");
        System.out.println("\n3. Multiplication");
        System.out.println("\n4. Divison");

        int ch = 3;

        int a = 10;
        int b = 5;


        switch(ch)
        {
            case 1:
                System.out.println("Addtion is: " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction is: " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication is: " + (a*b));
                break;
            case 4:
                System.out.println("Division is: " + (a/b));
                break;
            default: 
                System.out.println("Error 404: Choice Not Found");
        }

        

    }
}