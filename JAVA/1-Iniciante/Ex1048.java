import java.util.Scanner;

public class Ex1048 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variaveis e entrada
        double salario = sc.nextDouble();
        sc.close();
        double reajuste;
        String perCent;

        //Processamento
        if (salario >= 0 && salario <= 400.00){
            reajuste = salario * 0.15;
            salario += reajuste;
            perCent = "15 %";
        }

        else if (salario > 400.00 && salario <= 800.00){
            reajuste = salario * 0.12;
            salario += reajuste;
            perCent = "12 %";
        }

        else if (salario > 800.00 && salario <= 1200.00){
            reajuste = salario * 0.10;
            salario += reajuste;
            perCent = "10 %";
        }

        else if (salario > 1200.00 && salario <= 2000.00){
            reajuste = salario * 0.07;
            salario += reajuste;
            perCent = "7 %";
        }

        else{
            reajuste = salario * 0.04;
            salario += reajuste;
            perCent = "4 %";
        }

        //saida
         System.out.printf("Novo salario: %.2f\n", salario);
         System.out.printf("Reajuste ganho: %.2f\n", reajuste);
         System.out.println("Em percentual: " + perCent); 
        }
    }
     

