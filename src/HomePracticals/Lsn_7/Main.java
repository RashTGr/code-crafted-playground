package HomePracticals.Lsn_7;

public class Main {
    public static void main(String[] args) {
        // A class instance is created, and then the method is called on that instance
        Person man = new Person("David", "Malan", 35, "dm@example.com", "+019990000");

        man.setAge(18);
        man.setFirstName("Dave");
        String manName = man.getFirstName();
        String manSurname = man.getLastName();
        int manAge = man.getAge();
        String manEmail = man.getEmail();
        String manPhone = man.getPhone();
        boolean isAdult = man.isAdult();

        System.out.println("isAdult: " + isAdult + "\nName, Surname: " + manName + " "
                + manSurname + "\nAge: " + manAge + "\nE: "
                + manEmail + "\nCell: " + manPhone);

    }
}
