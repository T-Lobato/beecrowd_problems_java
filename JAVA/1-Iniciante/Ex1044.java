import java.util.Scanner;

public class Ex1044 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        sc.close();

        //Variaveis e entrada
        int num1 = Integer.parseInt(valores[0]);
        int num2 = Integer.parseInt(valores[1]);

        //processamento e Saida
        if ( num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}


