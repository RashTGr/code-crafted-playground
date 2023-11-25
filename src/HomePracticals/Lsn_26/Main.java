package HomePracticals.Lsn_26;

import java.util.*;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ali", 25));
        personList.add(new Person("Yusuf", 17));
        personList.add(new Person("Amir", 95));
        personList.add(new Person("Galib", 44));
        personList.add(new Person("Pasha", 57));


        List<Person> above30 = personList.stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println(above30);


        List<String> personsNames = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Name list: " + personsNames);

        double agesAvr = personList.stream()
                .mapToDouble(Person::getAge)
                .average()
                .orElse(0);
        System.out.println("Averages: " + agesAvr);

        Optional<Person> oldest = personList.stream()
                .max(Comparator.comparingInt(Person::getAge));
        if (oldest.isPresent()) {
            System.out.println("Find oldest person in the list: " + oldest.get().getName());
        }


        Map<String, Integer> convertingToMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("Converting to Map: " + convertingToMap + "\n");



        System.out.println("=== Second Task ===");


        List<ProductDiscount> items = new ArrayList<>();
        items.add(new ProductDiscount("Software Architecture", Category.BOOKS, 33));
        items.add(new ProductDiscount("Clean Code", Category.BOOKS, 43));
        items.add(new ProductDiscount("Audi", Category.CAR, 75000));
        items.add(new ProductDiscount("Ford", Category.CAR, 65000));
        items.add(new ProductDiscount("Jacket", Category.CLOTHES, 49));
        items.add(new ProductDiscount("Jeans", Category.CLOTHES, 75));


        List<ProductDiscount> less50 = items.stream()
                .filter(item -> item.getPrice() < 50)
                .collect(Collectors.toList());
        System.out.println("\nLess than 50: \n" + less50);


        int sumOfPrices = items.stream()
                .mapToInt(ProductDiscount::getPrice)
                .sum();
        System.out.println("\nTotal: " + sumOfPrices);


        Map<Category, Double> categoryAverages = items.stream()
                .collect(Collectors.groupingBy(ProductDiscount::getCategory, Collectors.averagingDouble(ProductDiscount::getPrice)));
        System.out.println("\nCategory averages: " + categoryAverages);


        Map<Category, List<ProductDiscount>> filterByCat = items.stream()
                .collect(Collectors.groupingBy(ProductDiscount::getCategory));
        System.out.println("\n" +filterByCat);

    }
}
