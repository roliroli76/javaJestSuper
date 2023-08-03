public class Zmienne {
    public static void main(String[] args) {
        System.out.println("Zmienne");
        int numberI = 12;
        double numberD = 12.1;
        boolean variable = true;
        char variable1 = 'k'; // dla charów tylko ''
        String variable2 = "kaktus"; // dla stringów tylko ""

        System.out.println(numberI);
        System.out.println(numberD);
        System.out.println(variable);
        System.out.println(variable1);
        System.out.println(variable2);


        Zmienne zmienne = new Zmienne(); // instancja

        var numberV = 17;
        System.out.println(numberV);

    }
}
