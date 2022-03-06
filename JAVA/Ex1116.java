import java.util.Scanner;

public class Ex1116 { // Alterar o nome da classe para Main para funcionar no beecrowd.
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int n = sc.nextInt();

        // Processamento
        for(int i = 0; i < n; i++) {
            Float x = sc.nextFloat();
            Float y = sc.nextFloat();
            
            if(y == 0.0) System.out.printf("divisao impossivel\n");
            else System.out.printf("%.1f\n", x / y);
        }
        sc.close();
    }
}