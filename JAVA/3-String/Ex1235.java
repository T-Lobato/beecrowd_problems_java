import java.util.Scanner;

public class Ex1235 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casosDeTeste; i++) {
            frase = sc.nextLine();

        System.out.println(decodificaString(frase));
     
        }
        sc.close();
    }

    public static String decodificaString(String frase) {
       
        int metade = (frase.length() / 2);

        StringBuilder stringInvertidaUm = new StringBuilder(frase.substring(0, metade)).reverse();
        StringBuilder stringInvertidaDois = new StringBuilder(frase.substring(metade)).reverse();
        StringBuilder fraseFinal = new StringBuilder(stringInvertidaUm.append(stringInvertidaDois));

        return fraseFinal.toString();

    }
}
