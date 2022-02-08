import java.util.Scanner;

public class Ex1070 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        // Variaveis e Entrada
        int valorEntrada = sc.nextInt();
        sc.close();

        //Processamento e saida
        for(int i = 0; i < 12; i++){

            if(valorEntrada % 2 == 0){
                valorEntrada++;
            }
            else {
                System.out.println(valorEntrada);
                valorEntrada++;
            }
        }
    }
}