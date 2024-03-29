import java.util.Scanner;

public class Ex1253 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < casosDeTeste; j++) {

            String entrada = sc.nextLine();
            int chave = sc.nextInt();
            sc.nextLine();

            System.out.println(decodeString(casosDeTeste, chave, entrada));

        }
        sc.close();
    }

    public static String decodeString(int casosDeTeste, int chave, String entrada) {
        StringBuilder stringDecodificada = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {

            if ((entrada.charAt(i) - chave) < 65) {
                stringDecodificada.append((char) (entrada.charAt(i) - chave + 26));
            } else
                stringDecodificada.append((char) (entrada.charAt(i) - chave));
        }

        return stringDecodificada.toString();

    }
}
