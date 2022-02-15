import java.util.Scanner;

public class Ex1075 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variaveis e Entrada
        int n = sc.nextInt();
        sc.close();

        // Processamento e Saída
        for(int i = 1; i < 10001; i++) if(i % n == 2) System.out.println(i);  
    }
}