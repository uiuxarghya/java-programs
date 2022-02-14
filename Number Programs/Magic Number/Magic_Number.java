import java.util.*;

class Magic_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s = 0;
        while (n > 9) { // n=91
            s = 0;
            while (n != 0) {
                int d = n % 10;
                s = s + d;
                n = n / 10;
            }
            n = s;
        }
        if (s == 1)
            System.out.println("Magic number");
        else
            System.out.println("Not a Magic number");
    }
}