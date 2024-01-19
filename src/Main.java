import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first : ");
        int num1 = in.nextInt();
        System.out.print("Input second : ");
        int num2 = in.nextInt();
        System.out.print("Input third : ");
        int num3 = in.nextInt();

        if(num1+num2==num3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}