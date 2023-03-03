import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1143 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variáveis & Entrada
        int entrada = Integer.parseInt(br.readLine());

        // Processamento & Saída
        for(int i = 1; i <= entrada; i++) {
            int x = (int) Math.pow(i, 2);
            int y = (int) Math.pow(i, 3);

            System.out.printf("%d %d %d\n", i, x, y);
        }
    }
}