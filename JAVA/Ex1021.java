import java.util.Scanner;
import java.util.Locale;

public class Ex1021 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objeto e variaveis
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));
                
        //variaveis e entrada
        double n = sc.nextDouble();
                
        //variaveis e processamento
        //Notas
        double cem = n/100;
        double cinquenta = (n%100)/50;
        double vinte = ((n%100)%50)/20;
        double dez = (((n%100)%50)%20)/10;
        double cinco = ((((n%100)%50)%20)%10)/5;
        double dois = (((((n%100)%50)%20)%10)%5)/2;

        //Moedas    
        double umReal = ((((((n%100)%50)%20)%10)%5)%2)/1;
        double cinquentaCent = (((((((n%100)%50)%20)%10)%5)%2)%1)/0.50;
        double vinteECincoCent = ((((((((n%100)%50)%20)%10)%5)%2)%1)%0.50)/0.25;
        double dezCent = (((((((((n%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10;
        double cincoCent = ((((((((((n%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)/0.05;
        double umCent = (((((((((((n%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)%0.05)/0.01;

        //Conversão Notas
        //Double para Int
        int cemInt = (int) cem;
        int cinquentaInt = (int) cinquenta;
        int vinteInt = (int) vinte;
        int dezInt = (int) dez;
        int cincoInt = (int) cinco;
        int doisInt = (int) dois;

        //Conversão Moedas
        //Double para Int
        int umRealInt = (int) umReal;
        int cinquentaCentInt = (int) cinquentaCent;
        int vinteECincoCentInt = (int) vinteECincoCent;
        int dezCentInt = (int) dezCent;
        int cincoCentInt = (int) cincoCent;
        int umCentInt = (int) umCent;

       //saida Notas
        System.out.println("NOTAS:");
        System.out.println(cemInt + " nota(s) de R$ 100,00");
        System.out.println(cinquentaInt + " nota(s) de R$ 50,00");
        System.out.println(vinteInt + " nota(s) de R$ 20,00");
        System.out.println(dezInt + " nota(s) de R$ 10,00");
        System.out.println(cincoInt + " nota(s) de R$ 5,00");
        System.out.println(doisInt + " nota(s) de R$ 2,00");

        //saida Moedas
        System.out.println("MOEDAS:");
        System.out.println(umRealInt + " moeda(s) de R$ 1,00");
        System.out.println(cinquentaCentInt + " moeda(s) de R$ 0,50");
        System.out.println(vinteECincoCentInt + " moeda(s) de R$ 0,25");
        System.out.println(dezCentInt + " moeda(s) de R$ 0,10");
        System.out.println(cincoCentInt + " moeda(s) de R$ 0,05");
        System.out.println(umCentInt + " moeda(s) de R$ 0,01");      
        sc.close();
    }
}
        
       



