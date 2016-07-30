/**
 * Created by Capusta on 25.07.2016.
 */
public class Cons3 extends Constructor {
    int group = 777;
    public Cons3(int age, String firstName, String secondName, int group) {
        super(age, firstName, secondName);
        this.group = group;

    }

    public static void main(String args[]){

        Cons3 cons3 = new Cons3(19, "Aleksey", "Gavrichenko", 777);
        System.out.println(cons3.group + " " + cons3.secondName + " " + cons3.firstName + " " + cons3.age);



    }

}
