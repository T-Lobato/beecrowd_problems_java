import java.util.Scanner;

public class Ex1079 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        //Variaveis e Entrada
        int quantLinhas = sc.nextInt();
        double a, b, c;
        int aux = 0;

        //Processamento e Saída
        while(aux < quantLinhas){
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            Double result = ((a * 2) + (b * 3) + (c * 5)) / 10;
            
            System.out.printf("%.1f\n", result);
            aux++;
        }
        sc.close();
    }
}