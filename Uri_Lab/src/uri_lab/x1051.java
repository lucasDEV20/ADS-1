/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.



Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 */

package uri_lab;
import java.util.Scanner;
public class x1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //variaveis
        double salario , aliqueta1 , aliqueta2 ,aliqueta3 , imposto , diferença;
        //iniciando variavel
        aliqueta1 = 0.08;
        aliqueta2 = 0.18;
        aliqueta3 = 0.28;
        imposto = 0;
        //entrada de dados
        salario = entrada.nextDouble();
        if (salario <= 2000) {
            imposto = 0 ;
        }else if (salario > 2000 && salario <= 3000){
            diferença = (salario - 2000);
            imposto = diferença * aliqueta1;       
        }else if (salario > 3000 && salario <= 4500){
            imposto = 1000 * aliqueta1;
            diferença = (salario - 3000);
            imposto = imposto + (diferença * aliqueta2);
        }else{
            imposto = (1000 * aliqueta1) + (1500 * aliqueta2);
            diferença = salario - 4500;
            imposto = imposto + (diferença * aliqueta3);
        }if (imposto <= 0 ) {
            System.out.printf("Isento\n",imposto);
        }else{
            System.out.printf("R$ %.2f\n",imposto);
        }
    }
}
