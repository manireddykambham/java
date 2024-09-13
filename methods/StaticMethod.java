package methods;

public class StaticMethod {
    static int ReturnMethod(int x) {
        return x;
    }
    static int ReturnDoubleMethod(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(ReturnMethod(3));
        System.out.println(ReturnDoubleMethod(3,4));
        int z= ReturnDoubleMethod(5,6);
        System.out.println(z);

    }
}
