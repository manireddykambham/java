package arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
// Outputs Volvo
        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[0]);
        cars[0] = "Lexus";
        System.out.println(cars[0]);
        System.out.println(cars.length);
// Outputs 4
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        for (int i : myNum) {
            System.out.println(i);
        }
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

// Get the length of the array
        int length = ages.length;

// Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

// Calculate the average by dividing the sum by the length
        avg = sum / length;

// Print the average
        System.out.println("The average age is: " + avg);
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
    }
}
