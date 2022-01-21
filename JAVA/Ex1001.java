import java.util.Scanner;

public class Ex1001 { // Alterar o nome da classe para Main ara funcionar no beecrowd.

    public static void main(String[] args) {
        // variaveis
        int a,b;

        int resultado;

        Scanner sc = new Scanner(System.in);

        //entrada
        a = sc.nextInt();
        b = sc.nextInt();
        
        //processamento
        resultado = a + b;

        //saida
        System.out.println("X = " + resultado);
        sc.close();
    }
}
