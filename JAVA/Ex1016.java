import java.util.Scanner;

public class Ex1016 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //objeto e variavel
        Scanner sc = new Scanner(System.in);
        int kmPorMinuto = 2;

        //variaveis e entrada
        int quilometros = sc.nextInt();

        //variaveis e processamento
        int tempoNecessario = quilometros * kmPorMinuto;
        
        //saida
        System.out.println(tempoNecessario + " minutos");
        sc.close();    
    }
}
