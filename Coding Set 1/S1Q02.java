import java.util.Scanner;

public class S1Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
