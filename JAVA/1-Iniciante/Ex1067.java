import java.util.Scanner;

public class Ex1067 { // Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        //Variaveis e Entrada
        int numeroEnt = sc.nextInt();
        sc.close();

        //Processamento e Saida
        for(int i = 1; i <= numeroEnt; i+=2) System.out.println(i);
    }
}