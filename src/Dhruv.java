import java.util.Scanner;

public class Dhruv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int one = in.nextInt();
        System.out.println("Enter The Second Number : ");
        int two = in.nextInt();
        System.out.println("Enter The Third Number : ");
        int three = in.nextInt();
        System.out.println("The largest number is : " + Smallest(one, two, three));
    }

    public static int Smallest(int one, int two, int three) {
        int large = one;
        if (two > large) {
            large = two;
        }
        if(three > large){
            large = three;
        }
        return large;
    }
}
