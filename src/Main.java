import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string : ");
        char[] letters = in.nextLine().toCharArray();

        System.out.println("Reversed string : ");
        for(int i=letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
        }
    }
}