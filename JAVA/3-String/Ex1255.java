import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1255 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        while (casosDeTeste > 0) {

            String frase = sc.nextLine().toLowerCase();
            Map<String, Integer> ocorrencias = new LinkedHashMap<>();

            for (int i = 0; i < frase.length(); i++) {

                if (frase.charAt(i) > 122 || frase.charAt(i) < 97) {
                    continue;
                }

                String letra = "" + frase.charAt(i);

                if (ocorrencias.containsKey(letra)) {
                    ocorrencias.put(letra, ocorrencias.get(letra) + 1);
                } else {
                    ocorrencias.put("" + letra, 1);
                }
            }

            int maiorQuantOcorrencias = ocorrencias.values()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElse(0);

            String saida = "";

            for (Map.Entry<String, Integer> elemento : ocorrencias.entrySet()) {
                if (elemento.getValue() == maiorQuantOcorrencias) {
                    saida += elemento.getKey();
                }
            }

            char[] letras = saida.toCharArray();

            Arrays.sort(letras);

            String sortedStr = new String(letras);

            System.out.println(sortedStr);

            casosDeTeste--;
        }
        sc.close();
    }
}
