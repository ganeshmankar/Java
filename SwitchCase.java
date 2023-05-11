import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter you age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an adult!!!");
                break;
            case 23:
                System.out.println("You are going to join a job!!!");
                break;
            case 60:
                System.out.println("You are going to retired!!!");
                break;
            default:
                System.out.println("Enjoy your life!!!");
        }
        System.out.println("Thanks for using my java code!!!");
    }
}

/*switch (age) {
            case 18 -> System.out.println("You are going to become an adult!!!");
            case 23 -> System.out.println("You are going to join a job!!!");
            case 60 -> System.out.println("You are going to retired!!!");
            default -> System.out.println("Enjoy your life!!!");
        }*/
