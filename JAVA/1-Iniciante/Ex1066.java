import java.util.Scanner;

public class Ex1066 { // Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis e Entrada
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        // Processamento

        for(int i = 0; i < 5; i++){
            int entrada = sc.nextInt();

            if(entrada % 2 == 0){
                par++;

                if(entrada > 0){
                    positivo++;
                }    
                else if(entrada < 0){
                     negativo++;
                }   
            }
            else if (entrada % 2 != 0){
                impar++;
                
                if(entrada > 0){
                    positivo++;
                }    
                
                else if(entrada < 0){
                     negativo++;
                }
            }
        }
        sc.close();
        // Saida
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}

            
                        
    