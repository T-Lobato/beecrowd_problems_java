import java.util.Scanner;

public class Ex1099 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entradas
        int entrada = sc.nextInt();
        sc.nextLine();
    
        // Processamento & Saída
        for(int i = 0; i < entrada; i++) {
            int resultado = 0;
            String[] valores = sc.nextLine().split(" ");
            int x = Integer.parseInt(valores[0]);
            int y = Integer.parseInt(valores[1]);
            if(x < y){
                int aux1 = x;
                x = y;
                y = aux1;
            }
            for(int j = y + 1; j < x; j++){
                if(j % 2 == 1) resultado += j;
                }
            System.out.printf("%d\n",resultado);
        }     
        sc.close();
    }
}