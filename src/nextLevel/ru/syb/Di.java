package nextLevel.ru.syb;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * Created by Capusta on 29.07.2016.
 */
public class Di {
    public static void main(String args[]){
        Di d = new Di();
        d.di();



    }
    public void di(){
        Date d = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("dd.mm.yyyy hh:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
        System.out.println(s1.format(d));
        System.out.println(s2.format(d));

    }

}
