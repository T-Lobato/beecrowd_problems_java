import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1168 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) { // Alterar o nome da classe para Main para funcionar no beecrowd
        
        String entrada = sc.nextLine();

        System.out.println(calculaTotalLeds(entrada) + " leds");
    }
    sc.close();

    }

    public static int calculaTotalLeds(String entrada) {
        List<Integer> listaInteiros = new ArrayList<>();
        int totalLeds = 0;


        for(int j = 0; j < entrada.length(); j++) {

            listaInteiros.add((int)entrada.charAt(j) - (int)'0');

            switch(listaInteiros.get(j)) {
                case 0 -> totalLeds += 6;
                case 1 -> totalLeds += 2;
                case 2 -> totalLeds += 5;
                case 3 -> totalLeds += 5;
                case 4 -> totalLeds += 4;
                case 5 -> totalLeds += 5;
                case 6 -> totalLeds += 6;
                case 7 -> totalLeds += 3;
                case 8 -> totalLeds += 7;
                case 9 -> totalLeds += 6;
            }
        }

        return totalLeds;

    }

}
