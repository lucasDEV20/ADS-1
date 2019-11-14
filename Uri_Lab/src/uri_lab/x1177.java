/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uri_lab;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class x1177 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero ;
        //indice i e indice j
        int  j = 0;
        numero = entrada.nextInt();
        int vetor[] = new int[1000];
        for ( int i = 0; i < 1000; i++) {
            if (j >= numero) {
                j = 0;
            }
            vetor[i] = j;
            System.out.println("N["+i+"] = " + vetor[i]);
            j++;
        }
    }
}
