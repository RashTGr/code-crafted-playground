package HomePracticals.Lsn_17;

class Structure {
    String[] question = new String[4];
    char[] correctAnswers = new char[4];
    String[] choices = new String[4];

    public String[] getQuestion() {
        return question;
    }

    public char[] getCorrectAnswers() {
        return correctAnswers;
    }

    public String[] getChoices() {
        return choices;
    }

    // tight coupling
    // loose coupling


    public void questions(){
        question[0] = "1. Which of the following data.txt types is used to store characters in Java?";
        question[1] = "2. Which loop is guaranteed to execute at least once in Java?";
        question[2] = "3. What is the process of creating an object from a class called";
        question[3] = "4. What is the purpose of a .jar file in Java?";
    }

    public void choices(){
        choices[0] = "a)boolean \nb)String \nc)char \nd)int \n";
        choices[1] = "a)for loop \nb)do-while \nc)while \nd)for each \n";
        choices[2] = "a)Inheritance \nb)Polymorphism \nc)Instantiation \nd)Abstraction \n";
        choices[3] = "a)It is an executable file format for running Java programs directly." +
                "\nb)It is a compressed file format used for storing source code." +
                "\nc)It is a configuration file used for specifying project dependencies in Java." +
                "\nd)It is an archive file format used for packaging compiled Java classes and resources.\n";
    }

    public char[] correctAnswers(){
        correctAnswers[0] = 'c';
        correctAnswers[1] = 'b';
        correctAnswers[2] = 'a';
        correctAnswers[3] = 'd';
        return getCorrectAnswers();
    }

}
