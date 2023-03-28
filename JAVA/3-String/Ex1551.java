import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1551 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        int letra;
        int aux = 0;
        List<Character> letrasUsadas = new ArrayList<>();

        while (casosDeTeste > 0) {

            String frase = sc.nextLine();

            for (int i = 0; i < frase.length(); i++) {
                letra = frase.charAt(i);

                for (int j = 97; j < 123; j++) {
                    if (letrasUsadas.contains((char) j))
                        continue;
                    else if (letra == j) {
                        aux++;
                        letrasUsadas.add((char) letra);
                        break;
                    }
                }
            }
            if (aux == 26) {
                System.out.println("frase completa");
            } else if (aux > 12) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
            aux = 0;
            letrasUsadas.clear();
            casosDeTeste--;
        }
        sc.close();
    }
}
