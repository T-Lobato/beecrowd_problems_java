import java.util.Scanner;

public class Ex1036 {// Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        // objeto
        Scanner sc = new Scanner(System.in);

        // variaveis e entrada
        String[] valores = sc.nextLine().split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        // variaveis e processamento
        double delta = (Math.pow(b, 2)) - (4 * a * c);
        double raiz1 = (-b + (Math.sqrt(delta))) / (2 * a);
        double raiz2 = (-b - (Math.sqrt(delta))) / (2 * a);

        if (delta < 0 || a == 0) {

            System.out.println("Impossivel calcular");

        } else {

            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);

        }

        sc.close();
    }

}
