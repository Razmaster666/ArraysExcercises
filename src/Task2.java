public class Task2 {

//    Task 2 – Find the lowest value
//    Create a program that prints the lowest value in this int array:
//    int[] numbers = {5, 99, -1, 45, -201, -77, 175};

    public static void main(String[] args) {

        int[] numbers = {5, 99, -1, 45, -201, -77, 175};

        System.out.println(getLowestValue(numbers));

    }
    public static int getLowestValue(int [] x){

        int lowestValue = x[0];

        for (int i = 0; i < x.length; i++) {

            if(x[i] < lowestValue){
                lowestValue = x[i];
            }
        }
        return lowestValue;

    }
}
