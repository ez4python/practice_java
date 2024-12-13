package task;

import com.sun.jdi.connect.Connector;

import java.security.interfaces.ECKey;
import java.util.*;
import java.lang.Math.*;
import java.util.stream.IntStream;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ex-1
        /* System.out.print("Enter number[1:99]: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 99) {
            String result = numberToString(number);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Numbers must be in range[1:99]!!!");
        } */

        // ex-2
        /* int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println("Result: " + sum); */

        // ex-3
        /* for (int i = 10; i < 100; i++) {
            int part1 = i % 10;
            int part2 = (i - part1) / 10;

            if (Math.abs(part1 - part2) == 1) {
                System.out.println(i);
            }
        } */

        // ex-4
        /* for (int i = 200; i < 800; i++) {
            if (isAllDigitsOdd(i)) {
                System.out.println(i);
            }
        } */

        // ex-5
        /* for (int i = 10; i < 99; i++) {
            int n1 = i % 10;
            int n10 = i / 10;
            if (n1 + n10 == 5) {
                System.out.println(i);
            }
        } */

        // ex-6
        /* for (int i = 100; i < 900; i++) {
            if (i % 3 == 0 && i % 6 != 0) {
                System.out.println(i);
            }
        } */

        // ex-7
        /* System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits++;
            number /= 10;
        }
        System.out.println("Number of digits: "); */

        // ex-8
        /* System.out.print("Enter number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i * i);
        } */

        // ex-9
        /* int result = sumOfRange();
        System.out.println("Result: " + result); */

        // ex-10
        /* for (int i = 100; i < 1000; i++) {
            if (ex10(i)) {
                System.out.println(i);
            }
        } */

        // ex-11
        /* System.out.print("Enter number: ");
        int number = scanner.nextInt();
        double result = ex11(number);
        System.out.println(result); */

        // ex-12
        // ex12();

        // ex-13
        // ex13();

        // ex-14
        /* System.out.print("Enter 'n': ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(Math.cbrt(i));
        } */

        // ex-15
        /* for (int i = 100; i < 1000; i++) {
            if (ex15(i)) {
                System.out.println(i);
            }
        } */

        // ex-16
        /* for (int i = 10; i < 100; i++) {
            if (ex16(i)) {
                System.out.println(i);
            }
        } */

        // ex-17
        /* for (int i = 100; i < 1000; i++) {
            if (ex17(i)) {
                System.out.println(i);
            }
        } */

        // ex-18
        /* System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter degree: ");
        int degree = scanner.nextInt();
        System.out.println("Result: " + daraja(number, degree)); */

        // ex-19
        /* System.out.print("Enter number: ");
        int number = scanner.nextInt();
        ex19(number); */

        // ex-20
        /* System.out.print("Enter number: ");
        int number = scanner.nextInt();
        String tab = "";
        for (int i = 0; i < number; i++) {
            System.out.print(tab);
            System.out.println(1);
            tab += "  ";
        } */

        // ex-21
        /* System.out.print("Enter first leg: ");
        float kat1 = scanner.nextInt();
        System.out.print("Enter second leg: ");
        float kat2 = scanner.nextInt();
        ex21(kat1, kat2); */

        // ex-22
        /* for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        } */

        // ex-23
        /* System.out.print("Enter N = ");
        int number = scanner.nextInt();
        ex23(number); */

        // ex-24
        /* System.out.print("Enter N = ");
        int number = scanner.nextInt();
        boolean result = ex24(number);
        System.out.println("Result: " + result); */

        // ex-25
        /* System.out.print("Enter N = ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (ex25(i)) {
                System.out.println(i);
            }
        } */

        // ex-26
        /* System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        ex26(a, b); */

        // ex-27
        /* System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        int result = ekub(a, b);
        System.out.println("Result: " + result); */

        // ex-28
        /* System.out.print("Enter n = ");
        int num = scanner.nextInt();
        ex28(num); */

        // ex-29
        /* System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter n = ");
        int n = scanner.nextInt();
        int result = ex29(a, n);
        System.out.println("Result: " + result); */

        // ex-30
        /* System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        int result = ekuk(a, b);
        System.out.println("EKUK: " + result); */

        // ex-31
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        ex31(n); */

        // ex-32
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        ex32(n); */

        // ex-33
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        ex33(n); */

        // ex-34
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        boolean result = ex34(n);
        System.out.println("Result: " + result); */

        // ex-35
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        float result = ex35(n);
        System.out.println("Result: S = " + result); */

        // ex-36
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        float result = ex36(n);
        System.out.printf("Result: %.2f%n", result); */

        // ex-37
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        ex37(n); */

        // ex-38
        /* System.out.print("Enter array elements: ");
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int id = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[id]) {
                id = i;
            }
        }
        System.out.println("ID of max number of array: " + id); */

        // ex-39
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        Random random = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(30) + 1;
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        } */

        // ex-40
        /*int[] array = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                count++;
            }
        }
        System.out.println("\nResult: " + count); */

        // ex-41
        /* System.out.print("Enter array_length: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int sum = 0;
        int multiple = 1;
        System.out.print("Array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10) + 1;
            System.out.print(array1[i] + " ");
            if (array1[i] % 2 == 0) {
                sum += array1[i];
            } else {
                multiple *= array1[i];
            }
        }
        System.out.println("Result: " + (multiple - sum)); */

        // ex-42
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Array before: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.print("\nArray after: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 2;
            }
            System.out.print(array[i] + " ");
        } */

        // ex-43
        /* int[] array = {-11, 1, 34, -4, 4, -3};
        int count = 0;
        for (int element : array) {
            if (element % 2 != 0 && element < 0) {
                count++;
            }
        }
        System.out.println("Result: " + count); */

        // ex-44
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        int count_1 = 0, count_2 = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count_2++;
            } else {
                count_1++;
            }
        }
        System.out.println("Result: toq=" + count_1 + ", juft=" + count_2); */

        // ex-45
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        System.out.print("Enter k = ");
        int k = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
            if (i == k - 1 || i == k + 1) {
                sum += array[i];
            }
        }
        System.out.println("Result: " + sum); */

        // ex-46
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        System.out.print("Enter k1 = ");
        int k1 = scanner.nextInt();
        System.out.print("Enter k2 = ");
        int k2 = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        int multiple = 1;
        for (int i = k1; i <= k2; i++) {
            multiple *= array[i];
        }
        System.out.println("\nResult: Multiple[" + k1 + ", " + k2 + "] = " + multiple); */

        // ex-47
        /* System.out.print("Enter n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (array[0] > array[i]) {
                sum += array[i];
            }
        }
        System.out.println("\nResult: " + sum); */

        // ex-48
        /* System.out.print("Enter array elements: ");
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Array: " + Arrays.toString(array));

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : array) {
            hashSet.add(num);
        }
        int size = hashSet.size();
        System.out.println("HashSet size: " + size);
        System.out.print("Result: ");
        System.out.println(size == 2); */

        // ex-49
        /* System.out.print("Enter array1 elements: ");
        int[] array1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.print("Enter array2 elements: ");
        int[] array2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (array1.length == array2.length) {
            System.out.print("Result(new array): ");
            int[] result = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] - array2[i];
                System.out.print(result[i] + " ");
            }
        } */

        // ex-50
        System.out.print("Enter n = ");
        int n = scanner.nextInt();
        int start1 = 0, end1 = 2;
        if (n <= 5) {
            System.out.print("Array must be longer than 5 elements!");
            return;
        }
        System.out.print("Enter array elements: ");
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void ex37(int n) {
        for (int i = 0; i < n; i++) {
            int tmp = n;
            for (int j = 0; j < n - i; j++) {
                System.out.print(tmp + " ");
                tmp++;
            }
            System.out.println();
        }
    }

    public static float ex36(int number) {
        float sum = 0.0F;

        for (int i = 1; i <= number; i++) {
            float tmp = 1.0F + (float) i / 10;
            if (i % 2 == 0) {
                sum -= tmp;
            } else {
                sum += tmp;
            }
        }
        return sum;
    }

    public static float ex35(int number) {
        float multiple = 1.1F;
        for (float i = 1.2F; i < number; i += 0.1F) {
            multiple *= i;
        }
        return multiple;
    }

    public static boolean ex34(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void ex33(int number) {
        int tmp = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < tmp; j++) {
                System.out.print(tmp + " ");
            }
            tmp++;
            System.out.println();
        }
    }

    public static void ex32(int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    public static void ex31(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i >= j) {
                    System.out.print(number + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int ekuk(int a, int b) {
        return (a * b) / ekub(a, b);
    }

    public static int ex29(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * ex29(a, n - 1);
    }

    public static void ex28(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int ekub(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void ex26(int a, int b) {
        if (b > 1) {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        }
    }

    public static boolean ex25(int num) {
        if (num < 2) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean ex24(int number) {
        int i = 1, count = 0;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        return count < 2;
    }

    public static void ex23(int number) {
        if (number >= 3 && number % 2 != 0) {
            String[][] array = new String[number][number];
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == number / 2 || j == number / 2) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void ex21(float kat1, float kat2) {
        float c = (float) Math.sqrt(kat1 * kat1 + kat2 * kat2);
        float perimeter = kat1 + kat2 + c;
        System.out.println("Gipotenuza: " + c);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void ex19(int number) {
        int copy = number;
        for (int i = number; i > 1; i--) {
            System.out.println(number);
            number = number * 10 + ++copy;
        }
    }

    public static int daraja(int number, int degree) {
        int tmpCopy = number;
        while (degree > 1) {
            number *= tmpCopy;
            degree--;
        }
        return number;
    }

    public static boolean ex17(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum == 5;
    }

    public static boolean ex16(int number) {
        int sum = (number % 10) + (number / 10);
        return sum == 9 || sum == 15;
    }

    public static boolean ex15(int number) {
        int n1 = number % 10;
        int n10 = (number / 10) % 10;
        int n100 = number / 100;
        return n1 == n10 || n10 == n100 || n1 == n100;
    }

    public static void ex13() {
        for (int i = 10; i <= 40; i++) {
            System.out.println(i + "$ => " + i * 11300);
        }
    }

    public static void ex12() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i);
            System.out.println("  " + (i + 1));
        }
    }

    public static double ex11(int number) {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += (double) 1 / i;
        }
        return sum;
    }

    public static boolean ex10(int number) {
        int n10 = (number / 10) % 10;
        return n10 == 7 || n10 == 9;
    }

    public static int sumOfRange() {
        int sum = 0;
        for (int i = 100; i < 900; i++) {
            if (i % 3 == 0 && i % 6 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isAllDigitsOdd(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static String numberToString(int number) {
        int birlar = number % 10;
        int unlar = (number % 100 - birlar) / 10;

        String part1, part2;

        // birlar
        part1 = switch (birlar) {
            case 1 -> "bir";
            case 2 -> "ikki";
            case 3 -> "uch";
            case 4 -> "to'rt";
            case 5 -> "besh";
            case 6 -> "olti";
            case 7 -> "yetti";
            case 8 -> "sakkiz";
            case 9 -> "to'qqiz";
            default -> "";
        };

        part2 = switch (unlar) {
            case 1 -> "o'n";
            case 2 -> "yigirma";
            case 3 -> "o'ttiz";
            case 4 -> "qirq";
            case 5 -> "ellik";
            case 6 -> "oltmish";
            case 7 -> "yetmish";
            case 8 -> "sakson";
            case 9 -> "to'qson";
            default -> "";
        };

        return part2 + " " + part1;
    }
}
