import HelloWorld.HelloWorld;
import methods.ObjectClass;
import methods.PublicVsStatic;
import methods.SecondClass;

import static methods.MethodBasic.myMethod;
import static methods.PublicVsStatic.myStaticMethod;
import static variables.AllVariables.variables;

public class Main {
    public static void main(String[] args) {
        //System.out.println("\nHello World\n");
        SecondClass.main(new String[0]);
        System.out.println("helloWorld");
        variables();
        myMethod();
        PublicVsStatic publicVsStatic = new PublicVsStatic();
        publicVsStatic.myPublicMethod();
        myStaticMethod();
        publicVsStatic.fullThrottle();
        publicVsStatic.speed(900);


    }
}
