import java.util.Scanner;

public class Ex1871 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        while ((num1 = sc.nextInt()) != 0 && (num2 = sc.nextInt()) != 0) {
            String soma = String.valueOf(num1 + num2);
            String resultado = soma.replaceAll("0", "");
            System.out.println(resultado);
        }
        sc.close();
    }
}
