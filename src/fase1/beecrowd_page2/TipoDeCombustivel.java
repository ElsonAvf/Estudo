package fase1.beecrowd_page2;
import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean breakLoop = false;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (!breakLoop) {
            int escolha = Integer.valueOf(sc.nextLine());
            switch (escolha) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    breakLoop = true;
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}