import java.util.Scanner;
public class ElseIfStatements {
    public static void main(String[] args) {
        System.out.println("Enter you age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 56){
            System.out.println("You are experienced");
        }
        else if (age > 46){
            System.out.println("You are semi-experienced");
        }
        else if (age > 36){
            System.out.println("Ypu are semi-semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
    }
}
