import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--){
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev)){
                System.out.println(str + " is a Palindrome");
            }
            else {
                System.out.println(str + " is not a Palindrome");
            }
        }
    }
}
