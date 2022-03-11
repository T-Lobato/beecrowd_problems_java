import java.util.Scanner;

public class Ex1158 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & entrada
        int n = sc.nextInt();
        int acum = 0;
        int cont = 0;

        // Processamento & Saída
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (true) {

                while (cont < y * 2) {
                    if (Math.abs(x % 2) != 0) {
                        acum += x;
                    }
                    x++;
                    cont++;
                }
                System.out.printf("%d\n", acum);
                cont = 0;
                acum = 0;
                break;

            }
        }
        sc.close();
    }
}