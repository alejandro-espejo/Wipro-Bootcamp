package exercicios;
import java.util.Scanner;
import java.util.Random;
// Grupo 1 - exercicio 1

//Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10 
//(incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use um laço while para 
//registrar as tentativas feitas e, a cada tentativa, dê dicas informando se o número gerado é 
//maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas até 
//que o número fosse acertado

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num = new Random().nextInt(11);
		Scanner in = new Scanner(System.in);
		int recebe;
		int contador =1;
		
		System.out.println("Bem vind@ ao jogo da adivinhacao\n"
				+ "Para vencer adivinhe o numero, ele está entre os números 0 e 10, incluindo as extremidades.");
		
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
