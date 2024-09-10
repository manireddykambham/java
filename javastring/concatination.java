package javastring;

public class concatination {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);
        String txt1 = "It\'s alright.";
        System.out.println(txt1);
        String txt2 = "The character \\ is called backslash.";
        System.out.println(txt2);

    }
}
