package exercicios;
import java.util.Scanner;
import java.util.Random;
// Grupo 1 - exercicio 1

//Escreva um programa Java que gera um n�mero aleat�rio (rand�mico) entre 0 e 10 
//(incluindo estes dois valores) e pe�a ao usu�rio para adivinh�-lo. Use um la�o while para 
//registrar as tentativas feitas e, a cada tentativa, d� dicas informando se o n�mero gerado � 
//maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas at� 
//que o n�mero fosse acertado

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num = new Random().nextInt(11);
		Scanner in = new Scanner(System.in);
		int recebe;
		int contador =1;
		
		System.out.println("Bem vind@ ao jogo da adivinhacao\n"
				+ "Para vencer adivinhe o numero, ele est� entre os n�meros 0 e 10, incluindo as extremidades.");
		
		System.out.printf("Digite um valor: ");
		
		recebe = in.nextInt();
		while(recebe != num) {
			if(recebe > num) {
				System.out.println("O numero a ser adivinhado eh menor que o numero chutado");
			}else 
				System.out.println("O numero a ser adivinhado eh maior que o numero chutado");
			
			System.out.println("Chute um valor diferente do palpite anterior");
			recebe = in.nextInt();
			contador++;
		}
		
		System.out.println("Voce adivinhou o numero apos "+ contador+" tentativas!");
		
		in.close();		
	}
}
