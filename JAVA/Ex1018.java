import java.util.Scanner;

public class Ex1018 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //objeto e variaveis
        Scanner sc = new Scanner(System.in);
                
        //variaveis e entrada
        int n = sc.nextInt();
        
        //variaveis e processamento
        int cem = n/100;
        int cinquenta = (n%100)/50;
        int vinte = ((n%100)%50)/20;
        int dez = (((n%100)%50)%20)/10;
        int cinco = ((((n%100)%50)%20)%10)/5;
        int dois = (((((n%100)%50)%20)%10)%5)/2;
        int um = ((((((n%100)%50)%20)%10)%5)%2)/1;

       //saida
        System.out.println(cem + " notas(s) de R$ 100,00");
        System.out.println(cinquenta + " notas(s) de R$ 50,00");
        System.out.println(vinte + " notas(s) de R$ 20,00");
        System.out.println(dez + " notas(s) de R$ 10,00");
        System.out.println(cinco + " notas(s) de R$ 5,00");
        System.out.println(dois + " notas(s) de R$ 2,00");
        System.out.println(um + " notas(s) de R$ 1,00");
        sc.close();
     }
}