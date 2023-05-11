public class BreakInLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great!");
            if (i == 2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("\nLoop ends here!!!");

//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ends here");


    }
}
