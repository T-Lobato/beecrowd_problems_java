import java.util.Scanner;

public class Ex1101 { // ALterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
                
        // Processamento & Saída
        while(true){
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= 0 || y <= 0) break;

            if(x < y){
                int aux = x;
                x = y;
                y = aux;
            }

            for(int i = y; i <= x; i++){
                 System.out.print(i + " ");
                 soma += i;

            }
            System.out.printf("Sum=%d", soma);
            System.out.println();
        }
        sc.close();
    }
}