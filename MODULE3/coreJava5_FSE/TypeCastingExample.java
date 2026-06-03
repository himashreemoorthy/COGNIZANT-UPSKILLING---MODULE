package Java_FSE;

public class TypeCastingExample {
    public static void main(String[] args) {

        double decimalNumber = 15.75;
        int intValue = (int) decimalNumber;

        int number = 20;

        System.out.println("Original double value: " + decimalNumber);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Original int value: " + number);
        System.out.println("After converting to double: " + (double) number);
    }
}