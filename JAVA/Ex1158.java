import java.util.Scanner;

public class Ex1158 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & entrada
        int n = sc.nextInt();
        int acum = 0;

        // Processamento & Saída
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x % 2 == 0) x++;

            for (int j = x, cont = 0; cont < y; cont++, j += 2) acum += j;
            
            System.out.printf("%d\n", acum);
            acum = 0;
        }
        sc.close();
    }
}