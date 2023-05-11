import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //Different declaration ways

        String name1 = new String("Lucifer");
        String name2 = "IronMan";

        String name3;
        name3 = "*****HAPPY ENDING*****";

        System.out.println("Comapany's Name is: ");
        System.out.println(name3);

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
//      String name4 = sc.next();
        String name4 = sc.nextLine();  //This will take us to next line
        System.out.printf("Congratulations %s!", name4);

    }
}
