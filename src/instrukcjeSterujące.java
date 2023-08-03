public class instrukcjeSterujące {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18){
            System.out.println("Mozesz miec prawko");
        } else if (age >= 16 && age < 18) {
            System.out.println("Mozesz kategorie AB");
        } else {
            System.out.println("Nie mozesz miec prawka");
        }
    }
}
