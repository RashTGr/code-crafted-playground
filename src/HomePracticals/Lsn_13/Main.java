package HomePracticals.Lsn_13;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("John", 33);
        Person personB = new Person("John", 33);
        Person personC = new Person("Jane", 27);

        System.out.println("Person A: " + personA.toString());
        System.out.println("Person B: " + personB.toString());
        System.out.println("Person C: " + personC.toString());

        System.out.println();
        System.out.println("A equals() B:" +personA.equals(personB));
        System.out.println("A equals() C:" +personA.equals(personC));
    }


}
