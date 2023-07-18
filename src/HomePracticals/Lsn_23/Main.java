package HomePracticals.Lsn_23;

class Main {
    public static void main(String[] args) {
//        GenericList<Integer> intType = new GenericList<>();
//        intType.add(10);
//        intType.add(17);
//        intType.add(33);
//
//
//        GenericList<Student> studentClass = new GenericList<>();
//        studentClass.add(new Student("John", Grade.B));
//        studentClass.add(new Student("Jane", Grade.A));
//
//        // Retrieves ALL items added to the instance
//        intType.getAll();
//        studentClass.getAll();
//
//        System.out.println();
//
//        //Retrieves and returns the element at the specified index.
//        System.out.println(intType.get(1));
//        studentClass.get(0).displayGrade();
//
//
//        // Get the size of instance
//        System.out.println("size of intType: " + intType.size());;
//        System.out.println("size of studentClass: " + studentClass.size());


        Shopping<String> basket = new Shopping<>();

        basket.add("Audi");
        basket.add("Hyundai");
        basket.add("Ford");
        basket.add("Volvo");
        basket.add("Volvo");
        basket.add("Audi");
        basket.add("Chrysler");

        basket.printShoppingItems();
        System.out.println();

        basket.remove("Hyundai");
        basket.printShoppingItems();

    }
}
