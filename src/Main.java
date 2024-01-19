import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds : ");
        int seconds = in.nextInt();
        int S = seconds % 60;  // Calculate the remaining seconds
        int H = seconds / 60;  // Convert total seconds to minutes
        int M = H % 60;         // Calculate the remaining minutes
        H = H / 60;            // Convert total minutes to hours
        System.out.print(H + ":" + M + ":" + S);
    }
}