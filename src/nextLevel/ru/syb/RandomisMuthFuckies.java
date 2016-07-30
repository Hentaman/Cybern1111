package nextLevel.ru.syb;

import java.util.Random;

/**
 * Created by Capusta on 29.07.2016.
 */
public class RandomisMuthFuckies {

        public static void main(String args[]){
            //для генерации кроме байта надо явно инициализировать каждое
            Random r = new Random();
            Double[] arr = new Double[10];
            for(int i = 0; i < arr.length; i++){
                arr[i] = r.nextDouble();
                System.out.println(arr[i]);
            }

        }
}
