public class Array2 {
    public static void main(String[] args) {
//        String [] students = {"Ganesh", "Satish", "Rohit", "Ajinkya", "Dhiraj", "Saurabh"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

//        float [] marks = {98.1f, 86.7f, 92.3f, 89.6f, 96.0f};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);

        int [] marks = {98, 86, 92, 89, 96};

        System.out.println(marks.length);
        System.out.println(marks[2]);

        //Displaying the array (for loop)
        System.out.println("Printing given array using for loop:");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //Displaying the array in reverse
        System.out.println("Printing given array in reverse order using for loop: ");
        for(int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        //Displaying the array (for-each loop)
        System.out.println("Printing given array using for-each loop:");
        for(int element: marks){
            System.out.println(element);
        }





    }
}
