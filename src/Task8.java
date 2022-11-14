import java.util.Arrays;

public class Task8 {

//    Task 8 - Add numbers from two arrays
//
//    Create a method addNumbers that takes two int arrays as input. The method should then add the
//    numbers in the arrays that are in the same index position and return a new array with the result.
//
//    Example:
//    int[] arrayA = {1, 2, 4, 3, 8};
//    int[] arrayB = {1, 2, 4, 3, 8, 8, 3};
//    int[] combinedResult = addNumbers(arrayA, arrayB);
//
//    The result should be:
//
//    Array A:
//    [1, 2, 4, 3, 8]
//    Array B:
//    [1, 2, 4, 3, 8, 8, 3]
//    Combined array:
//    [2, 4, 8, 6, 16, 8, 3]

    public static void main(String[] args) {

        int [] arrayA = {1, 2, 4, 3, 8};
        int [] arrayB = {1, 2, 4, 3, 8, 8, 3};
        int[] combinedResult = addNumbers(arrayA, arrayB);

        System.out.println("Array A:");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("Array B:");
        System.out.println(Arrays.toString(arrayB));
        System.out.println("Combined array:");
        System.out.println(Arrays.toString(combinedResult));

    }

    private static int [] addNumbers(int[] arrayA, int[] arrayB){
        int[] addedArr;

        if(arrayA.length > arrayB.length){

            int[]tempArrayB = new int[arrayA.length];
            addedArr = new int[arrayA.length];

            for (int i = 0; i < arrayB.length; i++){
                tempArrayB[i] = arrayB[i];
            }

            for (int i = 0; i < addedArr.length; i++) {
                addedArr[i] = tempArrayB[i] + arrayA[i];
            }

            return addedArr;

        }

        else {
            int[]tempArrayA = new int[arrayB.length];

            addedArr = new int[arrayB.length];

            for (int i = 0; i < arrayA.length; i++){
                tempArrayA[i] = arrayA[i];
            }

            for (int i = 0; i < addedArr.length; i++) {
                addedArr[i] = tempArrayA[i] + arrayB[i];
            }

            return addedArr;

        }
    }

}
