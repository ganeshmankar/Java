import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int a = 1;
        //At first it will print then check the condition so it is guarantee to execute at least one
        do{
//            System.out.println("Hey!");
            System.out.println(a);
            a++;
        }while (a <= n);
    }
}
