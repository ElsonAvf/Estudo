package fase1.beecrowd_page2;
import java.util.Scanner;

public class UltrapassandoZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = Integer.valueOf(sc.nextLine());
        int total = 1;
        for (int i = 1; i <= fat; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}