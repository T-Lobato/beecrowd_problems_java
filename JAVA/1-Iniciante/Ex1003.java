import java.util.Scanner;

public class Ex1003 { // Alterar o nome da classe para Main para funcionar no beecrowd.
    
    public static void main(String[] args) {
        
        //variaveis
        int a,b,resultado;

        Scanner sc = new Scanner(System.in);

        //entrada
        a = sc.nextInt();
        b = sc.nextInt();

        //processamento
        resultado = a + b;

        //saida
        System.out.println("SOMA = " + resultado);
        sc.close();
    }
}