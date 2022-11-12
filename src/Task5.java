public class Task5 {

//    Task 5 – Calculate the average
//    Create a program that prints the average of all the values in this int array:
//    int[] numbers = {5, 99, -1, 45, -201, -77, 175};

    public static void main(String[] args) {

        int[] numbers = {5, 99, -1, 45, -201, -77, 175};

        System.out.println(getAverageOfArr(numbers));

    }
    public static double getAverageOfArr(int[] x){

        int sum = getSumOfArr(x);
        double average = (double)sum / x.length;

        return average;

    }
    public static int getSumOfArr(int[] x){
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}
