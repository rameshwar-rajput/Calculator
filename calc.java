import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int f, marks = 0, bill, first, sec;
        double result;
        int g = 0, p = 0, k;
        int i, o;
        List<String> h = new ArrayList<>();
        while (true) {

            System.out.println("Calc (Math Operations) Cube 1, Absolute Value 2, Power 3");
            System.out.println("(Java Math Class) , Decimal to Binary 4, Binary to Decimal 5, Octal 7, Hexa 6");
            i = scanner.nextInt();
            o = i;
            if (i == 1) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;
                result = k * k * first;
                System.out.println(first + " cube =" + result);
            } else if (o == 2) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;
                result = Math.abs(first);
                System.out.println(first + " abs = " + result);

            } else if (o == 3) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;
                System.out.println("Enter second number");
                k = scanner.nextInt();
                sec = k;
                result = Math.pow(first, sec);
                System.out.println(first + " power = " + result);
            } else if (o == 4) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;
                result = toBinary(first);
                System.out.println(first + " Decimal to Binary = " + result);
            } else if (o == 5) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;
                System.out.println(first + " Binary to Decimal = " + getDecimal((first)));
            } else if (o == 6) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;

                System.out.println(first + " hexa = " + toHex(first));
            } else if (o == 7) {
                System.out.println("Enter first number");
                k = scanner.nextInt();
                first = k;
                result = convertDecimalToOctal(first);
                System.out.println(first + " octal = " + result);
            }
            System.out.println("exit for 1");
            k = scanner.nextInt();
            if (k == 1) {
                break;
            } else {

            }
        }

    }

    public static double toBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();// new line
        return index;
    }

    public static int getDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    public static int convertDecimalToOctal(int decimal) {
        int octalNumber = 0, i = 1;

        while (decimal != 0) {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }

    public static String toHex(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (decimal > 0) {
            rem = decimal % 16;
            hex = hexchars[rem] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }
}
