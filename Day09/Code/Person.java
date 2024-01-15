// Storing Person Information
class Person {

    // Data Members
    private String name;
    private int age;
    private String gender;
    private int income;
    private int tax;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    } 

    public String getGender() {
        return gender;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    // Implementing Todo String method
    public String toString()
    {
        return "Person = [ " +  name + ", "  +age + ", " + gender + ", " + income + ", " + tax + " ]";
    }

}