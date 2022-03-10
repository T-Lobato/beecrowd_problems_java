import java.util.Scanner;

public class Ex1154 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entradas
        float soma = 0; 
        float cont = 0;

        // Processamento
        while(true) {
            int x = sc.nextInt();
            if(x < 0) break;

            soma += x;
            cont++;
        }
        sc.close();
        // Saída
        System.out.printf("%.2f\n", soma / cont);
    }
}