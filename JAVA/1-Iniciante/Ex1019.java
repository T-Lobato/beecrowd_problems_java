import java.util.Scanner;

public class Ex1019 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objetos
        Scanner sc = new Scanner(System.in);

        //variaveis e entradas
        int tempoEmSegundos = sc.nextInt();

        //variaveis e processamento
        int horas = tempoEmSegundos/3600;
        tempoEmSegundos = tempoEmSegundos - (horas * 3600);

        int minutos = tempoEmSegundos / 60;
        tempoEmSegundos = tempoEmSegundos - (minutos * 60);

        int segundos = tempoEmSegundos;

        //saida
        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
}
