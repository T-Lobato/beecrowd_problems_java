import java.util.Scanner;

public class Ex1004 { //Alterar o nome da classe para Main para funcionar no beecrowd

    public static void main(String[] args) {

        //variaveis
        int a, b, prod;

        Scanner sc = new Scanner(System.in);

        //entrada
        a = sc.nextInt();
        b = sc.nextInt();

        //processamento
        prod = a * b;

        //saida
        System.out.println("PROD = " + prod);
        sc.close();
    }
}
