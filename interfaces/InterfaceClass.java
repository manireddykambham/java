package interfaces;


interface InterfaceClas {
    public void sleep();
    public void eat();

}
public class InterfaceClass implements InterfaceClas {
    public void sleep() {
        System.out.println("10 hours");
    }
    public void eat() {
        System.out.println("Milk");
    }
}


