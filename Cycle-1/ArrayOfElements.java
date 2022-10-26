import java.util.Scanner;
public class ArrayOfElements {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The elements are: ");
            for (int i = 0; i < n; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
