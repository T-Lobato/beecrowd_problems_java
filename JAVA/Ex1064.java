import java.util.Scanner;

public class Ex1064 {// Alterar o nome da classe para Main para funcionar no Beecrowd 
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        
        //Variaveis e Entrada
        float acumulador = 0;
        float numero;
        int contador = 0;
        
        // Processamento 
        for(int i = 0; i < 6; i++){
            numero = sc.nextFloat();

           if(numero > 0){
               contador++;       
               acumulador += numero;
            }
         }
         sc.close();
         // Saida
         System.out.println(contador + " valores positivos");
         System.out.printf("%.1f\n", acumulador / contador);
        }
    }