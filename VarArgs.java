public class VarArgs {

    static int sum (int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    static int add (int x, int ...arr){
        int result = x;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum());  //If we add extra 'int x' in method, so we have to give at least one argument/parameter
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }
}
