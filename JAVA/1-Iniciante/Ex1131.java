import java.util.Scanner;

public class Ex1131 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Processamento
        int grenais = 0;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empates = 0;
        int option = 0;

        while(true) {

            while(option != 2){
            grenais++;
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();
            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            option = sc.nextInt();

            if(golsInter > golsGremio) vitoriaInter++;
            else if ( golsInter < golsGremio) vitoriaGremio++;
            else empates++;
            }

            System.out.printf("%d grenais\n", grenais);
            System.out.printf("Inter:%d\n", vitoriaInter);
            System.out.printf("Gremio:%d\n", vitoriaGremio);
            System.out.printf("Empates:%d\n", empates);
            if(vitoriaInter > vitoriaGremio) System.out.println("Inter venceu mais");
            else if(vitoriaInter < vitoriaGremio) System.out.println("Gremio venceu mais");
            else System.out.println("Nao houve vencedor");
            break;
        } 
        sc.close();
    }
}