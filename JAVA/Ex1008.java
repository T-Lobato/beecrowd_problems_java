import java.util.Scanner;

public class Ex1008 { //Alterar o nome da classe para Main para funcionar no beecrowd
    
    public static void main(String[] args) {
        
        //variaveis
        int numeroFuncionario, numeroHoras;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);

        //entrada
        numeroFuncionario = sc.nextInt();
        numeroHoras = sc.nextInt();
        valorHora = sc.nextDouble();

        //processamento
        salario = numeroHoras * valorHora;

        //saida
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
        sc.close();
    }
}
