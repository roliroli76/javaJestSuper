import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Wprowadz ocene");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Wprowadzona ocena to:" + input);

        switch(input){
            case 1 -> System.out.println("Z gery pała");
            case 2 -> System.out.println("Mozna powiedziec, ze srednio");
            case 3 -> System.out.println("Super duper");
            case 4,5 -> System.out.println("U siebie rob jak u siebie");
            case 6 -> System.out.println("Lalallaa");
        }
    }
}
