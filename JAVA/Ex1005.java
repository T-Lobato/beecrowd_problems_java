import java.util.Scanner;

public class Ex1005 { //Alterar o nome da classe para Main para funcionar no beecrowd

    public static void main(String[] args) {
        
        double nota1,nota2,media;

        Scanner sc = new Scanner(System.in);

        nota1 = sc.nextDouble() * 3.5;
        nota2 = sc.nextDouble() * 7.5;

        media = (nota1 + nota2) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();     
        
    }
    
}
