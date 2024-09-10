package variables;

public class PrintVariables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello " + name);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
        int a = 5;
        int b = 6;
        int c = 50;
        System.out.println(a + b + c);
        int d = 5, e = 6, f = 50;
        System.out.println(d + e + f);
        int i, j, k;
        i = j = k = 50;
        System.out.println(i + j + k);
        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

// Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

// Calculate the area of a rectangle
        area = length * width;

// Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);


    }
}
