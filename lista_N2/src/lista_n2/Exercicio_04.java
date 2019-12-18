/*
 4. Escreva um programa que leia o nome e a idade de vários usuários, e imprima a
 seguinte mensagem “O usuário *nome* tem *anos* anos de vida”. O programa deverá
 continuar executando enquanto o usuário informar que deseja continuar.
 */
package lista_n2;

import java.util.Scanner;

public class Exercicio_04 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String nome, nomeMaiorIdade ="", nomeMenorIdade ="";
		int opc, idade, cont = 0, maiorIdade = 0, menorIdade = 999;
		double somaIdades = 0.0, media;
		do{
			System.out.println("Informe seu nome: ");
			nome = entrada.nextLine();
			
			System.out.println(nome + ", informe sua idade: ");
			idade = entrada.nextInt();
			
			if(idade == 0)
			{
				System.out.println("Fim da coleta de idades.. ");
			}
			else if (idade < 0)
			{
				System.out.println("Idade inválida!");
			}
			else{
				System.out.println("O usuário " + nome + " tem " + idade + " anos de vida");
				cont++;
				somaIdades = somaIdades + idade;
				
				if (idade > maiorIdade)
				{
					maiorIdade = idade;
					nomeMaiorIdade = nome;
				}
				
				if(idade < menorIdade)
				{
					menorIdade = idade;
					nomeMenorIdade = nome;
				}
			}
			
                        System.out.println("Deseja continuar? (1- Sim / 0- Nao): ");
			opc = entrada.nextInt();
			while(opc != 0 && opc != 1)
			{
				System.out.println("Opção inválida, digite apenas 0 ou 1: ");
				opc = entrada.nextInt();
			}
			/*
			 * Comentário com Trecho de código para verificar se o usuário deseja ou não continuar.
			 * Apenas para lembrança do exercício 4 da lista, ISTO NÃO SERÁ CONSIDERADO NA EXECUÇÃO. 
			 * 
			System.out.println("Deseja continuar? (1- Sim / 0- Nao): ");
			opc = entrada.nextInt();
			while(opc != 0 && opc != 1)
			{
				System.out.println("Opção inválida, digite apenas 0 ou 1: ");
				opc = entrada.nextInt();
			}
			*
			* Fim do comentário sobre o trecho de código.
			**/
			
			entrada.nextLine();
		}while (idade != -1);
		
		media = somaIdades/cont;
		System.out.println("\n------ Estatísticas após as leituras ------");
		System.out.println("Quantidade de pessoas entrevistadas: " + cont);
		System.out.println("Média das idades do grupo: " + media);
		System.out.println("Nome do usuário com menor idade: " + nomeMenorIdade +" com " + menorIdade + " anos.");
		System.out.println("Nome do usuário com maior idade: " + nomeMaiorIdade +" com " + maiorIdade + " anos.");
	}

}
        