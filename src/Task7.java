public class Task7 {

//    Task 7 – Find number
//
//    Create a method findNumber that takes an array of integers and an integer number as input. The
//    method should return true if the number is found in the array and false if the number is not found
//    in the array.
//
//    The user should be able to enter a number and the program should print the result, if the number
//    was found or not.
//
//    Use this int array:
//    int[] numbers = {5, 99, -1, 45, -201, -77, 175};

    public static void main(String[] args) {

        int[] numbers = {5, 99, -1, 45, -201, -77, 175};

        System.out.println(hasNumberInArr(numbers, 99));
        System.out.println(hasNumberInArr(numbers, 1));

    }

    public static boolean hasNumberInArr(int [] x, int y){
        boolean hasNumber = false;
        for (int i = 0; i < x.length; i++){
            if (x[i] == y){
                hasNumber = true;
            }
        }
        return hasNumber;
    }

}
