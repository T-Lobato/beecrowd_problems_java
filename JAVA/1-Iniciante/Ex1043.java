import java.util.Scanner;

public class Ex1043 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Obejto
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        sc.close();

        //Variaveis e Entrada
        float a = Float.parseFloat(valores[0]);
        float b = Float.parseFloat(valores[1]);
        float c = Float.parseFloat(valores[2]);

        //Processamento e saida
        if ( a + b > c && a + c > b & b + c > a) {

            System.out.printf("Perimetro = %.1f\n", a + b + c);
        }
        else {
            float areaTrapezio = ((a + b) * c) / 2;  
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }
    }
}
            


        


