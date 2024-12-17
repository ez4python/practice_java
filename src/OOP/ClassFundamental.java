package OOP;

public class ClassFundamental {
    public static void main(String[] args) {

        Box box = new Box();
        box.setDim(10, 20, 15);

        double vol = box.volume();
        System.out.println("Volume: " + vol);
    }
}
