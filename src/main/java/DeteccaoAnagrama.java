import java.util.Scanner;

public class DeteccaoAnagrama {

	// O que é um anagrama exemplos?
	//Anagrama é um substantivo que significa uma palavra ou frase que é construída através da alteração das letras de uma outra palavra ou frase. ... 
	//Para criar um anagrama, podem ser trocadas duas ou mais letras. Por exemplo: a palavra pedra pode ser transformada em perda, se trocarmos o "d" pelo "r".
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// String palavra = "jovem";
		System.out.printf("Digite a palavra para descobrir os anagramas: \n");
	      String palavra = ler.nextLine();
		
		imprimeAnagramas("", palavra);

	}

	public static void imprimeAnagramas(String prefix, String word) {
		if (word.length() <= 1) {
			System.out.println(prefix + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				String cur = word.substring(i, i + 1);
				String before = word.substring(0, i); 
				String after = word.substring(i + 1); 
				imprimeAnagramas(prefix + cur, before + after);
			}
		}
	}

}