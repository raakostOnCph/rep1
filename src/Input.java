import java.util.Scanner;

public class Input {
    public static String getinput(String s) {

        System.out.println(s);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }

    public static int getInt(String s ) {

        while (true) {
            try {
                return Integer.parseInt(getinput(s)) * 2;
            } catch (NumberFormatException e) {
                System.out.println("tast da et tal klovn");


            }
        }

    }
}
