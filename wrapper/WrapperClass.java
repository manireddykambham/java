package wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        /*Primitive Data Type	Wrapper Class
        byte	Byte
        short	Short
        int	Integer
        long	Long
        float	Float
        double	Double
        boolean	Boolean
        char	Character*/
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(myInt.toString().length());//converting to string and printing length of string
    }
}
