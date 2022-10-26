import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n > 0){
                System.out.println(n + " is a positive number");
            }
            else if (n < 0){
                System.out.println(n + " is a negative number");
            }
            else {
                System.out.println(n + " is neither positive nor negative");
            }
        }
    }
}