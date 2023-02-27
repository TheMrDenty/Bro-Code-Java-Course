package Variables;

public class Main {
    public static void main(String[] args) {
        int x; // declaration
        x = 123; // assignment

        int y = 123; // initialization

        System.out.println("My number is" + x);
        System.out.println("My number is" + y);

        long z = 12323432534L;
        System.out.println("My long number is" + z);

        int a = 123; // cannot store decimals
        System.out.println("My integer is" + a);

        float b = 3.14f; // float can store decimals
        double c = 6.28; // double is more accurate and can store 15 digits
        System.out.println("My float is" + b);
        System.out.println("My double is" + c);

        boolean d = true; // bools can only store true or false
        System.out.println("My boolean is" + d);

        char symbol = '@'; // stores single character
        System.out.println("My char is" + symbol);

        String name = "Jamie"; // stores a string
        System.out.println("Hello" + name);
    }
}
