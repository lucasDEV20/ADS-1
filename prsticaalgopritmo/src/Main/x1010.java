/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class x1010 {
    public static void main(String[] args) {
    Scanner calculo = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("8,00");
    int codigo1 , peca1 ;
    int codigo2 , peca2 ;
    double valor1 , valor2 , valor;
    
    codigo1 = calculo.nextInt();
    peca1   = calculo.nextInt();
    valor1   = calculo.nextDouble();
    codigo2 = calculo.nextInt();
    peca2   = calculo.nextInt();
    valor2  = calculo.nextDouble();
    
    valor = peca1 * valor1 + peca2 * valor2;
    
    System.out.println("VALOR A PAGAR: R$ " + df.format(valor));
    
    }
     
}
