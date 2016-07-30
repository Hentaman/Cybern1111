/**
 * Created by Capusta on 21.07.2016.
 */
public class ProstClass {
    public static void main(String args[]){
            /*String s = "Меня бесит эта среда разработки!";
        char b = 'е';
        char k1 = 'а';
        char k2 = 'N';
        int a = s.lastIndexOf(b);
        int a2 = s.length();
        s = s.replace(k1, k2);

            System.out.println(a);
            System.out.println(a2);
            System.out.println(s);
        String s2 = "гавно dfhgdебуче";
        String s3 = "гавное fбуче";
        s2 = s2.toUpperCase();
        System.out.println(s2);
        int i = s2.compareTo(s3);
        System.out.println(i);
*/

        /*StringBuilder s = new StringBuilder("a");
        for(int i = 0; i < 10;i++)   {
            s.append('a');
            System.out.println(s);
        }*/
        StringBuilder s2 = new StringBuilder("abcd");
        s2.append('e');
        System.out.println(s2);
        s2.delete(1,2);
        System.out.println(s2);
        s2.insert(1,'b');
        System.out.println(s2);
        s2.deleteCharAt(2);
        System.out.println(s2);
        String ans = s2.toString();
        System.out.println(ans);




    }
}
