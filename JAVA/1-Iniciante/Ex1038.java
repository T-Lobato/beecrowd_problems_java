import java.util.Scanner;

public class Ex1038 {//Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //objeto
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        sc.close();

        //variaveis e entrada
        double cod = Double.parseDouble(valores[0]);
        double quant = Double.parseDouble(valores[1]);

        //processamento e saida
        if (cod == 1){
           System.out.printf("Total: R$ %.2f\n", (quant * 4.00));     
        
        } else if (cod == 2) {
            System.out.printf("Total: R$ %.2f\n", (quant * 4.50));

        } else if (cod == 3) {
            System.out.printf("Total: R$ %.2f\n", (quant * 5.00));
        
        } else if (cod == 4) {
            System.out.printf("Total: R$ %.2f\n", (quant * 2.00));
       
        } else if (cod == 5) {
            System.out.printf("Total: R$ %.2f\n", (quant * 1.50));
        }                          
    }
}
