import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string : ");
        int n = in.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}