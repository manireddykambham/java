package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("Toyota");
        car.add("BMW");
        car.add("Audi");
        car.add("Volvo");
        System.out.println(car);
        System.out.println(car.size());
        car.remove(0);
        System.out.println(car);
        car.add(0,"Toyota");
        System.out.println(car);
        System.out.println(car.get(0));
        car.set(0, "BMW");
        car.set(1, "Toyota");
        System.out.println(car);
        /*car.clear();
        System.out.println(car);*/
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }
        Collections.sort(car);
        for(String i : car){
            System.out.println(i);
        }
ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(2);
        numbers.add(30);
        numbers.add(04);
        Collections.sort(numbers);
        System.out.print("Sorted numbers: ");
        for(Integer i : numbers){
            System.out.println(i);
        }

    }
}
