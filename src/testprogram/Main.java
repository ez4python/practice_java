package testprogram;

public class Main {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        // Main myObject = new Main();
        // myStaticMethod();
        // myObject.myPublicMethod();

        String firstName = "Akbarali";
        String lastName = "Salohiddinov";
        System.out.printf("%s %s", firstName, lastName);



    }
}
