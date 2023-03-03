import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1040 {//Alterar nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objeto e variaveis
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        DecimalFormat df = new DecimalFormat("#,#0.0");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        
        double pesoN1 = 2;
        double pesoN2 = 3;
        double pesoN3 = 4;
        double pesoN4 = 1;
        
        //variaveis e entradas
        double n1 = Double.parseDouble(valores[0]);
        double n2 = Double.parseDouble(valores[1]);
        double n3 = Double.parseDouble(valores[2]);
        double n4 = Double.parseDouble(valores[3]);

        //variaveis, processamento e saida
        
        double media = ((n1 * pesoN1) + (n2 * pesoN2) + (n3 * pesoN3) + (n4 * pesoN4))/10;
        System.out.println("Media: " + df.format(media));

        if (media >= 7){
            System.out.println("Aluno aprovado.");
        }
        else if(media < 5){
            System.out.println("Aluno reprovado."); 
        }
        else if (media >= 5 && media <= 6.9){
            System.out.println("Aluno em exame."); 

            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame); 

            media = (media + notaExame) / 2;

            if(media >= 5){
                System.out.println("Aluno aprovado."); 
                
            }
            else if (media < 5){
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + df.format(media));
        } 
        sc.close();   
    }
}
