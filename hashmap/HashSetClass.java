package hashmap;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());
        if (cars.contains("Audi")) {
            System.out.println("Yes audi is present");
        }
        System.out.println(cars.contains("Mazda"));
        cars.remove("Mazda");
        if (cars.contains("Mazda")) {
            System.out.println("Yes Mazda is present");
        }else{
            System.out.println("Mazda is not present");
        }
        for (String car : cars) {
            System.out.println(car);
        }
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

    }
}
