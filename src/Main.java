import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a : ");
        int number1 = in.nextInt();
        System.out.print("Input b : ");
        int number2 = in.nextInt();
        if (number1 == number2)
            System.out.println(number1 + "==" + number2);
        if (number1 != number2)
            System.out.println(number1 + "!=" + number2);
        if (number1 < number2)
            System.out.println(number1 + "<" + number2);
        if (number1 > number2)
            System.out.println(number1 + ">" + number2);
        if (number1 <= number2)
            System.out.println(number1 + "<=" + number2);
        if (number1 >= number2)
            System.out.println(number1 + ">=" + number2);
    }
    }