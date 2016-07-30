import java.util.Scanner;

/**
 * Created by Capusta on 21.07.2016.
 */
public class Switch {
    public static void main(String args[]){
        int jan = 30;
        int apr = 30;
        int june = 30;
        int sent = 30;
        int nov = 30;

        int els = 31;

        String s1 = "Хотите узнать сколько дней в месяце? Введите месяц: ";
        System.out.println(s1);
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        switch (month) {
            case "январь":
                System.out.println(jan);
                break;
            case "март":
                System.out.println(els);
                break;
            case "апрель":
                System.out.println(apr);
                break;
            case "май":
                System.out.println(els);
                break;
            case "июнь":
                System.out.println(june);
                break;
            case "июль":
                System.out.println(els);
                break;
            case "август":
                System.out.println(els);
                break;
            case "сентябрь":
                System.out.println(sent);
                break;
            case "октябрь":
                System.out.println(els);
                break;
            case "ноябрь":
                System.out.println(nov);
                break;
            case "декабрь":
                System.out.println(els);
                break;
            case "февраль":
                System.out.println("Ну, батюшка, тогда введи какой год... Там в февралях дни по разному бывают!");
                Scanner in2 = new Scanner(System.in);
                int february = in2.nextInt();
                if (february % 4 == 0) {
                    if ((february % 100 != 0) || (february % 400 == 0)){
                    System.out.println(29);
                }}
                else System.out.println(28);
                break;
            default: System.out.println("Вы ввели не правильно месяц. Используйте русскую раскладку и с маленькой буквы");



        }






    }
}
