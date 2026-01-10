package Java_training;

public class operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("ARITHMETIC OPERATORS");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        int x = 50;

        System.out.println("\nASSIGNMENT OPERATORS");
        x += 10;
        System.out.println("x += 10 : " + x);

        x -= 5;
        System.out.println("x -= 5 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        x /= 5;
        System.out.println("x /= 5 : " + x);

        x %= 3;
        System.out.println("x %= 3 : " + x);

        int p = 15;
        int q = 20;

        System.out.println("\nRELATIONAL OPERATORS");
        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        System.out.println("p > q  : " + (p > q));
        System.out.println("p < q  : " + (p < q));
        System.out.println("p >= q : " + (p >= q));
    }
}
