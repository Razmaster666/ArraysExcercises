import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

//    Task 1 - Add numbers
//    Create a program that asks the user to enter a few numbers and then, after the user enters all the
//    numbers, the program prints the sum of all the numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers?: ");
        int arrLength = Integer.valueOf(scanner.nextLine());
        int [] myArr = new int[arrLength];

        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Enter #" + (i + 1) + ": ");
            myArr[i] = Integer.valueOf(scanner.nextLine());
        }

        System.out.println(Arrays.toString(myArr));
        System.out.println("Sum: " + getSum(myArr));

    }

    public static int getSum(int[] x){
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}
