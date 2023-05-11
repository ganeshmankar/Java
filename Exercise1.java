import java.util.Scanner;

public class Exercise1 {

    public static void main(String[]args){

        Scanner S = new Scanner(System.in);

        System.out.println("Enter the marks of Physics: ");
        float p = S.nextFloat();

        System.out.println("Enter the marks of Chemistry: ");
        float c = S.nextFloat();

        System.out.println("Enter the marks of Mathematics: ");
        float m = S.nextFloat();

        float r = ((p+c+m)/300)*100;
        System.out.println("Percentage = " + r);

    }

}
