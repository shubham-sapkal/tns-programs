

import java.util.Scanner;

public class TaxCalculation
{
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Your Name: ");
        String name = scan.next();

        System.out.print("\nYour Age: ");
        int age = scan.nextInt();

        System.out.print("\nYour Gender: ");
        String gender = scan.next();

        System.out.print("\nYour Income: ");
        int income = scan.nextInt();

        Person p1 = new Person();
        p1.setName(name);
        p1.setAge(age);
        p1.setGender(gender);
        p1.setIncome(income);

        Tax tax = new Tax();

        tax.calculateTax(p1);
        System.out.print("\nTax = " + p1.getTax());
    }
}