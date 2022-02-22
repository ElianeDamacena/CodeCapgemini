import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	    String s;
	    int i, j, n;
	    while (true) {
	      System.out.printf("Digite a quantidade de degrais para sua escada e tecle Enter, FIM para encerrar: \n");
	      s = ler.nextLine();
	// compara a string informada pelo usuário com a palavra FIM ignorando
	// na comparação se os caracteres são maiúsculos ou minúsculos
	      if (s.equalsIgnoreCase("FIM"))
	         break;

	      System.out.printf("\n");
	      n = Integer.parseInt(s);//.length(); // tamanho da string (qtde de caracteres)

	      for (i=0; i<n; i++) {
	// a cada linha mostra 'i' caracteres
	        for (j=0; j<=i; j++) {
	// mostra o j-ésimo caractere de 's'
	          System.out.printf("*" );
	        }
	        System.out.printf("\n");
	      }
	      System.out.printf("\n");
	    }
	}
}
