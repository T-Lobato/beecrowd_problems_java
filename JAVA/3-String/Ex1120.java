import java.math.BigInteger;
import java.util.Scanner;

public class Ex1120 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            char digito = sc.next().charAt(0);
            String numero = sc.next();

            if (digito == '0' && numero.equals("0"))
                break;

            System.out.println(encontraValorRealContrato(digito, numero));

        }
        sc.close();
    }

    public static BigInteger encontraValorRealContrato(char digito, String numero) {
        StringBuilder valorOriginal = new StringBuilder();

        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) != digito) {
                valorOriginal.append(numero.charAt(i));
            }
        }

        if (valorOriginal.toString().isEmpty())
            valorOriginal.append(0);

        BigInteger valorReal = new BigInteger(valorOriginal.toString());
        return valorReal;

    }
}