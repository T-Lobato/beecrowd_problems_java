import java.util.Scanner;

public class Ex1046 {//Alterar o nome da class para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        sc.close();

        //Variaveis e Entrada

        int horaInicial = Integer.parseInt(valores[0]);
        int horaFinal = Integer.parseInt(valores[1]);
        int horaTotal;

        //Processamento e Saida
        if (horaFinal <= horaInicial){
            horaTotal = (24 - horaInicial) + horaFinal;
        }
        else {
            horaTotal = horaFinal - horaInicial;
        }
        System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
    }
}
            
            

   
        

