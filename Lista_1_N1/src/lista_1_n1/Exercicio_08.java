/*
8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que a percentagem do distribuidor seja de 12% do preço de fábrica e os impostos de
30% do preço de fábrica, faça um programa para ler o custo de fábrica de um carro e
imprimir o custo ao consumidor.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_08 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);    
    double custodefabrica , custoconsumidor , porcimposto = 30;
    double porcconsumidor , distribuidor , valorimposto ,porcdistribuidor = 0;
        System.out.println("Informe o custo de fabrica do carro :");
        custodefabrica = entrada.nextDouble();
        distribuidor =  ((custodefabrica * porcdistribuidor) / 12);
        valorimposto = (custodefabrica * porcimposto) /30;
        custoconsumidor = distribuidor + valorimposto ;
        
       
 
     
 
        System.out.println("O custo ao consumidor de um carro novo é: " + custoconsumidor);
    }
    

}
