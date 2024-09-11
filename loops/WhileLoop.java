package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int x =(int) (Math.random()*100);
        System.out.println(x);
        while(x>0){
            System.out.println(x);
            x-=10;
        }
    }
}
