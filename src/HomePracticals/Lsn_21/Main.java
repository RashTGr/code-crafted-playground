package HomePracticals.Lsn_21;

class Main {
    public static void main(String[] args) {
        Student student = new Student("John", Grade.B);
        Score score = new Score();

        student.displayGrade();
        student.promoteStudent();
        student.displayGrade();


        score.setValue(75);
        Student student2 = new Student("Jane", score.convertToGrade());
        student2.displayGrade();

        student2.promoteStudent();
        student2.displayGrade();
    }
}
