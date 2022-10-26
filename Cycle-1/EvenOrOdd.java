import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 2 == 0){
                System.out.println(n + " is an even number");
            }
            else {
                System.out.println(n + " is an odd number");
            }
        }   
    }
}
