import java.util.Scanner;

public class Ex1060 {// alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);
        
        //Variaveis e Entrada
        double numero;
        int contador = 0;

        //Processamento e Saida
        for(int i = 0; i < 6; i++){
            numero = sc.nextDouble();

           if(numero > 0){
               contador++;                
           }
        }
        sc.close();
        System.out.println(contador + " valores positivos");
    }
}


