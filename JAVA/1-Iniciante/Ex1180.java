import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1180 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        List<Integer> lista = new ArrayList<>();
        int x = sc.nextInt();

        // Processamento
        for(int i = 0; i < x; i++) {
            lista.add(sc.nextInt());
        }
        sc.close();
        // Saída
        System.out.printf("Menor valor: %d\n", Collections.min(lista) );
        System.out.printf("Posicao: %d\n", lista.indexOf(Collections.min(lista)));
    }
} 