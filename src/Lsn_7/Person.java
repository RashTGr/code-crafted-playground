package Lsn_7;

public class Person {

    // Attributes
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;

    // Constructor
    // and constructor parameters don't have to be the same as the names of the instance variables(name, age, sound).
    public Person(String firstN, String lastN, int age, String email, String mobile) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.age = age;
        this.email = email;
        this.phone = mobile;
    }

    // Method that sets the first name
    // The names of the method parameters can be different from the instance variables
    public void setFirstName(String personFirstName) {
        this.firstName = personFirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    // Using "this" keyword with getter methods is NOT necessary, however,
    // it CAN be a helpful practice for clarity and consistency in the code.
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone () {
        return phone;
    }

    public boolean isAdult() {
        return age >= 18;
    }

}
