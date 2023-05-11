public class Practice5 {
    public static void main(String[] args) {

        //Problem 01
        /*
        float [] marks = {98.0f, 89.5f, 92.0f, 86.0f, 82.5f};
        float sum = 0;
        for (float element:marks) {
            sum += element;
        }
        System.out.println("The value of sum is " + sum);
        */

        //Problem 02
        /*
        float [] marks = {98.0f, 89.5f, 92.0f, 86.0f, 82.5f};
        float num = 92.5f;
        boolean isInArray = false;
        for (float element:marks) {
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Given value is present in the array!");
        }
        else{
            System.out.println("Given value is not present in the array!");
        }
        */

        //Problem 03
        /*
        float [] marks = {98.0f, 89.5f, 92.0f, 86.0f, 82.5f};
        float average = 0;
        float sum = 0;
        for (float element:marks) {
            sum += element;
            average = sum/marks.length;
        }
        System.out.println("The average is: " + average);
        */

        //Problem 04 - Matrix Addition
        
        int [][] a = {{1, 2, 3}, {4, 5, 6}};
        int [][] b = {{2, 6, 13}, {7, 14, 21}};
        int [][] c = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < a.length; i++){ //row number of times{
            for (int j = 0; j < a[i].length; j++){  //column number of times{
                System.out.format("setting value for i = %d and j = %d\n", i, j);
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(c[i][j] + "\t");
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println("\t");
        }
        

        //Problem 05
        /*
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++){
            temp = arr [i];
            arr [i] = arr[l - 1 - i];
            arr [l - i - 1] = temp;
        }
        for (int element: arr) {
            System.out.print(element + " ");
        }
        */

        //Problem 05
        /*
        int [] arr = {21, 33, 59, 121, 97, 119, 102};
        int max = Integer.MIN_VALUE;
        for (int e: arr) {
            if (e > max){
                 max = e;
        }
        }
        System.out.println("The max value is: " + max);
        */

        //Problem 07
        /*
        boolean isSorted = true;
//        int [] arr = {21, 33, 59, 121, 97, 119, 102};
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
            if (isSorted){
                System.out.println("Given array is sorted");
            }
            else{
                System.out.println("Given array is not sorted");
            }
            
         */




    }
}
