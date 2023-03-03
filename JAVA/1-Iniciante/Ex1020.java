import java.util.Scanner;

public class Ex1020 { //Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        //objeto
        Scanner sc = new Scanner(System.in);

        //entradas e variaveis
        int IdadeEmDias = sc.nextInt();

        //variaveis e processamento
        int ano = IdadeEmDias / 365;
        IdadeEmDias -= ano * 365;

        int mes = IdadeEmDias / 30;
        IdadeEmDias -= mes * 30;

        int dia = IdadeEmDias;

        //saida
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        sc.close();
    }
}
