import java.util.Arrays;

public class Task6 {

//    Task 6 – Reverse array
//    Create a program that reverses the original int array in this example.
//    Try to structure the code that calculate the average in a separate method!
//
//    Example:
//    Original array:
//    1 2 3 4 5 6 7 8 9
//    Reversed array:
//    9 8 7 6 5 4 3 2 1

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        System.out.println(reversedArray(numbers));

    }

    public static String reversedArray(int [] x){
        int [] reverseArr = new int [x.length];
        int helper = 0;
        for (int i = x.length - 1; i >= 0; i--){
            reverseArr[helper] = x[i];
            helper++;
        }
        String reversedArray = Arrays.toString(reverseArr);
        return reversedArray;
    }

//    public static int [] reversedArray(int [] x){
//        int [] reverseArr = new int [x.length];
//        int helper = 0;
//        for (int i = x.length - 1; i >= 0; i--){
//            reverseArr[helper] = x[i];
//            helper++;
//        }
//        return reverseArr;
//    }
}
