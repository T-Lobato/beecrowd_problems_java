import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex3358 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> vogais = Arrays.asList("a", "e", "i", "o", "u");

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casosDeTeste; i++) {

            String sobrenome = sc.nextLine();

            System.out.println(verificaDificuldade(sobrenome, vogais));
        }
        sc.close();
    }

    public static String verificaDificuldade(String sobrenome, List<String> vogais) {

        sobrenome = sobrenome.toLowerCase();
        
        int count = 1;
        boolean aux = false;

        for (int i = 0; i < sobrenome.length(); i++) {
            if (vogais.contains(sobrenome.charAt(i) + "")) {
                continue;
            }

            for (int j = i + 1; j < sobrenome.length(); j++) {
                if (!(vogais.contains(sobrenome.charAt(j) + ""))) {
                    count++;
                } else {
                    break;
                }
            }
            if(count > 2) {
                aux = true;
            }
            count = 1;
        }

        String saida = "";

        sobrenome = sobrenome.substring(0, 1).toUpperCase().concat(sobrenome.substring(1));

        if (aux) {
            saida = sobrenome + " nao eh facil";
        } else {
            saida = sobrenome + " eh facil";
        }

        return saida;
    }
}
