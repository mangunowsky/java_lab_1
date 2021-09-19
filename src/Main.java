import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj numer indexu: ");
        int nrIndexu = scan.nextInt();

        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Numer indexu: " + nrIndexu);

        System.out.printf("Imię: %s, Nazwisko: %s, Wiek: %d, Numer indexu: %d", imie, nazwisko, wiek, nrIndexu);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int X = 12;
        int Y = 24;

        System.out.println(X + Y);
        System.out.println(X - Y);
        System.out.println(X * Y);
        System.out.println(X / Y);
        System.out.println(X % Y);


    }
}
