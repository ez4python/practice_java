package lesson4;

public class Practice {
    public static void main(String[] args) {
        String str1 = "The car is ready for use";
        String str2 = "The car is broken";

        boolean doesWorkEngine = true;
        boolean doesWorkTransmission = true;
        boolean isWheelFine1 = true;
        boolean isWheelFine2 = true;
        boolean isWheelFine3 = true;
        boolean isWheelFine4 = true;

        int countFineWheels = 0;
        countFineWheels += isWheelFine1 ? 1 : 0;
        countFineWheels += isWheelFine2 ? 1 : 0;
        countFineWheels += isWheelFine3 ? 1 : 0;
        countFineWheels += isWheelFine4 ? 1 : 0;

        if (doesWorkEngine && doesWorkTransmission && (countFineWheels >= 3)) {
            System.out.println(str1);
        } else {
            System.out.println(str2);
        }
    }
}
