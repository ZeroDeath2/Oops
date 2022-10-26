import java.util.Scanner;
public class Character {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String str = sc.nextLine();
            System.out.print("Enter a character: ");
            String ch = sc.nextLine();
            if (str.indexOf(ch) != -1){
                System.out.println(ch + " is present in " + str);
            }
            else {
                System.out.println(ch + " is not present in " + str);
            }

    }
}
}
