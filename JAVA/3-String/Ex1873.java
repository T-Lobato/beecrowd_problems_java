import java.util.Scanner;

public class Ex1873 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosDeTeste = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casosDeTeste; i++) {

            String rajesh = sc.next();
            String sheldon = sc.next();

            System.out.println(verificaRodada(rajesh, sheldon));

        }
        sc.close();
    }

    public static String verificaRodada(String rajesh, String sheldon) {

        String vencedor = "";

        if (rajesh.equals("tesoura") && (sheldon.equals("papel") || sheldon.equals("lagarto"))) {
           vencedor = "rajesh";
        } else if (rajesh.equals("papel") && (sheldon.equals("pedra") || sheldon.equals("spock"))) {
           vencedor = "rajesh";
        } else if (rajesh.equals("pedra") && (sheldon.equals("lagarto") || sheldon.equals("tesoura"))) {
            vencedor = "rajesh";
        } else if (rajesh.equals("lagarto") && (sheldon.equals("spock") || sheldon.equals("papel"))) {
            vencedor = "rajesh";
        } else if (rajesh.equals("spock") && (sheldon.equals("tesoura") || sheldon.equals("pedra"))) {
            vencedor = "rajesh";
        } else if (rajesh.equals(sheldon)) {
            vencedor = "empate";
        } else {
            vencedor = "sheldon";
        }

        return vencedor;
    } 
}
