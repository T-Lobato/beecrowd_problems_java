import java.util.Scanner;

public class Ex1037 {//Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objeto
        Scanner sc = new Scanner(System.in);

        //variaveis e entrada
        double valorEntrada = sc.nextDouble();
        
        //processamento e saida
        if (valorEntrada >= 0 && valorEntrada <= 25.0 ){
            System.out.println("Intervalo [0,25]");
        } 
        else if (valorEntrada > 25.0 && valorEntrada <= 50.0){
            System.out.println("Intervalo (25,50]");
        }
        else if (valorEntrada > 50.0 && valorEntrada <= 75.0 ){
            System.out.println("Intervalo (50,75]");
        }
        else if (valorEntrada > 75.0 && valorEntrada <= 100.0 ){
            System.out.println("Intervalo (75,100]");
        }        
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
