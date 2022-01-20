import java.util.Scanner;

public class Ex1004 { //Alterar o nome da classe para Main ara funcionar no beecrowd

    public static void main(String[] args) {

        int a, b, prod;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);

        sc.close();

    }
    
}
