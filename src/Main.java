import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input num1 : ");
        int num1 = in.nextInt();
        System.out.print("Input num2 : ");
        int num2 = in.nextInt();
        System.out.print("Input num3 : ");
        int num3 = in.nextInt();
        System.out.print("Input num4 : ");
        int num4 = in.nextInt();
        System.out.print("Input num5 : ");
        int num5 = in.nextInt();
        int total = num1+num2+num3+num4+num5;
        int average = total/5;
        System.out.println("The average is: "+average);
        }
    }