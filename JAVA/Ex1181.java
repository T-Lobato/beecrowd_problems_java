import java.util.Scanner;
public class Main { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        // Objeto
        Scanner sc = new Scanner(System.in);
        double[][] mat = new double[12][12];

        // Variaveis e Entrada
        int linha = sc.nextInt();
        sc.nextLine();
        String somaOuMedia = sc.nextLine();

        // Processamento
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++){
                mat[i][j] = sc.nextDouble();
            }        
        } 
        sc.close();

        double soma = 0;
        for(int col = 0; col < 12; col++){
                soma += mat[linha][col];
        } 
        // Saída
        switch(somaOuMedia){
            case "S":
            System.out.printf("%.1f\n", soma);
            break;
            case "M":
            System.out.printf("%.1f\n", soma / 12);
            break;
        }
    }
}