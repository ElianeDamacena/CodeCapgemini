import java.util.ArrayList;
import java.util.Scanner;

public class Anagrama2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		// String palavra = "jovem";
		System.out.printf("Digite a palavra para descobrir os anagramas: \n");
	      String palavra = ler.nextLine(); 
		
	   // String palavra = "ovo";
	    ArrayList<String> anagramas = new ArrayList<String>();
	    
	    for(int i = 0; i <palavra.length(); i++) {
	        for(int j = 1; j < palavra.length(); j++) {
	            if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
	                if(palavra.charAt(i) == palavra.charAt(i+1)) {
	                String x = palavra.substring(i, i + 1);
	                anagramas.add(x);
	                } else {
	                String y = palavra.substring(i, j);
	                String z = palavra.substring(i + 1, j + 1);
	                String h = palavra.substring(i, i + 1);
	                anagramas.add(h);
	                anagramas.add(y);
	                anagramas.add(z);
	                }
	            }
	        }
	    }
	    
	    System.out.println(anagramas);

	}

}
