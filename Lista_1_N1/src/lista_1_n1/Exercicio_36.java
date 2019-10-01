/*
 36. Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir. Escreva um
 programa que leia o valor da compra e imprima o valor da venda do produto.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_36 {

    public static void main(String[] args) {
        Scanner venda = new Scanner(System.in);
        float valor_compra, valor_venda;
        System.out.println();
        System.out.println("insira o valor da compra ");
        valor_compra = venda.nextFloat();
        System.out.println();
        if (valor_compra < 10.0) {
            valor_venda = (valor_compra * 70);
        }
        if (valor_compra <= 10.0 && valor_compra < 30.00) {
            valor_venda = (valor_compra * 50);
        }
        if (valor_compra <= 30.00 && valor_compra < 50.00) {
            valor_venda = (valor_compra * 40);

        } else {
            valor_venda = (valor_compra * 30);

        }
        System.out.println("o valor e " + valor_venda);
    }
}


