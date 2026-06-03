package Java_FSE;

public class MethodOverloadingDemo {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;

        double d1 = 10.5;
        double d2 = 20.5;

        System.out.println("Sum of two integers: " + add(x, y));
        System.out.println("Sum of two doubles: " + add(d1, d2));
        System.out.println("Sum of three integers: " + add(x, y, z));
    }
}