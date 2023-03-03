import java.util.Scanner;

public class Ex1160 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int t = sc.nextInt();
        int crescA = 0;
        int crescB = 0;
        int pA = 0;
        int pB = 0;
        int totalAnos = 0;

        // Processamento & Saída
        for (int i = 0; i < t; i++) {
            pA = sc.nextInt();
            pB = sc.nextInt();
            double g1 = sc.nextDouble();
            double g2 = sc.nextDouble();

            while (pA <= pB) {
                crescA = (int) (pA * (g1 / 100));
                crescB = (int) (pB * (g2 / 100));

                pA += crescA;
                pB += crescB;
                totalAnos++;
                
                if (totalAnos > 100)  break;
            }

            if (totalAnos <= 100) System.out.printf("%d anos.\n", totalAnos);
            
            else System.out.printf("Mais de 1 seculo.\n");
            
            pA = 0;
            pB = 0;
            crescA = 0;
            crescB = 0;
            totalAnos = 0;
        }
        sc.close();
    }
}