import java.util.Scanner;

public class Ex1117 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis 
        float media = 0f;
        int cont = 0;

        // Processamento & Saída
        while(cont < 2) {
            float nota = sc.nextFloat();

            if(nota >= 0.0 && nota <= 10.0) {
                media += nota;
                cont++;
            }
            else System.out.printf("nota invalida\n");
        }
        System.out.printf("media = %.2f\n", media / 2);
        sc.close();
    }
}