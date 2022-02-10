import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1072 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws Exception {
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis e Entrada
        int entrada1 = Integer.parseInt(br.readLine());
        int aux1 = 0;
        int aux2 = 0;

        // Processamento    
        for(int i = 1; i <= entrada1; i++ ){
            int novaEntrada = Integer.parseInt(br.readLine());

            if(novaEntrada > 9 && novaEntrada < 21){
                aux1++;
            }
            else {
                aux2++;
            }
        }     
        br.close();
        // Saida
        System.out.printf("%d in\n", aux1);
        System.out.printf("%d out\n", aux2);   
    }
}