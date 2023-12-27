

public class Encapsule1
{
    public static void main(String args[])
    {

        Student s1 = new Student();
        
        // Using Public datamembers of class
        // System.out.println("Roll No: " + s1.rollno);
        // System.out.println("Name: " + s1.sname);
        // System.out.println("Division: " + s1.div);
        // System.out.println("Fees: " + s1.fees );
        // System.out.println("CGPA: " + s1.cgpa);

        // using Private datatypes
        s1.setRollNo(137);
        System.out.println("Roll NO: " + s1.getRollNo());

        s1.setName("Shubham Sapkal");
        System.out.println("Name: " + s1.getName());


    }
}