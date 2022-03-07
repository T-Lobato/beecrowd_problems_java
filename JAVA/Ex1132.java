import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1132 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException {
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis & Entrada
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int soma = 0;
        
        if(x < y) {
        int aux = x;
        x = y;
        y = aux; }

        // Processamento
        for (int i = y; i <= x; i++) {
            if (i % 13 != 0) soma += i;
        }
        // Saída
        System.out.println(soma);
    }
}