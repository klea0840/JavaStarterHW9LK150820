package arrays;

import java.util.Scanner;

public class CustomerArray {

    private static int defineMin (int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The minimum value: " + min);
        return min;
    }
    private static int defineMax (int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The maximum value: " + max);
        return max;
    }

    private static double defineSum (int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum " + sum);
        return sum;
    }

    private static void defineAv (int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty");
        }    else {
            double av = 0;
            double sum = defineSum(array);
            av = sum / array.length;
            System.out.println("Average value " + av);
        }
    }

    private static void defineUneven (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Enter 3 numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        defineMax(array);
        defineMin(array);
        defineSum(array);
        defineAv(array);
        defineUneven(array);
    }
    }


