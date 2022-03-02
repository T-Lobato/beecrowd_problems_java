import java.io.IOException;
import java.util.Scanner;

public class Ex1190 { // Alterar o nome da classe para Main para funcionar no beecrowd

    public static void main(String[] args) throws IOException {
        // Objeto
        Scanner sc = new Scanner(System.in);
        // Variavel
        double soma = 0;
        char o = sc.next().toUpperCase().charAt(0);

        // Processamento 
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
        	for (int j = 0; j < 12; j++) {
        		M[i][j] = sc.nextDouble();
        		if (i < j && j >= 12 - i) soma += M[i][j];
        	}
        }
        sc.close();
        
        // Saída
        if ( o == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
}