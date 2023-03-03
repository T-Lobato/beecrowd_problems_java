import java.util.Scanner;

public class Ex1114 { // ALterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Processamento & Saída
        while(true) {
            int senha = sc.nextInt();
            if (senha == 2002){ 
            System.out.println("Acesso Permitido"); 
            break; }
            else System.out.println("Senha Invalida");      
        }
        sc.close();
    }
}