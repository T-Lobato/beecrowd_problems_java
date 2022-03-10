public class Ex1155 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Variáveis & Entrada
        double aux = 3;

        // Processamento
        double s = 1.5;
        for(int i = 0; i < 98; i++) { 
            s += 1/aux;
    
        aux++;

        }
        // Saída
        System.out.printf("%.2f\n", s);
    }
}