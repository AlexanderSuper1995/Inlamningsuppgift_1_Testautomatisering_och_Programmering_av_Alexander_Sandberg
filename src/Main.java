
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        logikklass x = new logikklass();
        System.out.println("Välj bland dessa val");
        System.out.println("-------------------------");
        System.out.println("1 skiva engelska - ");
        System.out.println("-------------------------");
        System.out.println("2 skiva International Morse Code - ");
        System.out.println("-------------------------");
        System.out.println("3 - Quit");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println( "Skriv en bokstav i taget ");
                String Input = Sc.nextLine();
                System.out.println(x.gettext(Input));
                break;
            case "2":
                System.out.println( "Skriv en kode i taget ");
                Input = Sc.nextLine();
                System.out.println(x.gettext(Input));
                break;
            case "3":
                System.exit(0);
                break;

            default:
                System.out.println("du bara skiva 1 till 3 inte " + choice);
                break;
        }
        } }







