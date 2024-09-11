package loops;

public class ElseIfLoop {
    public static void main(String[] args) {
        int x=11;
        if(x>10){
            System.out.println("if part "+x);
        } else if (x%2==0) {
            System.out.println("else if part "+x);
        }
        else{
            System.out.println("else part "+x);
        }

    }
}
