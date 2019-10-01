/*
 2. Escreva um programa que leia o nome e a idade de uma pessoa e imprima:
 “O usuário *Nome* informou que tem *idade* anos”. 
 */

 package lista_1_n1;
import java.util.Scanner;
 public class Exercicio_02 {
public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
String  nome ;  
 int  idade;
    System.out.println(" Insira seu nome ");
    nome = entrada.nextLine();
    System.out.println(nome + " Insira a sua idade :");
    idade = entrada.nextInt();
    System.out.println("O usuario " +nome+ " informou que tem a idade " + idade +".");
    }
   
}
