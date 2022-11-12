public class Task3 {

//    Task 3 – Find the highest value
//    Create a program that prints the highest value in this int array:
//    int[] numbers = {5, 99, -1, 45, -201, -77, 175};

    public static void main(String[] args) {

        int[] numbers = {5, 99, -1, 45, -201, -77, 175};

        System.out.println(getHighestValue(numbers));

    }
    public static int getHighestValue(int[] x){
        int highestValue = x[0];

        for (int i = 0; i < x.length; i++) {

            if (x[i] > highestValue){
                highestValue = x[i];
            }

        }
        return highestValue;
    }
}
