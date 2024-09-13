package loops;

public class ShortHandIfElse {
    public static void main(String[] args) {
        int x=(int)(Math.random()*100); //the reason we need int is because random give number between 0.0 to 1.0
        System.out.println(x);
        String y = (x%2==0)?"Even":"Odd";
        System.out.println(y);
        int time = x/2;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        //return (time>18)?"Good Evening.":"Good Day"; //This will not work in this method since it is returning void, to work make it String
    }
}
