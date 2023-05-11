import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i=1; i<=15; i++){
//            System.out.println(i);
//        }

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(2*i+1);   //Even - 2n and Odd - 2n+1
        }

//        for(int i = 5; i >= 0; i--){
//            System.out.println(i);
//        }

    }
}
