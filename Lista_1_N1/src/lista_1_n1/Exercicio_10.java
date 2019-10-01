/*
10. Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A
fórmula de conversão de temperatura a ser utilizada é C = (F – 32) * 5 / 9, em que a
variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus
Celsius.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_10 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float c , f ;
        System.out.println("Apresente a temperatura em graus Fahrenheita ser convertida :");
        f = entrada.nextFloat();
        c = (f - 32) * 5/9;
        System.out.println("A temperatura oferida em fahrenheit e de :"+f+"'F ,"+"E sua conversao em Celcius e igual a :"+c+"'C");
    }
}
