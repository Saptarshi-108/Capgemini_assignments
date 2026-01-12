import java.util.Scanner;

class DisariumNumber {
    static boolean isDisarium(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            sum += Math.pow(d, i + 1);
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isDisarium(n));
    }
}
