import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1153 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variável & Entrada
        int n = Integer.parseInt(br.readLine());
        br.close();
        int soma = 0;

        // Processamento
        for(int i = n - 1 ; i >= 1; i--) {
            soma = n * i;
            n = soma;
        }
        // Saída
        System.out.printf("%d\n", soma);
    }
}