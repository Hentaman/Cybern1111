import java.util.Scanner;

/**
 * Created by Capusta on 23.07.2016.
 */
public class Massive {
  public static void main(String args[]) {
        /*  int []a;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){

            a[i] = in.nextInt();
            System.out.println(a[i]);
        }*/

       /* int[] a = new int[]{1,3,4,5,6,7};
        for(int i = 0; i < a.length; i++)
        {
            a[i] = a[i] * 2;
            System.out.print(a[i] + " ");


        }
      a[2] = 123;
      System.out.println();
      System.out.print(a[2] + " ");
      int sox = a[2];*/
      int[][] mas = new int[3][3];
      mas[0][0] = 1;

      for(int i = 0; i < mas.length; i++)
      {
          mas[i] = new int[3];
          System.out.print(mas[i] + " ");
      }



    }
}
