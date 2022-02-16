import java.util.Scanner;

public class Ex1087 { // Alterar o nome da classe para main para funcionar no beecrowd
	public static void main(String[] args) {
		// Objeto
		Scanner sc = new Scanner(System.in);
				
		// Variaveis / Processamento / Saída
		int x1,y1,x2,y2;

	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	if(x1 == 0 ) break; //condição de parada
	    	if(x1 == x2 && y1 == y2)		
	    		System.out.printf("0\n");	
	    	else if(Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2)
	    		System.out.printf("1\n");
	        else 
	        	System.out.printf("2\n");	
	    }
		sc.close();
	}
}