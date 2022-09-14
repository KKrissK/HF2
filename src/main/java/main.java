import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Name?:");
        String name = kb.nextLine();
        System.out.println("Language? hun/cz/port:");
        String lang = kb.nextLine();

        Translate.forditas(name,lang);

    }
}
