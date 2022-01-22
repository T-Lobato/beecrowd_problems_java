import java.util.Scanner;

public class Ex1010 { //Alterar o nome da classe para Main para funcionar no beecrowd
public static void main(String[] args) {

        //variaveis
        int quant1, quant2;
        double valor1, valor2, pagar;
        String linha;
        
        Scanner sc = new Scanner(System.in);

        //entrada
        linha = sc.nextLine();
        String[] valores = linha.split("\\s");
        quant1 = Integer.parseInt(valores[1]);
        valor1 = Double.parseDouble(valores[2]);

        linha = sc.nextLine();
        valores = linha.split("\\s");
        quant2 = Integer.parseInt(valores[1]);
        valor2 = Double.parseDouble(valores[2]);

        //processamento
        pagar = (quant1 * valor1) + (quant2 * valor2);

        //saida
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", pagar);
        sc.close();



        







        


    }
}
