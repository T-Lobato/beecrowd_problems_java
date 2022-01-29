import java.util.Scanner;

import java.util.Arrays;

public class Ex1045 {//Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        //Obejtos
        Scanner sc = new Scanner(System.in);
        String [] valores = sc.nextLine().split(" ");
        float[] numeros = new float[3];
        sc.close();

        //Variaveis e Entradas
        for (int i = 0; i < 3; i++){
            numeros[i] = Float.parseFloat(valores[i]);
        }

        Arrays.sort(numeros); //Ordena a lista em crescente
                              //Define os valores a, b c na ordem pedida no exercício.   
        float a = numeros[2];
        float b = numeros[1];
        float c = numeros[0];

        //Processamento e saida
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (Math.pow(a,2) == (Math.pow(b,2) + (Math.pow(c,2)))) {
            System.out.println("TRIANGULO RETANGULO");
            
        }
        else if (Math.pow(a,2) > (Math.pow(b,2) + (Math.pow(c,2)))) {
            System.out.println("TRIANGULO OBTUSANGULO");
                        
        }
        else if (Math.pow(a,2) < (Math.pow(b,2) + (Math.pow(c,2)))) {
            System.out.println("TRIANGULO ACUTANGULO");
            
            }

            if(a == b & a == c & b == c) {
                System.out.println("TRIANGULO EQUILATERO");
               }
               else if (a == b || a == c || b == c) {
                   System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }          

