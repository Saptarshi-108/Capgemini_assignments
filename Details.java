package Java_training;

import java.util.Scanner;

public class Details {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float weight= sc.nextFloat();
        String name = sc.nextLine();
        int age = sc.nextInt();
        long phone = sc.nextLong();
        String email = sc.nextLine();
        String gender = sc.nextLine();
        boolean married = sc.nextBoolean();

        System.out.println(name);
        System.out.println(weight);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(gender);
        System.out.println(married);

        sc.close();
    }
}
