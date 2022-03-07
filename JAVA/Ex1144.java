import java.util.Scanner;

public class Ex1144 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int n = sc.nextInt();
        sc.close();
        int v1 = 0, v2, v3;

        // Processamento & Saída        
        for(int i = 0; i < n; i++){
            v1++;
            v2 = (int) Math.pow(v1, 2);
            v3 = (int) Math.pow(v1, 3);

            for(int j = 0; j < 2; j++){
                System.out.printf("%d %d %d\n", v1, v2, v3);
                v2++;
                v3++;
            }
        }  
    }    
}