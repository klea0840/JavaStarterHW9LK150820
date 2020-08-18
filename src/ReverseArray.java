import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static int[] myReverse (int[] array) {
        int[] arrayRev = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            arrayRev[i] = array[(array.length - 1) - i];
        }
        return arrayRev;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] arraynew = new int[count];

        for (int i = index; i < index + count; i++) {
            if (i < array.length) {
                arraynew[i - index] = array[i];
            } else {
                arraynew[i - index] = 1;
            }
        }
        return arraynew;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int index = 0, count = 0;
        System.out.print("\nEnter the index ");
        index = sc.nextInt();
        System.out.print("\nEnter the count ");
        count = sc.nextInt();



        System.out.println(Arrays.toString(myReverse(array)));
        System.out.println(Arrays.toString(subArray(array, index, count)));
    }
}
