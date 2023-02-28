import java.util.Scanner;

public class Ex1241 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String a, b;

        for (int i = 0; i < n; i++) {
            a = sc.next();
            b = sc.next();
            if (b.length() > a.length())
                System.out.println("nao encaixa");
            else {
                if (a.substring(a.length() - b.length()).contains(b)) {
                    System.out.println("encaixa");
                } else
                    System.out.println("nao encaixa");
            }
        }
        sc.close();

    }

}
