import java.util.Scanner;

public class CadastroSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
	
		 while (true) {
		      System.out.printf("Digite a senha desejada e tecle Enter, FIM para encerrar: \n");
		      String senha = ler.nextLine();
		      if(senha.equalsIgnoreCase("FIM"))
			         break;
			         
			  System.out.printf("\n");
		   
			  
		      boolean achouNumero = false;
		      boolean achouMaiuscula = false;
		      boolean achouMinuscula = false;
		      boolean achouSimbolo = false;
		      for (char c : senha.toCharArray()) {
		           if (c >= '0' && c <= '9') {
		               achouNumero = true;
		           } else if (c >= 'A' && c <= 'Z') {
		               achouMaiuscula = true;
		           } else if (c >= 'a' && c <= 'z') {
		               achouMinuscula = true;
		           } else {
		               achouSimbolo = true;
		           }
		      }
		      if(achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo && senha.length() >= 6 ) {
		    	  System.out.println("Parabéns sua senha e forte!");
		    	  break;
		      }
		      else {
		    	  System.out.println("A senha deve possuir no mínimo 6 caracteres e deve conter pelo menos 1 numero, 1 letra maiuscula, 1 minuscula e um caractere especial");
		    	  System.out.println("Quantidade de caracteres na senha: " + senha.length());
		      }

		}
	}

}
