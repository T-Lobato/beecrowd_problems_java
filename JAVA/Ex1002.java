import java.util.Scanner;

public class Ex1002{


public static void main(String args[]) {

        double r,a;

        double n = 3.14159;

        Scanner sc = new Scanner(System.in);

        r = sc.nextDouble();

        a = n * Math.pow(r, 2);

        System.out.printf("A=%.4f\n", a);

        sc.close();    

    
    }

}