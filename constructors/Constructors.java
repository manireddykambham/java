package constructors;

public class Constructors {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public Constructors() {
        x = 5;  // Set the initial value for the class attribute x
    }
    public Constructors(int y) {
        x = y;
    }
    int modelYear;
    String modelName;

    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }


    public static void main(String[] args) {
        Constructors myObj = new Constructors(1996,"Mustang"); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
        System.out.println(myObj.modelYear+" "+myObj.modelName);
    }
}
