import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1073{ // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws Exception {
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis e Entrada
        int valorEntrada = Integer.parseInt(br.readLine());
        int aux = 0;
        br.close();

        // Processamento e saida
        int contador = 2;
        for(int i = 0; i < valorEntrada; i++){
            
            if (contador % 2 == 0){
                aux = contador * contador;
                System.out.printf("%d^2 = %d\n", contador, aux);
            }
            contador++;    
        }
    }
}