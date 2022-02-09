import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1071 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException{
        // variaveis & objetos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        // Processamento
        if(x > y){
            int aux = x;
            x = y;
            y = aux;
        }

        int soma = 0;
        for(int i = x + 1; i < y; i++){
            if (Math.abs(i % 2) == 1) soma += i;
            
        }
        //Saida
        System.out.printf("%d\n", soma);
    }
}