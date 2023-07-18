package HomePracticals.Lsn_21;

public class Student {
    private String name;
    private Grade grade;

    public Student(String name, Grade grade){
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name){
       this.name = name;
    }

    public void setGrade(Grade grade){
        this.grade = grade;
    }


    // This method is to display name and grade
    public void displayGrade(){
        System.out.print("Student name is " + this.name);
        System.out.println(", and grade = " + this.grade +"\n");
    }

    public void promoteStudent(){
        switch (grade){
            case F:
                grade = Grade.E;
                System.out.println("Grade is promoted to " + Grade.E);
                break;
            case E:
                grade = Grade.D;
                System.out.println("Grade is promoted to " + Grade.D);
                break;
            case D:
                grade = Grade.C;
                System.out.println("Grade is promoted to " + Grade.C);
                break;
            case C:
                grade = Grade.B;
                System.out.println("Grade is promoted to " + Grade.B);
                break;
            case B:
                grade = Grade.A;
                System.out.println("Grade is promoted to " + Grade.A);
                break;
            case A:
                System.out.println("This is the max grade.");
                break;
            default:
                System.out.println("Invalid input. This grade is out of range.");
        }
    }

    // This method added to enable me to print results from Generics class implementation
    @Override
    public String toString() {
        return "Student name is " + name + " and grade = " + grade;
    }
}
