public class Ex1096{ // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        // Processamento & Saída
        int aux = 1;

        for(int i = 1, j = 7; i < 16; i++) {
            if(j > 4) System.out.printf("I=%d J=%d\n", aux, j);
            
            else if(j < 5) { 
                aux += 2;
                j = 7;
                System.out.printf("I=%d J=%d\n", aux, j);
            }
            j--;
        }
    }
}