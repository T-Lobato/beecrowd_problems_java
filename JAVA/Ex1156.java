public class Ex1156 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
      // Variáveis & Entrada
      double aux1 = 5;
      double aux2 = 4;

      // Processamento
      double s = 2.5;
      for(int i = 0; i < 98; i++) { 
          s += aux1/aux2;
  
      aux1 += 2;
      aux2 *= 2; 

      }
      // Saída
      System.out.printf("%.2f\n", s);
    }
}