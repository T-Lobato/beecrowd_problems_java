
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1581 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        Set<String> listaIdiomas = new HashSet<>();

        String idiomaNativo;

        int quantPessoas;

        while(casosDeTeste > 0) {

            quantPessoas = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < quantPessoas; i++) {
                idiomaNativo = sc.nextLine();
                listaIdiomas.add(idiomaNativo);
            }
            casosDeTeste--;

            if (listaIdiomas.size() == 1) {
                for (String idioma : listaIdiomas) {
                    System.out.println(idioma);
                }
            }
            else System.out.println("ingles");
            listaIdiomas.clear();

        }
        sc.close();
    }
}
