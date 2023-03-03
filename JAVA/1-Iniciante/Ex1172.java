import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1172 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args)throws Exception{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] vetor = new int[10];

        // Processamento e saída
        for(int i = 0; i < vetor.length; i++) {
            int entrada = Integer.parseInt(br.readLine());
            if(entrada <= 0){
                vetor[i] = 1;
            }
            else{
            vetor[i] = entrada;
            }
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
        br.close();
    }
}