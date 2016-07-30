package nextLevel.ru.syb;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Created by Capusta on 29.07.2016.
 */
public class Cal {
    public static void main(String args[]){
        Cal c = new Cal();
        c.cal();



    }
    public void cal()
    {
        Calendar c = new GregorianCalendar();//календарь на текущую дату
        Calendar c2 = new GregorianCalendar(2013, 11, 25);//календарь на 25.11.2013
        c2.add(Calendar.DAY_OF_YEAR, 1); //увеличиваем дату на 1 день
        System.out.println(c2.getTime());// 26.11.2013
        System.out.println(c.getTime());
        c2.add(Calendar.DAY_OF_YEAR, -1); //уменьшаем дату на 1 день
        System.out.println(c2.getTime());
        System.out.println();



        Calendar cc = new GregorianCalendar(2017, 11, 25);
        System.out.println(cc.get(Calendar.MONTH));//11
        System.out.println(cc.get(Calendar.YEAR));//2017
        System.out.println(cc.get(Calendar.DAY_OF_WEEK_IN_MONTH));//4
        System.out.println(cc.get(Calendar.DAY_OF_WEEK));//4
        System.out.println(cc.get(Calendar.DAY_OF_YEAR));//359
        System.out.println(cc.get(Calendar.DAY_OF_MONTH));//25

    }
}
