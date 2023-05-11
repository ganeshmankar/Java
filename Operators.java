
public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 4;
 //       int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int b = 9;
        b *= 3;    //b = b * 3
        System.out.println(b);

        // 3. Comparison Operators
         System.out.println(64>6);

        // 4. Logical Operators
         System.out.println(64>5 && 64>98);   //both should be true for true
        System.out.println(64>5 || 64>98);    //only one should be true to get true

        // 5. Bitwise Operators
        System.out.println(2&3);  //in binary
        //        10
        //        11
        //        ----
        //        10

        /* Booleans: (Just to understand boolean function)
        int age = 19;
        boolean cond = (age == 19);

        if(cond){
        sout("You can drive")}
        else{}
         */

    }
}
