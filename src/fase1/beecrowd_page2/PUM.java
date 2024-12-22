package fase1.beecrowd_page2;
import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnt = Integer.valueOf(sc.nextLine());
        int pum = 0;
        for (int i = 0; i < qnt; i++) {
            for (int j = 0; j < 3; j++) {
                pum++;
                System.out.print(pum + " ");
            }
            System.out.print("PUM");
            System.out.println();
            pum++;
        }
    }
}