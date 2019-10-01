/*
 Crie um algoritmo que exiba um cardápio com as opções: 1: Pizza, 2: Picanha e 3: Peixe
 Frito. Ao selecionar uma das opções:1, 2 e 3 deverá exibir a mensagem: “Opção (número) :
 (nome do prato), pedido realizado com sucesso”.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_35 {

    public static void main(String[] args) {
        Scanner pedido = new Scanner(System.in);
        char menu;
        System.out.println();
        System.out.println("========================================");
        System.out.println("\nFAST FOOD DIFERENCIADO\n");
        System.out.println("\nESCOLHA UMA DAS OPÇOES\n");
        System.out.println("- (1) - Pizza -");
        System.out.println("- (2) - Picanha - ");
        System.out.println("- (3) - peixe -");
        System.out.println("- (4) - sair -");
        System.out.println("=========================================");
        menu = pedido.next().toLowerCase().charAt(0);
        System.out.println();

        switch (menu) {
            case '1':
                System.out.println();
                System.out.println("\nVoce escolheu a opçao PIZZA\n ");
                System.out.println("\npedido realizado com sucesso\n");
                System.out.println("\nObrigada por utilizar nossos serviços\n");
                System.out.println("=========================================");
                System.out.println();
                break;
            case '2':
                System.out.println();
                System.out.println("\nVoce escolheu a opçao PICANHA\n ");
                System.out.println("\npedido realizado com sucesso\n");
                System.out.println("\nObrigada por utilizar nossos serviços\n");
                System.out.println("=========================================");
                System.out.println();
                break;
            case '3':
                System.out.println();
                System.out.println("\nVoce escolheu a opçao PEIXE FRITO\n ");
                System.out.println("\npedido realizado com sucesso\n");
                System.out.println("\nObrigada por utilizar nossos serviços\n");
                System.out.println("=========================================");
                System.out.println();
                break;
            case '4':
                System.out.println();
                System.out.println("\nsaindoooooooooooooooooooooooooooooooooooooo\n");
                System.out.println("\nObrigada por utilizar nossos serviços\n");
                System.out.println("=========================================");
                System.out.println();
                break;
            default:
                System.out.println();
                System.out.println("OPÇAO INVALIDA");
                System.out.println("FAVOR TENTAR NOVAMENTE+");
                System.out.println("=========================================");
                System.out.println();
        }
    }
}
