
import java.util.Scanner;


class Customer
{
    private int customerid;
    private String customerName;
    private int mobno;

    // Default Constructor
    public Customer() {
        this.customerid = 137;
        this.customerName = "Shubham Sapkal";
        this.mobno = 89071023;
    }

    // Parameterize constructor
    public Customer(int customerid, String customerName, int mobno)
    {
        this.customerid = customerid;
        this.customerName = customerName;
        this.mobno = mobno;
    }

    // Getters
    public int getCustomerId() {
        return customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNn() {
        return mobno;
    }


    // To String method
    public String toString() {
        return "Customer [ " + customerid +" , " +  customerName + " , " + mobno + " ]";
    }

}



public class Constructor2
{
    public static void main(String args[])
    {
        // Creating Object
        Customer c1 = new Customer();

        // System.out.println("Customer C1: ");
        // System.out.println("Id: " + c1.getCustomerId());
        // System.out.println("Name: " + c1.getCustomerName());
        // System.out.println("Mobile NO: " + c1.getCustomerNn());
        
        System.out.println(c1);

        // Taking User Input
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String name = scan.next();
        // String temp = scan.nextLine();
        int mob = scan.nextInt();

        Customer c2 = new Customer(id, name, mob);
        
        // System.out.println("Customer C2: ");
        // System.out.println("Id: " + c2.getCustomerId());
        // System.out.println("Name: " + c2.getCustomerName());
        // System.out.println("Mobile NO: " + c2.getCustomerNn());

        System.out.println(c2);

        // Closing Scanner Object
        scan.close();

    }
}