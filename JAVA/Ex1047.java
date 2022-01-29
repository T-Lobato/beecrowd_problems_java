import java.util.Scanner;

public class Ex1047 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);
        
        //Variaveis e entrada
        String[] valores = sc.nextLine().split(" ");
        sc.close();

        int horaIni = Integer.parseInt(valores[0]);
        int minIni = Integer.parseInt(valores[1]);
        int horaFim = Integer.parseInt(valores[2]);
        int minFim = Integer.parseInt(valores[3]);
        
        //processamento 
        int tempoEmMinutosInicio = horaIni * 60 + minIni;
        int tempoEmMinutosFim = horaFim * 60 + minFim;
        int duracaoJogo;
        
        if(tempoEmMinutosFim <= tempoEmMinutosInicio){
            duracaoJogo = (24 * 60 - tempoEmMinutosInicio) + tempoEmMinutosFim;
        }
        else { 
            duracaoJogo = tempoEmMinutosFim - tempoEmMinutosInicio;
        }
        //Saida
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoJogo /60, duracaoJogo %60);
    }
}
                
