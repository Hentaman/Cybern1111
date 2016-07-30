package nextLevel.ru.syb;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Capusta on 27.07.2016.
 */
public class Test {

    public void test()
    {
        Map<String, Student> map = new Hashtable<String, Student>();
        Student st = new Student("Alex",0, 18);
        map.put("Alex", st);//добавляю студента Alex по ключу Alex
        System.out.println(map.get("Alex"));//работает
        System.out.println(map.get("Al" + "ex"));  //работает
        System.out.println(map.get(st.getName()));//работает
        String s = "a";//пытаюсь обмануть компилятор
        s = s.toUpperCase()+"lex";
        System.out.println(map.get(s)); //работает
    }
    public static void main(String args[]){
        Test test = new Test();
        test.test();


    }


}
