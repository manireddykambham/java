package enums;


public class EnumExample {

    public enum Colors {
        RED, BLUE, GREEN, YELLOW;
    }
    public String ColorTeller(String color) {
        switch (color) {
            case "RED":
                return "Color is red";
            case "BLUE":
                return "Color is Blue";
            case "GREEN":
                return "Color is Green";
            case "YELLOW":
                return "Color is Yellow";
            default:
                return "Invalid color";
        }
    }
}
