/**
 * Created by Capusta on 23.07.2016.
 */
import java.util.Scanner;
//чот не правильно
public class Function {
    public static int[] readArray() {
        int[] a;//массив целых чисел
        int n;//количество элементов в массиве
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = readArray();
        printArray(array);
    }
}
