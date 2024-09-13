package methods;

public class ObjectClass {
    public int x =5;
    int y =5; //If it is declared as final int y =5; then it will throw an error
    public static void main(String[] args) {
        ObjectClass objectClass1 = new ObjectClass();
        objectClass1.y =10;
        System.out.println(objectClass1.y);//Y value is changed to 10
        System.out.println(objectClass1.x);
        ObjectClass objectClass2 = new ObjectClass();
        System.out.println(objectClass2.x);
    }
}
