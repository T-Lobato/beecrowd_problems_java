import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1133 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis & Entrada
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x < y) {
        int aux = x;
        x = y;
        y = aux; }

        // Processamento
        for (int i = y + 1; i < x; i++) {
            if( i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}