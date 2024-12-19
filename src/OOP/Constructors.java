package OOP;

public class Constructors {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        double vol;

        // get first box object
        vol = box1.volume();
        System.out.println("Volume = " + vol);

        // get second box object
        vol = box2.volume();
        System.out.println("Volume = " + vol);

    }
}
