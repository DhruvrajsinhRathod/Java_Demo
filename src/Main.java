import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a : ");
        int a = in.nextInt();
        System.out.print("Input b : ");
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A is: "+ a + " B is: "+ b);
        }
    }