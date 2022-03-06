import java.util.Scanner;

public class Ex1117 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis 
        float cont = 0f;
        int aux = 0;

        // Processamento & Saída
        while(aux < 2) {
            float nota = sc.nextFloat();

            if(nota >= 0.0 && nota <= 10.0) {
                cont += nota;
                aux++;
            }
            else System.out.printf("nota invalida\n");
        }
        System.out.printf("media = %.2f\n", cont / 2);
        sc.close();
    }
}