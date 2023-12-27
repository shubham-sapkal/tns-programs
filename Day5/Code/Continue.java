

public class Continue
{
    public static void main(String args[])
    {

        // Printing only odd number
        for(int i=0; i<20; i++)
        {
            if(i%2 == 0)
                continue;

            System.out.print(i + " ");
        }

    }
}