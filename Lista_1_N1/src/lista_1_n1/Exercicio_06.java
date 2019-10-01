/*

 */

package lista_1_n1;


import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio_06 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    DecimalFormat ds = new DecimalFormat("$#0,000");
    float salariopessoa , salariominimo , quantsalario;
        System.out.println(" Informe o salrio do usuario ");
        salariopessoa = entrada.nextFloat();
        System.out.println(" O salario do usuario e "+ salariopessoa+ "  , qual e o valor do salario minimo atual ?");
        salariominimo = entrada.nextFloat();
        
        quantsalario = salariopessoa/salariominimo;
        
        System.out.println(" O usuario recebe "+quantsalario+" , salarios minimos");
    
    }
    
}
