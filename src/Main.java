import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        p = 2πr
//        A = π r²

        Scanner in = new Scanner(System.in);
        System.out.print("Input radius : ");
        double radius = in.nextDouble();
        double p = 2 * Math.PI * radius;
        double a = Math.PI * radius * radius;

        System.out.println("The perimeter is : " + p);
        System.out.println("The area is : " +a);
        }
    }