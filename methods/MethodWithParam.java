package methods;

public class MethodWithParam {
    public static void MethodParam(String name) {
        System.out.println("This is my name: " + name);
    }

    public static void MethodDoubleParam(String name, int age) {
        System.out.println("my name is : " + name + " and age is : " + age);
    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        MethodParam("Mani");
        MethodDoubleParam("Mani", 25);
        checkAge(25);
    }
}
