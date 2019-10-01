/*
Escreva um programa que leia um valor de hora e informe quantos minutos se passaram
desde o início do dia.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_23 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int hora , minutos;
        System.out.println("digite que horas sao : ");
        hora = entrada.nextInt();
        minutos = hora * 60;
        System.out.println("as horas em minutos sao : "+minutos+" min");
         
    }
    
}
