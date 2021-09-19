import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji

        System.out.println("Hello world");
        System.out.println("\t Hello world");
        System.out.print("To jest zwykły print \n");
        System.out.printf("Tekst sformatowany: %s, Int: %d, Float: %f! \n", "Hello", 1, 1.1);
        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("Godzina: %tH, Minuta: %tM, Sekundy: %tS", date, date, date);


    }
}
