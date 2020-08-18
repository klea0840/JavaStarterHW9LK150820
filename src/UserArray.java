import java.util.Arrays;
import java.util.Scanner;

public class UserArray {

    public static int[] addtoarr(int[] array) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static int[] addtohead(int[] array, int value) {
        int[] result = new int[array.length + 1];
        result[0] = value;
        for (int i = 0; i < array.length; i++) {
            result[i + 1] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter value: ");
        int value = sc.nextInt();

        System.out.println(Arrays.toString(addtoarr(array)));
        System.out.println(Arrays.toString(addtohead(array, value)));

    }
}
