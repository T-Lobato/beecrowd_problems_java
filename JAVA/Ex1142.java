import java.util.Scanner;

public class Ex1142 { // Alterar o nome da classe para main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int aux = 0;
        int cont = 1;
        int entrada = sc.nextInt();

        // Processamento & Saída
        while (aux < entrada) {
                System.out.printf("%d %d %d PUM\n", cont, cont+1, cont+2);
                cont += 4;
                aux++;
            }
            sc.close();
        }
    }