// Draw a square with side length 20.

public class L01P01 {
    public static void main(String[] args){
        Turtle pen = new Turtle();

        for (int i = 0; i < 4; i++) {
            pen.forward(20);
            pen.right(90); 
        }
    }
}
