import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {

        //objeto
        Scanner sc = new Scanner(System.in);
        String [] valores = sc.nextLine().split(" ");
        sc.close();

        //variaveis e entrada
        double x = Double.parseDouble(valores[0]);
        double y = Double.parseDouble(valores[1]);

        //variaveis, processamento e saida

        if (x > 0 && y > 0){
            System.out.println("Q1");

        } else if ( x > 0 && y < 0){
            System.out.println("Q4");

        } else if (x < 0 && y < 0){
            System.out.println("Q3");

        } else if (x < 0 && y > 0){
            System.out.println("Q2");

        } else if (x == 0 && y == 0){
            System.out.println("Origem");

        } else if (x == 0 && y != 0){
            System.out.println("Eixo Y");

        } else if (x != 0 && y ==0){
            System.out.println("Eixo X");
        }
    }   
}
    
