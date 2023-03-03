import java.util.Scanner;

public class Ex1013 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objeto
        Scanner sc = new Scanner(System.in);

        //variaveis & entrada
        String[] valores = sc.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        //processamento
        int maiorAB = (a + b + Math.abs(a-b))/2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c))/2;

        //saida
        System.out.println(maiorABC + " eh o maior");
        sc.close();
    }
}
