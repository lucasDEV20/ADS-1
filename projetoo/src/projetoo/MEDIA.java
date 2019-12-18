/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoo;
import java.text.DecimalFormat;
import java.util.Scanner;
public class MEDIA {
    

public static void main(String args[]) {
		Scanner MEDIA = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");

		char opcao;
		double media = 0.0, valordanota;
                double nota1 , nota2 , nota3 , nota4;
                int numerofaltas = 0 , falta1 , falta2;
                String nomedoaluno = null  ;
		do {
			
			mostrarMenu();

			System.out.println("\nInforme a opção desejada: ");
			opcao = MEDIA.next().toLowerCase().charAt(0);
			while (opcao != 'a' && opcao != 'b' && opcao != 'c' && opcao != 'd' ) {
				System.out.println("Opção Inválida, digite novamente: ");
				opcao = MEDIA.next().toLowerCase().charAt(0);
			}

			switch (opcao) {
			case 'a':
				System.out.println("\nOpção escolhida: NOME DO ALUNO.");
				System.out.println("digite o nome do alunno");
                                nomedoaluno = MEDIA.next();                              
                        
			case 'b':
				System.out.println("\nOpção escolhida: MEDIA DO ALUNO.");
				System.out.println("\nimforme o valor da nota 1:");
				nota1 = MEDIA.nextDouble();
                                System.out.println("\nimforme o valor da nota 2:");
				nota2 = MEDIA.nextDouble();
                                System.out.println("\nimforme o valor da nota 3:");
				nota3 = MEDIA.nextDouble();
                                System.out.println("\nimforme o valor da nota 4:");
				nota4 = MEDIA.nextDouble();
				media = (nota1 + nota2 + nota3 + nota4) /3;
                               
                                if (media <= 6) {
                                System.out.println("ALUNO RETIDO");
                                if (media >= 6) {
                                System.out.println("ALUNO APROVADO");        
                                   
                                System.out.print("O aluno "+nomedoaluno+"teve nota igual a :." + media);
                                }
                            }
                                
                        	
                                
				
                     
                        case 'c':
                                
				System.out.println("\nOpção escolhida: NUMERO DE FALTAS.");
				System.out.println("\nDIGITE O NUMERO DE FALTAS DO PRIMEIRO SEMESTRE");
                                falta1 = MEDIA.nextInt();
                                System.out.println("\nDIGITE O NUMERO DE FALTAS DO segundo SEMESTRE");
                                falta2 = MEDIA.nextInt();
				numerofaltas = (falta1 + falta2);
                                System.out.print("\no numero de faltas"+nomedoaluno+"e igual a :"+numerofaltas);
                        
                        
                        

			case 'd':
				System.out.print(" \nO aluno " +nomedoaluno+ " teve uma media de "+media+" e seu numero de flatas e  "+numerofaltas);
                                System.out.println("\nObrigado por utilizar nossos Sistemas.");
				System.out.println("\tFinalizando o programa...");
				break;
                   
			default:
				System.out.println("\nOpção Inválida tente novamente ");
                                System.out.println("\nleia as instruçoes");

                        
                        }
                        


    
                  }while (opcao != 'd');     
         
        } v  
   
                public static void mostrarMenu()
                {
	
		System.out.println("{--------------------------------------MENU DE ATENDIMENTO BIGGERGRAMMY-----------------------------------------------}");
		System.out.println("(a)NOME DO ALUNO");
		System.out.println("(b)MEDIA DO ALUNO");
		System.out.println("(c)NUMERO DE FALTAS");
		System.out.println("(d)SAIR");
                System.out.println("{----------------------------------------------------------------------------------------------------------------------}");
                }
}   



