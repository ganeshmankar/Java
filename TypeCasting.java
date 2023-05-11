public class TypeCasting {

    public static void main(String[] args) {
            char grade = 'B';
            grade = (char)(grade + 8);   //to get value in char else it will give the value in int
            System.out.println(grade);

            // Decrypting the grade
            grade = (char)(grade - 8);
            System.out.println(grade);
        }
}
