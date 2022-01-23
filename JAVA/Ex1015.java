import java.util.Scanner;

public class Ex1015 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //objeto
        Scanner sc = new Scanner(System.in);

        //variaveis e entradas
        String[] valores = sc.nextLine().split(" ");
        double x1 = Double.parseDouble(valores[0]);
        double y1 = Double.parseDouble(valores[1]);

        valores = sc.nextLine().split(" ");
        double x2 = Double.parseDouble(valores[0]);
        double y2 = Double.parseDouble(valores[1]);

        //variaveis e processamento
        double distancia = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)));

        //saida
        System.out.printf("%.4f\n", distancia);
        sc.close();
    }
}
