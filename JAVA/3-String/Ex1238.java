import java.util.Scanner;

public class Ex1238 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casosDeTeste = sc.nextInt();

        for(int j = 0; j < casosDeTeste; j++) {

        String firstWord = sc.next();
        String secondWord = sc.next();

        StringBuilder stringConcatenada = new StringBuilder();
        int i;

        int minLength = Math.min(firstWord.length(), secondWord.length());
        String maxLength = (firstWord.length() >= secondWord.length()) ? firstWord : secondWord;


        for(i = 0; i < minLength; i++) {
            stringConcatenada.append(firstWord.charAt(i));
            stringConcatenada.append(secondWord.charAt(i));
         }

        System.out.println(stringConcatenada.append(maxLength.substring(i)));
        }
        sc.close();
    }
}
