import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input width : ");
        double width = in.nextDouble();
        System.out.print("Input height : ");
        double height = in.nextDouble();
//        A = l × w	P = 2(l + w)
        double a = height * width;
        double p = 2*(height+width);

        System.out.println("The area is "+a+" & the perimeter is :"+p);
        }
    }