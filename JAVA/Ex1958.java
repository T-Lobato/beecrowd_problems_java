import java.util.Scanner;

public class Ex1958 { // Alterar o nome da classe Main para funcionar no beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);
        Double entrada = sc.nextDouble();
        sc.close();

        System.out.printf("%+.4E\n", entrada);
    }
}