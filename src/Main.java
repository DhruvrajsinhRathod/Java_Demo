import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num1 = in.nextInt();
        for(int i=1;i<=10;i++){
            int total = num1 * i;
            System.out.println(num1 + "*" + i + "=" + total);
        }
    }
}