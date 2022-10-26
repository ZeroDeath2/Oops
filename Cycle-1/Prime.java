import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int i = 2;
            if ((n == 0) || (n == 1)) {
                System.out.println(n + " is Not a prime number");
            }
            while (i < n){
                if (n % i == 0){
                    System.out.println(n + " is not a prime number");
                    break;
                }
                i++;
            }
            if (i == n){
                System.out.println(n + " is a Prime Number");
            }
        }
    }
}
