import java.util.Scanner;

public class Ex1050 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variaveis e Entradas 
        int codDDD = sc.nextInt();
        sc.close();

        //processamento e saida
        if(codDDD == 61){
            System.out.println("Brasilia");
        }
        else if (codDDD == 71){
            System.out.println("Salvador");
        }
        else if (codDDD == 11){
            System.out.println("Sao Paulo");
        }
        else if (codDDD == 21){
            System.out.println("Rio de Janeiro");
        }
        else if (codDDD == 32){
            System.out.println("Juiz de Fora");
        }
        else if (codDDD == 19){
            System.out.println("Campinas");
        }
        else if (codDDD == 27){
            System.out.println("Vitoria");
        }
        else if (codDDD == 31){
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
