import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = in.nextInt();

        System.out.println("Divided by 3 : ");
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.println(i + ", ");
            }
        }
        System.out.println("Divided by 5 : ");
        for(int i=1;i<=n;i++){
            if(i%5==0){
                System.out.println(i + ", ");
            }
        }
        System.out.println("Divided by 3 & 5 both : ");
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i + ", ");
            }
        }
    }
}