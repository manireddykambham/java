package methods;

public class MethodScope {
    public static void Scope() {


        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
    }
    public static void BlockScope() {
        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x
    }
    public static void main(String[] args) {
        Scope();
        BlockScope();
    }
}
