import encapsulation.Person;
import enums.EnumExample;
import interfaces.InterfaceClass;
import interfaces.MultipleInterfaceClass;
import methods.PublicVsStatic;
import methods.SecondClass;
import polymorphism.Animal;
import polymorphism.Dog;
import polymorphism.Pig;
import threads.RunnableClass;
import threads.ThreadClass;

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
        Person myPerson = new Person();
        myPerson.Setname("John");
        System.out.println(myPerson.Getname());
        /*ScannerClass scannerClass = new ScannerClass();
        scannerClass.scan();
        scannerClass.print();*/
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        InterfaceClass cat = new InterfaceClass();
        cat.sleep();
        cat.eat();
        MultipleInterfaceClass multipleInterfaceClass = new MultipleInterfaceClass();
        multipleInterfaceClass.myMethod();
        multipleInterfaceClass.myOtherMethod();
        EnumExample enumExample = new EnumExample();
        EnumExample.Colors value = EnumExample.Colors.BLUE;
        System.out.println(enumExample.ColorTeller(String.valueOf(value)));
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        System.out.println("out side thread");
        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass);
        thread.start();



    }
}
