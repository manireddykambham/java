package methods;

public class PublicVsStatic {
    // Static method
    public static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
        int x=5;
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        PublicVsStatic myObj = new PublicVsStatic(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

        PublicVsStatic myCar = new PublicVsStatic();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);
    }
}
