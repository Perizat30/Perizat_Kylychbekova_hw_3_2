import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // double [] decimal = {1.2, 5.7, 2.7,-4.5,-3.13,3.8,-13.12,4.1,-41.83,15.4,1.2,-51.1,9.12,-31.5,5.8};
        double[] decimal = {8.0, -2.0, 4.0, 2.0, 6.0}; //just for check
        double temp;

        for (int i = 0; i < decimal.length; i++) {
            for (int j = i + 1; j < decimal.length; j++) {
                if (decimal[i] > decimal[j]) {
                    temp = decimal[i];
                    decimal[i] = decimal[j];
                    decimal[j] = temp;
                }
                System.out.println(Arrays.toString(decimal));
            }
        }
        System.out.println("The sorted array : " + Arrays.toString(decimal));
    }
}