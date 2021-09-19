import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        float zmiennaFloat = 1.1f;
        System.out.println("Float = " + zmiennaFloat);
        short zmiennaShort = 12000;
        System.out.println("Short " + zmiennaShort);
        byte zmiennaByte = 43;
        System.out.println("Byte " + zmiennaByte );
        long zmiennaLong = 12321412L;
        System.out.println("Long " + zmiennaLong);
        double zmiennaDouble = 534833.421;
        System.out.println("Double " + zmiennaDouble);
        boolean zmiennaBool = false;
        System.out.println(zmiennaBool);
        char zmiennaChar = 't';
        System.out.println("Char " + zmiennaChar);

        String string1 = "Hello ";
        String string2 = "World!";
        System.out.println(string1 + string2);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int A = 12;
        int B = 87;

        double X = 89123.7832;
        double Y = 4112.23;

        /* a) */
        System.out.println(A - B);
        System.out.println(A + B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        /* b) */
        System.out.println(X + Y);
        System.out.println(X - Y);
        System.out.println(X * Y);
        System.out.println(X / Y);
        System.out.println(X % Y);

    }
}
