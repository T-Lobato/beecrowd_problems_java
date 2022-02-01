import java.util.Scanner;

public class Ex1065 {// alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);
        
        //Variaveis e Entrada
        int numero;
        int contador = 0;

        //Processamento 
        for(int i = 0; i < 5; i++){
            numero = sc.nextInt();

           if(numero % 2 == 0){
               contador++;                
           }
        }
        sc.close();
        //Saida
        System.out.println(contador + " valores pares");
    }
}