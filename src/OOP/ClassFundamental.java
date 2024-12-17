package OOP;

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class ClassFundamental {
    public static void main(String[] args) {

        Box box = new Box();
        box.setDim(10, 20, 15);

        double vol = box.volume();
        System.out.println("Volume: " + vol);
    }
}
