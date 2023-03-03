import java.util.Scanner;
import java.util.Arrays;

public class Ex1042{//Alterar o nome da classe para Mainha para passar no Beecrowd
    public static void main(String[] args) {
        //Objeto e variaveis
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        int[] numeros = new int[3];
        sc.close();
           
        //Processamento 
        for (int i = 0; i < 3; i++){
            numeros[i] = Integer.parseInt(valores[i]);
        }
                              
        //Saida
        Arrays.sort(numeros);
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println();

        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
    }
}
       
   
        