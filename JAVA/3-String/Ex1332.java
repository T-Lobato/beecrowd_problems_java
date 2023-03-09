import java.util.Scanner;

public class Ex1332 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        sc.nextLine();

        String one = "one";
        String two = "two";
        int numeroUm = 0;
        int numeroDois = 0;
        int numeroFinal = 0;
        

        for(int j = 0; j < entrada; j++) {

            String palavra = sc.nextLine();

        for(int i = 0; i < 3; i++) {
            if(palavra.charAt(i) == one.charAt(i)) {
                numeroUm++;
            }

            if(palavra.charAt(i) == two.charAt(i)) {
                numeroDois++;
            }
        }

        if(palavra.length() == 5) {
            numeroFinal = 3;
        } else if (numeroUm > numeroDois) {
            numeroFinal = 1;
        } else {
            numeroFinal = 2;
        }

        numeroUm = 0;
        numeroDois = 0;

        System.out.println(numeroFinal);

    }
    sc.close();

        }      
}
