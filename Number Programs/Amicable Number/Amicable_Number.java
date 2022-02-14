import java.util.*;

class Amicable_Number {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  two numbers");
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int i, s1 = 0, s2 = 0;
        for (i = 1; i < n1; i++) {
            if (n1 % i == 0)
                s1 = s1 + i;
        }
        for (i = 1; i < n2; i++) {
            if (n2 % i == 0)
                s2 = s2 + i;
        }
        if (s1 == n2 && s2 == n1)

            System.out.println("Amicable Number");
        else
            System.out.println("Not an Amicable Number");
    }
}