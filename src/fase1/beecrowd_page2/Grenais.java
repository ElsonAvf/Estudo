package fase1.beecrowd_page2;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        while (true) {
            String[] gols = sc.nextLine().split("\\s");
            int golsInter = Integer.valueOf(gols[0]);
            int golsGremio = Integer.valueOf(gols[1]);
            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsInter < golsGremio) {
                vitoriasGremio++;
            } else {
                empates++;
            }
            grenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            int escolha = Integer.valueOf(sc.nextLine());
            if (escolha == 2) {
                break;
            }
        }
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        
        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasInter < vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        
    }
}
