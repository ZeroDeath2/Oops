import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int temp = n;
            int sum = 0;
            while (temp != 0){
                int rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }
            if (sum == n){
                System.out.println(n + " is an Armstrong Number");
            }
            else {
                System.out.println(n + " is not an Armstrong Number");
            }
        }
    }
}
