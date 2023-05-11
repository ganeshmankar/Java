public class ternary_op {
    public static void main(String[] args) {
        int n = 10;
        int result= 0;
        // if(n%2==0){
        //     result= 100;
        // }
        // else{
        //     result=200;
        // }
        // System.out.println(n);

        result= n%2==0? 10:20;
        System.out.println(result);
    }
}

