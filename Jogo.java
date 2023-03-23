/*jogo pedra papel e tesoura. 

 u(1) c(2) = usuário vence
 u(1) c(3) = computador vence
 u(2) c(1) = computador vence
 u(3) c(3) = empate
 u(2) c(3) = usuário vence
 pensar em uma jogada
 
*/
package projetos;

import java.util.*;

public class Jogo {
	public static void main(String[] args) {
		// 1 - papel; 2 - pedra; 3- tesoura
		int numJogador, numPc;

		Scanner leitor = new Scanner(System.in);

		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.print("Digite a opção desejada: ");

		// lógica usuário
		numJogador = leitor.nextInt();
		System.out.println("\n");

		switch (numJogador) 
		{
		case 1:
			System.out.println("Jogador: Pedra");
			break;

		case 2:
			System.out.println("Jogador: Papel");
			break;

		case 3:
			System.out.println("Jogador: Tesoura");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		// lógica do computador
		numPc = (int) (Math.random() * 3 + 1);
		leitor.close();

		switch (numPc) 
		{
		case 1:
			System.out.println("Pc: Pedra");
			break;

		case 2:
			System.out.println("Pc: Papel");
			break;

		case 3:
			System.out.println("Pc: Tesoura");
			break;

		}
		// lógica vencedor
		System.out.println("");
		
		if (numJogador == numPc) 
		{
			System.out.println("Empate");
		} 
		else 
		{
			if ((numJogador == 1 && numPc == 3) || 
				(numJogador == 2 && numPc == 1) || 
				(numJogador == 3 && numPc == 2)) {
				System.out.println("Usuário venceu");
			} 
			else 
			{
				System.out.println("Computador venceu!");
			}
		}
	}
}
