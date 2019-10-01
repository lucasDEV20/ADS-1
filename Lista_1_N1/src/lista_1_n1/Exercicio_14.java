/*
Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores
recebe, mensalmente, um salário fixo (que representa 2*salarioMinimo) mais a
comissão. Essa comissão é calculada em relação ao número de televisores vendidos por
mês de cada um dos tipos de TV, obedecendo as seguintes especificações:
TV LCD R$ 50,00 de comissão por unidade vendida
TV LED R$ 60,00 de comissão por unidade vendida
TV Plasma R$ 75,00 de comissão por unidade vendida
 */
package lista_lab_101;
import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);    
    String nome ;
    float salario ,  tvlcd , tvled  , tvplasma , comissao , salariocomissao;
        System.out.println("insira o nome do vendedor :");
        nome = entrada.nextLine();
        System.out.println("insira o salario de "+nome);
        salario = entrada.nextFloat();
        System.out.println("insira o numero de tvs LCD vendidas por "+nome);
        tvlcd = entrada.nextFloat();
        System.out.println("insira o numero de tvs LED vendidas por "+nome);
        tvled = entrada.nextFloat();
        System.out.println("insira o numero de tvs PLASMA vendidas por "+nome);
        tvplasma = entrada.nextFloat();
        
        tvlcd = 50;
        tvled = 60;
        tvplasma = 75;
        salariocomissao = salario  + (tvlcd = 50) + (tvled = 60) + (tvplasma = 75);
        System.out.println("o salario total de "+nome+" e igual a "+salariocomissao+"R$");
         }     
             
             }
