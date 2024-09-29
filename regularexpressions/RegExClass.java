package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello");
        boolean found = matcher.find();
        if(found){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
    }
}
