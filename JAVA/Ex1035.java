import java.util.Scanner;

public class Ex1035 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        // Objetos
        Scanner sc = new Scanner(System.in);

        // variaveis e entradas
        String[] valores = sc.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);
        int d = Integer.parseInt(valores[3]);

        // processamento e saida
        if ((b > c) && (d > a) && ((c + d) > (a + b)) && ((c > -1) && (d > -1)) && ((a % 2 == 0))) {

            System.out.println("Valores aceitos");

        } else {

            System.out.println("Valores não aceitos");
        }
        sc.close();
    }
}
