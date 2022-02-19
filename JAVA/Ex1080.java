import java.util.Scanner;

public class Ex1080{ // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis & Entrada
        int aux1 = 0;
        int aux2 = 0;

        //Processamento 
        for(int i = 0; i < 100; i++) {
            int n = sc.nextInt();

            if(n > aux1){
                aux1 = n;
                aux2 = i + 1;
            }
        }  
        sc.close();
        //Saída
        System.out.println(aux1);
        System.out.println(aux2); 
    }
}