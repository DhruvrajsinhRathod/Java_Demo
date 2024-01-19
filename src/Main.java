import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = in.nextInt();
        if(n%2==0){
            System.out.println("This is even.");
        }
        else {
            System.out.println("This is odd.");
        }
    }
}