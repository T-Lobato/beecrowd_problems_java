import java.util.Scanner;

public class Ex1159 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis
        int acum = 0;

        // Processamento
        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;

            if (x % 2 != 0) x++;

            for (int i = x, cont = 0; cont < 5; i += 2, cont++) acum += i;
                
            System.out.printf("%d\n", acum);
            acum = 0;
        }
        sc.close();
    }
}