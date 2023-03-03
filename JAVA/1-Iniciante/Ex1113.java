import java.util.Scanner;

public class Ex1113 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Processamento & Saída
        while(true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == y) break;

            if(x > y) System.out.println("Decrescente");
            else System.out.println("Crescente");
        }
        sc.close();
    }
}
