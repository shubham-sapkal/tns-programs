

public class NestedCondition
{
    public static void main(String args[])
    {
        double marks = 88.65;

        if(marks > 35 && marks < 60)
            System.out.println("Candidate is Pass .. ");
        else if(marks >= 60 && marks < 85)
            System.out.println("Candidate is in first class .. ");
        else if(marks >= 85 && marks <= 100)
            System.out.println("Candidate is passed with destination .. ");

        
    }
}