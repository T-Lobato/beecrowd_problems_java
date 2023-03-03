import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1074 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws Exception{
        //Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis e Entrada
        int entrada1 = Integer.parseInt(br.readLine());

        //Processamento e saida
        for(int i = 0; i < entrada1; i++){
            int valor = Integer.parseInt(br.readLine());

            if(valor % 2 == 0 && valor > 0){
                System.out.println("EVEN POSITIVE");                
                }
                else if(valor % 2 == 0 && valor < 0){
                    System.out.println("EVEN NEGATIVE");
                }
                else if(valor % 2 != 0 && valor > 0){
                    System.out.println("ODD POSITIVE");
                }
                else if(valor % 2 != 0 && valor < 0){
                    System.out.println("ODD NEGATIVE");
                }
                else {
                    System.out.println("NULL");
                }
            }
            br.close();
        }
    }