public class operatory {
    public static void main(String[] args) {
        double a = 4;
        double b = 3;
        double c = a / b; // wynik to 1.3333, ale jesli beda inty to wyjdzie 1 utnie 0.33333

        int d = 5;
        int e = 3;
        int f = d % e;  //%(modulo) - reszta z dzielenia

        boolean test1 = true;
        boolean test2 = false;

        String word1 = "Adam ";
        String word2 = "Dupa";
        String word3 = word1 + word2;

        d += 3; // d++ doda po prostu 1 tak samo z minusem cos jak w c++
        e += 7;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f); // wynik dla pierwotnych wartosci d i e patrz kolejnosc wierszy
        System.out.println(word3);
        System.out.println("a > b :" + (a > b)); // nawiasy są konieczne, operatory raczej podobne jak w pythonie
        System.out.println(word1.equals(word2)); // sprawdza czy stringi są takie same
        System.out.println(test1 && test2);
        System.out.println(test1 || test2);
        System.out.println(!test1); // negacja true =====> false
    }
}
