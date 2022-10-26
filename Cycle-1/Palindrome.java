import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int temp = n;
            int rev = 0;
            while (temp != 0){
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (rev == n){
                System.out.println(n + " is a Palindrome Number");
            }
            else {
                System.out.println(n + " is not a Palindrome Number");
            }
        }
    }
}
