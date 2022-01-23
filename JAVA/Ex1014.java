import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1014 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objetos        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###0.000");
        
        //variaves e entradas
        int x = sc.nextInt();
        double y = sc. nextDouble();
        
        //processamento
        double consumoMedio = x/y;

        //saida
        System.out.println(df.format(consumoMedio) + " km/l");
        sc.close();
    }
}
