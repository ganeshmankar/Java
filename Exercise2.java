import java.util.Scanner;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("*****WELCOME TO ROCK, PAPER AND SCISSORS GAME*****");
        System.out.println("Enter 0 for Rock\nEnter 1 for Paper\nEnter 2 for Scissors");
        int i = 1;
        while (i < 6) {
            System.out.println("Your turn: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("Computer: ");
            Random r = new Random();
            int b = r.nextInt(2);
            System.out.println(b);
            if (a == 0 && b == 2 || a == 1 && b == 0 || a == 2 && b == 1) {
                System.out.println("YOU WIN !!!");
            } else if (a == 2 && b == 0 || a == 0 && b == 1 || a == 1 && b == 2) {
                System.out.println("YOU LOSS !!");
            } else if (a == b) {
                System.out.println("Its a Tie!");
            }
            i++;
        }
    }
}
