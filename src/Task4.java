public class Task4 {

//    Task 4 – Calculate the sum
//    Create a program that prints the sum of all the values in this int array:
//    int[] numbers = {5, 99, -1, 45, -201, -77, 175};

    public static void main(String[] args) {

        int[] numbers = {5, 99, -1, 45, -201, -77, 175};

        System.out.println(getSumOfArr(numbers));

    }
    public static int getSumOfArr(int[] x){
        int sum = 0;

//        for (int i = 0; i < x.length; i++) {
//            sum += x[i];
//        }

        for (int lel : x){
            sum+=lel;
        }

        return sum;
    }
}
