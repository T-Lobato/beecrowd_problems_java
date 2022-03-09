import java.util.Scanner;

public class Ex1150 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int x = sc.nextInt();
        int z = sc.nextInt();
        int soma = 0;
        int aux = 0;

        // Processamento
        while(z <= x) z = sc.nextInt();
        sc.close();

        for(int i = 0; i <= z; i++) {
            soma += x + i;
            aux++;
            if(soma > z) break;
        }
        // Saída
        System.out.printf("%d\n", aux);
    }
}
