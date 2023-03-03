import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1173 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws Exception{
        // Objeto
        int[] vetor = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Variaveis e Entrada
        int entrada = Integer.parseInt(br.readLine());
        br.close();
        vetor[0] = entrada;
        System.out.printf("N[%d] = %d\n", 0, entrada);

        // Processamento e Saida
        for(int i = 1; i < vetor.length; i++) {
            entrada *= 2;
            vetor[i] = entrada;
            System.out.printf("N[%d] = %d\n", i, vetor[i]);    
        }
    }
}