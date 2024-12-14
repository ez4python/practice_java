package lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // 1-Monday ... 7-Sunday

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 7: ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("1 - Monday");
                break;
            case 2:
                System.out.println("2 - Tuesday");
                break;
            case 3:
                System.out.println("3 - Wednesday");
                break;
            case 4:
                System.out.println("4 - Thursday");
                break;
            case 5:
                System.out.println("5 - Friday");
                break;
            case 6:
                System.out.println("6 - Saturday");
                break;
            case 7:
                System.out.println("7 - Sunday");
                break;
            default:
                System.out.println("Error! I said from 1 to 7!");
                break;
        }
        scanner.close();
    }
}
