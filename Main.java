import HelloWorld.HelloWorld;
import methods.ObjectClass;

import static methods.MethodBasic.myMethod;
import static variables.AllVariables.variables;

public class Main {
    public static void main(String[] args) {
        //System.out.println("\nHello World\n");
        ObjectClass objectClass = new ObjectClass();
        System.out.println(objectClass.x);
        System.out.println("helloWorld");
        variables();
        myMethod();

    }
}
