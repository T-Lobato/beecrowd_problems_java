import java.util.Scanner;

public class Ex1007 { //Alterar o nome da classe para Main para funcionar no beecrowd

    public static void main(String[] args) {
        
        //variaveis
        int a, b, c, d, diferenca;

        Scanner sc = new Scanner(System.in);

        //entrada
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        //processamento
        diferenca = (a * b - c * d);

        //saida
        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }
    
}
