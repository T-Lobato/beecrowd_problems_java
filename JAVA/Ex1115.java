import java.util.Scanner;

public class Ex1115 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Processamento
        while(true) {
            int x = sc.nextInt();
            int y = sc. nextInt();

            if(x == 0 || y == 0) break;
            else if(x > 0 && y > 0) System.out.println("primeiro");
            else if(x < 0 && y > 0) System.out.println("segundo");
            else if(x < 0 && y < 0) System.out.println("terceiro");
            else if(x > 0 && y < 0) System.out.println("quarto");
        } 
        sc.close(); 
    }
}