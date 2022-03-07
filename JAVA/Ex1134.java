import java.util.Scanner;

public class Ex1134 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        // Processamento
        while(true) {
            int tipoCombustivel = sc.nextInt();
            
            if(tipoCombustivel == 1) alcool++;
            else if(tipoCombustivel == 2) gasolina++;
            else if(tipoCombustivel == 3) diesel++;
            else if(tipoCombustivel == 4) break;
        }
        sc.close();
        // Saída
        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel); 
    }
}