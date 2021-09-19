import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("a = true, b = false, c = true");

        System.out.println("a && b : " + (a && b));
        System.out.println("a && c : " + (a && c));
        System.out.println("a && b && c : " + (a && b && c));

        System.out.println("a || b : " + (a || b));
        System.out.println("a || c : " + (a || c));
        System.out.println("b || c : " + (b || c));
        System.out.println("b || b : " + (b || b));

        System.out.println("!a : " + (!a));
        System.out.println("!b : " + (!b));

        System.out.println("(!a && b) : " + (!a && b));
        System.out.println("(!b && c) : " + (!b && c));
        System.out.println("((!b && c) || !(a || c)) : " + ((!b && c) || !(a || c)));



    }
}
