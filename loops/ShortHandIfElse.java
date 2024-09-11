package loops;

public class ShortHandIfElse {
    public static void main(String[] args) {
        int x=(int)(Math.random()*100);
        System.out.println(x);
        String y = (x%2==0)?"Even":"Odd";
        System.out.println(y);
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
