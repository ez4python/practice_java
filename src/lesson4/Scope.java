package lesson4;

public class Scope {
    public static void main(String[] args) {

        double carPrice = 10_000;

        if (carPrice > 9_000) {
            carPrice *= 0.95;
        }

        System.out.println(carPrice);
    }
}
