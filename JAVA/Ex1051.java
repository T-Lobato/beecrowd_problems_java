import java.util.Scanner;

public class Ex1051 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variavel e entrada
        double salario = sc.nextFloat();
        double calculo = 0.00;
        sc.close();
        
        //Processamento
        if (salario <= 2000.00) {
            System.out.println("Isento");
        }
        else {            
            if (salario <= 3000.00){
                calculo = (salario - 2000.00) * 0.08;
            }
            else if (salario <= 4500.00){
                calculo = 1000 * 0.08;
                calculo += (salario - 3000.00) * 0.18;
            }
            else {
                calculo = 1000.00 * 0.08;
                calculo += 1500.00 * 0.18;
                calculo += (salario - 4500.00) * 0.28;
            }    
            //Saida
            System.out.printf("R$ %.2f\n", calculo);
        }
    }
}


