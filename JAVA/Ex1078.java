import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1078 { //  Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws Exception {
        //  Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  Variavel e Entrada
        int numero = Integer.parseInt(br.readLine());
        br.close();

        //  Processamento e Saída
        for(int i = 1; i < 11; i++) System.out.printf("%d x %d = %d\n", i, numero, i * numero);
    }
}