import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1094 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException {
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Variaveis & Entrada
        int entrada = Integer.parseInt(br.readLine());
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        int totalCobaias = 0;

        //Processo
        for(int i = 0; i < entrada; i++) {
            String[] valores = br.readLine().split(" ");
            int quant = Integer.parseInt(valores[0]);
            String tipo = valores[1];
            totalCobaias += quant;

            if(tipo.equals("C")) {
                totalCoelhos += quant;
            }
            else if(tipo.equals("R")){
                totalRatos += quant;
            }
            else if(tipo.equals("S")){
                totalSapos += quant;
            }
        }

        // Saídas
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        double totalCoelhos1 = totalCoelhos;
        double totalRatos1 = totalRatos;
        double totalSapos1 = totalSapos;
        double totalCobaias1 = totalCobaias;

        System.out.printf("Percentual de coelhos: %.2f %%\n", (totalCoelhos1 * 100) / totalCobaias1);
        System.out.printf("Percentual de ratos: %.2f %%\n", (totalRatos1 * 100) / totalCobaias1);
        System.out.printf("Percentual de sapos: %.2f %%\n", (totalSapos1 * 100) / totalCobaias1);
    }
}