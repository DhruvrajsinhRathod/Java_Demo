import java.util.Scanner;

public class Main {
    int x = 50;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter here : ");
        String str = in.next();
        System.out.println(str);

        Main mainobj = new Main();
        System.out.println("The older value is : " + mainobj.x);
        mainobj.x=1203;
        System.out.println("The updated value is : " + mainobj.x);
    }
}