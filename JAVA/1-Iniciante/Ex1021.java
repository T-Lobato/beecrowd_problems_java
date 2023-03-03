import java.util.Scanner;

public class Ex1021{
    public static void main(String[] args) {
        
        //objeto
        Scanner sc = new Scanner(System.in);

        //entradas e variaveis
        double valorEntrada = sc.nextDouble();

        //variaveis e processamento
        int notas = (int) valorEntrada; // Converte o valorEntrada de Double para Int
        int moedas = (int) ((valorEntrada - notas) * 100);

        int nota100 = notas / 100;
        notas = notas - (nota100 * 100);

        int nota50 = notas / 50;
        notas = notas - (nota50 * 50);

        int nota20 = notas / 20;
        notas = notas - (nota20 * 20);

        int nota10 = notas / 10;
        notas = notas - (nota10 * 10);

        int nota5 = notas / 5;
        notas = notas - (nota5 * 5);

        int nota2 = notas / 2;
        notas = notas - (nota2 * 2);

        int moeda1 = notas;
        notas = notas - (moeda1 * 1);
        
        int moeda50 = moedas / 50;
        moedas = moedas - (moeda50 * 50);

        int moeda25 = moedas / 25;
        moedas = moedas - (moeda25 * 25);

        int moeda10 = moedas / 10;
        moedas = moedas - (moeda10 * 10);

        int moeda05 = moedas / 5;
        moedas = moedas - (moeda05 * 5);

        int moeda01 = moedas;    

        //saida
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
        sc.close();
    }
}

    





