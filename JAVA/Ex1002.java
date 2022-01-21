import java.util.Scanner;

public class Ex1002{ // // Alterar o nome da classe para Main para funcionar no beecrowd.


public static void main(String args[]) {
        //variaveis
        double r, a, n = 3.14159;
        
        Scanner sc = new Scanner(System.in);
        //entrada
        r = sc.nextDouble();
        //processamento
        a = n * Math.pow(r, 2);
        //saida
        System.out.printf("A=%.4f\n", a);
        sc.close();    
  
    }
}