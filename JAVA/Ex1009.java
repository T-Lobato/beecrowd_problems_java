import java.util.Scanner;

public class Ex1009 { //Alterar o nome da classe para Main para funcionar no beecrowd

    public static void main(String[] args) {
        
        //variaveis
        //String nome; 
        double salarioFixo, vendas, totalGeral, taxa = 0.15;

        Scanner sc = new Scanner(System.in);

        //entrada    
        //nome = sc.next();
        salarioFixo = sc.nextDouble();
        vendas = sc.nextDouble();

        //processamento
        totalGeral = vendas * taxa + salarioFixo;

        //saida
        System.out.printf("TOTAL = R$ %.2f\n", totalGeral);
        sc.close();      
    }  
}
