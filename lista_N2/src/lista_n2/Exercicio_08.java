/*
 8. Escrever um programa que calcule todos os números inteiros divisíveis por um certo
 valor indicado pelo usuário, e compreendidos em um intervalo também especificado
 pelo usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e
 após ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
 Usar o comando While. Exemplo: Valor do divisor: 3; Inicio do Intervalo: 17; Fim do
 Intervalo: 29; Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.
 */
package lista_n2;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num_divisor = 0,opc = 0 , intervalo = 0, valor_inicial_intervalo = 0, valor_final_intervalo = 0, cont = 0;

        while (valor_inicial_intervalo <= valor_final_intervalo) {
            System.out.println("Favaor informar o valor do divisor ");
            num_divisor = entrada.nextInt();
            if (num_divisor == 0) {
                System.out.println("numero invalido");
            }
            System.out.println("informe o valor inicial do intervalo");
            valor_inicial_intervalo = entrada.nextInt();
            if (valor_inicial_intervalo <= valor_final_intervalo) {
                System.out.println("o valor inicila nao pode ser igual ao final");
            }
            System.out.println("informe o valor final do intervalo ");
            valor_final_intervalo = entrada.nextInt();
            if (valor_final_intervalo <= valor_inicial_intervalo) {
                System.out.println("o valor final nao pode ser igual o inicial");
            }
        }
        while (valor_final_intervalo <= valor_inicial_intervalo) {
            if (valor_inicial_intervalo % num_divisor == 0) {
                cont++;

            }
            System.out.println("Deseja continuar? (1- Sim / 0- Nao): ");
			opc = entrada.nextInt();
			while(opc != 0 && opc != 1)
			{
				System.out.println("Opção inválida, digite apenas 0 ou 1: ");
				opc = entrada.nextInt();
			}
        }
        System.out.println();
        System.out.println("numeros divididos por " + num_divisor + " no intervalo  de " + valor_inicial_intervalo + "a" + valor_final_intervalo);

    }

}
