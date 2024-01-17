import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        int total = num1 + num2;
        System.out.print("Enter your name: ");
        in.nextLine();
        String str1 = in.nextLine();
        System.out.println(str1 + " your total is :" + total);
    }
}