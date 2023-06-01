package HomePracticals.Lsn_13;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // If objects are the same instance in memory then equal
        if(this == obj){
            return true;
        }
        // Objects are null or in different classes then not equal
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj; // Casting object to Person
        // Comparing name and age vars
        return name.equals(other.name) && age == other.age;
    }

    // Override for a string representation of a Person object
    @Override
    public String toString() {
        return "Person[name='" + name + "', age=" + age + "]";
    }
}
