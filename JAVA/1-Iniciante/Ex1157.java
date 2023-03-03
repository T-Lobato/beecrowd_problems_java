import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1157 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException {
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variáveis & Entrada
        int n = Integer.parseInt(br.readLine());

        // Processamento & Saída
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.printf("%d\n", i);

    }
}