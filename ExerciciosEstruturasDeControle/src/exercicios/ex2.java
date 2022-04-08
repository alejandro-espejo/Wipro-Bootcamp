package exercicios;

import java.util.Locale;
import java.util.Scanner;

// Grupo 1 - ex 2
//Fa�a um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular 
//a m�dia do aluno e apresentar ao final a m�dia calculada e a situa��o de Aprova��o do aluno. 
//(aprovado com m�dia >= 6).
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(new Locale("pt","BR"));
		String nome;
		double nota1, nota2, media;
		 
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Informe o nome do aluno: ");
		nome = in.next();
		
		System.out.print("Informe a primeira nota: ");
		nota1 = in.nextDouble();
		System.out.print("Informe a segunda nota:");
		nota2 = in.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6.0)
			System.out.println("O aluno foi aprovado!");
		else
			System.out.println("O aluno foi reprovado.");
		
		System.out.printf("A media de " + nome + " foi de %.2f", media);
		
		in.close();
	}

}
