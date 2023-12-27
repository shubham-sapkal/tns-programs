

class Student
{
    private int sid;
    private String name;

    // Default Constructor
    Student()
    {
        System.out.println("Default Constructor ... ");
        this.sid = 137;
        this.name = "Shubham";
    }

    // Parameterized Constructor
    Student(int sid, String name)
    {
        System.out.println("Calling Parameterized Constructor ... ");
        this.sid = sid;
        this.name = name;
    }

    // Creating toString() method
    public String toString()
    {
        return "Student: " + sid + ", " + name; 
    }
}


public class Constructor
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student(134, "Sandeep");
        System.out.println(s2);
    }
}