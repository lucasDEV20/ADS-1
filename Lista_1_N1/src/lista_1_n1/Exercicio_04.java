 /*
4 Escreva um programa que leia dois números inteiros e
imprima a seguinte saída, com os valores calculados, 
sabendo que o primeiro número informado será o
dividendo e o segundo, o divisor: 
Dividendo =  
Divisor =  
Quociente =  
Resto = 
*Obs. Para obter o resto de uma divisão utilize o operador %. 

 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_04 {
public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
int num1 , num2 , dividendo , divisor , coeficiente , resto ;
  System.out.println(" Insira o primeiro numero ");
  num1 = entrada.nextInt();
  System.out.println(" Insira o segundo numero  ");
num2 = entrada.nextInt();
     dividendo = num1;
     divisor   = num2;
     coeficiente = dividendo/divisor;
     resto = dividendo%divisor;
     System.out.println("O dividendo e "+dividendo+" e o seu divisor e "+divisor+" e o coeficiente e "+coeficiente+" e p seu resto e "+resto);
    
    }
    
}
