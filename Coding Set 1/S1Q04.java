import java.util.Scanner;
public class S1Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to reverse : ");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println("Reversed Number : "+ rev);

        sc.close();
    }
}
