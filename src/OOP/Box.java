package OOP;

class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
