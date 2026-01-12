import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int d = Integer.parseInt(b, 2);
        System.out.println(d);
    }
}
