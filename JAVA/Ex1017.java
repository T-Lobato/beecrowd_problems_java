import java.util.Scanner;

public class Ex1017 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //objeto e variaveis
        Scanner sc = new Scanner(System.in);
        
        double consumo = 12.0; // 12km/l

        //variaveis e entrada
        int tempoViagem = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        
        //variaveis e processamento
        double litrosNecessarios = tempoViagem * velocidadeMedia / consumo;
                
        //saida
        System.out.printf("%.3f\n",litrosNecessarios);
        sc.close();
    }
}
