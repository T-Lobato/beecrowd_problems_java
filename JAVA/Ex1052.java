import java.util.Scanner;

public class Ex1052 {//Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variaveis e entrada
        int numMes = sc.nextInt();
        sc.close();

        //Processamento
        if(numMes == 1){
            System.out.println("January");
        }
        else if(numMes == 2){
            System.out.println("February");
        }
        else if(numMes == 3){
            System.out.println("March");
        }    
        else if(numMes == 4){
            System.out.println("April");
        }
        else if(numMes == 5){
            System.out.println("May");
        }
        else if(numMes == 6){
            System.out.println("June");
        }
        else if(numMes == 7){
            System.out.println("July");
        }
        else if(numMes == 8){
            System.out.println("August");
        }
        else if(numMes == 9){
            System.out.println("September");
        }
        else if(numMes == 10){
            System.out.println("October");
        }
        else if(numMes == 11){
            System.out.println("November");
        }
        else{
            System.out.println("December");
        }

    }
}
