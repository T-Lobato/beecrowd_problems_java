import java.util.Scanner;

public class Ex1149 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        
        //Variáveis & Entrada
        int a = sc.nextInt();
        int n = sc.nextInt();
        int soma = 0;

        // Processamento
        while(n <= 0) {
            n = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < n ; i++) {
            soma += (a + i);
        }
        // Saída
        System.out.println(soma);   
    }
}