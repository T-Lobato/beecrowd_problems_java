import java.util.Scanner;

public class Ex1003 {
    
    public static void main(String[] args) {

        int a,b,resultado;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        resultado = a + b;

        System.out.println("SOMA = " + resultado);
        
        sc.close();
    }
}