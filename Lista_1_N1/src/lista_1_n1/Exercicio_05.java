/*
5 Escreva um programa que receba a base e a altura de um retângulo. 
Em seguida, calcule e imprima a área e o perímetro do retângulo. 
Obs. Fórmulas: 
Área = base * altura; 
Perímetro = 2*base + 2*altura; 
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_05 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int area , base , altura , perimetro ;
        System.out.println("Informe a base : ");
        base = entrada.nextInt();
        System.out.println("Informe a altura : ");
        altura = entrada.nextInt();
    area = base * altura ;
    perimetro = 2 * base + 2 * altura;
    System.out.println("a area do retangulo e igual a "+area+" , e seu perimetro e "+perimetro);
    
    
    
    }
}
