package fase1.beecrowd_page2;
import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnt = Integer.valueOf(sc.nextLine());
        int coluna1 = 1;
        int coluna2 = 1;
        int coluna3 = 1;
        int contadorColuna1 = 1;
        int contadorMultiplosDe2 = 2;
        int contadorColuna3 = 2;
        for (int i = 0; i < (qnt * 2); i++) {
            System.out.println(coluna1 + " " + coluna2 + " " + coluna3);
            if (contadorColuna1 == 2) {
                coluna1++;
                coluna2 += contadorMultiplosDe2;
                coluna3 = coluna2 * contadorColuna3;
                contadorColuna3++;
                contadorMultiplosDe2 += 2;
                contadorColuna1 = 1;
            } else {
                contadorColuna1++;
                coluna2++;
                coluna3++;
            }
        }
    }
}