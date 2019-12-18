package br.com.teste;

import java.util.Random;

public class Ex54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = new int[10][10];
		int[] SL = new int[3];
                
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				A[i][j] = sorteia(1, 100);
				
				
			}
		}
		 
		System.out.println("Matriz A: \n= [");
		imprimeMatriz(A);
		          System.out.print("] ");
                          System.out.println();
		System.out.println("\n\nVetor SL: ");
		imprimeVetor(SL);
	}
	
	public static void imprimeVetor(int[] vetor)
	{
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.print(vetor[i] + "     ");
		}
	}

	public static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "  ,  ");
			}
			System.out.println("     ");
		}
                
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}