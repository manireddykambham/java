package loops;

public class Switchs {
    public static void main(String[] args) {
        int x=(int)(Math.random()*100);
        System.out.println(x);
        x=x%2;
        switch(x){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Unknown");
                break;
        }


    }
}
