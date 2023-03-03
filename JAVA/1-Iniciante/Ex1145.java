import java.util.Scanner;

public class Ex1145 { // ALterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int valor = 1;
        int cont = 1;

        // Processamento & Saída
        while(valor <= y) {
            if(cont < x) {
                System.out.printf("%d ", valor);
                cont++;
            }
            else {
                System.out.printf("%d\n", valor);
                cont = 1;
            }
            valor++;
        }
    }
}