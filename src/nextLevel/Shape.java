package nextLevel;

/**
 * Created by Capusta on 25.07.2016.
 */
public class Shape {
    protected void draw() {
        //ничего не делаем, не знаему какая фигура

    }
    public static void main(String args[]){
        Shape[] a = new Shape[]{new Shape(), new Triangle(), new Square(), new Circle()};
        for(int i = 0; i < a.length; i++){
            a[i].draw();
        }
    }
}
