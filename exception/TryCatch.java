package exception;

public class TryCatch {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");//instead of running the workflow it will stop it
            /*Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
            at exception.TryCatch.checkAge(TryCatch.java:6)
            at exception.TryCatch.main(TryCatch.java:23)*/
            //ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[2]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }
        checkAge(18);

    }
}
