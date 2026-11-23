import java.util.Scanner;

public class S1Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        boolean isprime = true;
        if (n < 2) {
            isprime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
        sc.close();
    }
}
