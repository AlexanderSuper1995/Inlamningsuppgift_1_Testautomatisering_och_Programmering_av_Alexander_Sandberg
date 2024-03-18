
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        logikklass x = new logikklass();
        System.out.println("Välj bland dessa val");
        System.out.println("-------------------------");
        System.out.println("1 skiva engelska - ");
        System.out.println("-------------------------");
        System.out.println("2 skiva moucode - ");
        System.out.println("-------------------------");
        System.out.println("3 - Quit");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println( "Skiv en bokstv i taget ");
                String Input = Sc.nextLine();
                System.out.println(x.gettext(Input.toUpperCase()));
                break;
            case "2":
                System.out.println( "Skiv en kode  i taget ");
                String Input2 = Sc.nextLine();
                System.out.println("2 - test");
                System.out.println(x.gettext(Input2.toUpperCase()));
                break;
            case "3":
                System.exit(0);
                break;

            default:
                System.out.println("du bara skiva 1 till 3 inte " + choice);
                break;
        }
        } }







