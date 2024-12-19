package OOP;

public class Constructors {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(3, 6, 9);

        double vol;

        // get volume of first box
        vol = box1.volume();
        System.out.println("Volume = " + vol);

        // get volume of second box
        vol = box2.volume();
        System.out.println("Volume = " + vol);

    }
}
