

public class Greater3
{
    public static void main(String args[])
    {
        int a = 10, b = 15, c = 12;

        if(a > b)
        {
            if(a > c) {
                System.out.println("A is Greater");
            }
            else {
                System.out.println("C is Greater");
            }
        }
        else if(b > c) {
            System.out.println("B is Greater");
        }
        else {
            System.out.println("C is Greater");
        }
    }
}