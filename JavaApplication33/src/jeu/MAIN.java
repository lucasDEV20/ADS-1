/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class MAIN {

    //variaveis statics do metodo de vendas
    static int c1[][] = new int[10][10];
    static int limpar[][] = new int[10][10];
    static int conta_vendas, ContaMeia, ContaCheia;
    static double caixa, meia, cheia, valorAPagar;
    static double valor = 25.00;
    static int filme;
    static int seçao;
    static int entrada;
    static String linha;
    static int EntradaColuna;
    static int coluna;

    public static void main(String[] args) {//este metodo tem a funçao de mostrar o menu 
        //alem de ser o metodo principal
        menu_a();

    }

    public static void seçao() {//metodo escolha de seçoes
        //variavel que da rumo ao meno de escolha da seçao
//        int seçao;
        //varivel de letura da sseçao

        Scanner input = new Scanner(System.in);

        System.out.println("=========================== ESCOLHER SESSÃO ===============================");
        System.out.println("POR FAVOR ESCOLHA A SESSÃO :");
        System.out.println("\n"
                + "1 - MANHA - 10:15\n"
                + "2 - TARDE - 14:30\n"
                + "3 - NOITE - 20;45\n");
        System.out.println("==========================================================================");

        boolean invalido;
        do {
            invalido = true;
            try {
                System.out.println();
                seçao = Integer.parseInt(input.nextLine());
                invalido = false;

            } catch (Exception e) {
                System.err.println("Por favor, digite apenas números!");
                seçao();
            }
        } while (invalido);

        //variavel que le seçao
        switch (seçao) {
            case 1:
                System.out.println();
                System.out.println("===================");
                System.out.println(" 1 - MANHA - 10:15 ");
                System.out.println("===================");
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("===================");
                System.out.println(" 2 - TARDE - 14:30 ");
                System.out.println("===================");
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("===================");
                System.out.println(" 3 - NOITE - 20;45 ");
                System.out.println("===================");
                System.out.println();
                break;
            default:
                System.err.println("===================");
                System.err.println("Opção invalida !");
                System.err.println("===================");
                seçao();

        }
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("A sessão escolhida foi : ");
        System.out.print(seçao);
        System.out.println("\n===================================================================");
        System.out.println();
    }

    public static void filmes() {//metodo da escolha dos filmes e sala de cada filme 
        Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int t = 0;
        //variavel que vai dar o rumo a escolha do filme
//        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao;
        System.out.println("=========================== ESCOLHER FILME ==============================");

        do {//loop das escolhas de filme
            System.out.println("==================================================================");
            System.out.println("ESCOLHA O FILME ABAIXO:\n"
                    + "A partir das opções aseguir :\n"
                    + "==================================================================\n"
                    + "(1) Dora Aventureira , sera exibido na sala 1.    \n"
                    + "(2) O Morto não Fala , sera exibido na sala 2    \n"
                    + "(3) A Odiseia dos Tolos , sera exibido na sala3 3  \n"
                    + "==================================================================\n");

            //variavel que le filme 
            boolean invalido;
            do {
                invalido = true;
                try {
                    System.out.println();
                    filme = Integer.parseInt(input.nextLine());
                    invalido = false;

                } catch (Exception e) {
                    System.err.println("Por favor, digite apenas números!");
                    filmes();
                }
            } while (invalido);
            //opçoes de filme
            System.out.println();
            switch (filme) {
                case 1:
                    System.out.println("==================================================================");
                    System.out.println(" Você escolheu o filme 1. ");
                    System.out.println(" (1) Dora Aventureira.  ");
                    System.out.println(" Que sera exibido na Sala 1");
                   

                    break;
                case 2:
                    System.out.println("==================================================================");
                    System.out.println(" Você escolheu o filme 2. ");
                    System.out.println(" (2) O Morto Não Fala. ");
                    System.out.println(" Que sera exibido na Sala 12");
                  

                    break;
                case 3:
                    System.out.println("==================================================================");
                    System.out.println(" Você escolheu o filme 3. ");
                    System.out.println(" (1) A Odiseia Dos Tolos. ");
                    System.out.println(" Que sera exibido na Sala 2");
                   

                    break;

                default:
                    System.err.println("==================================================================");
                    System.err.println(" Filme inválido! ");
                    System.err.println(" Por favor tente novamente 1");
                    System.err.println("Este filme Não esta alocado a nenhuma sala do cinema ");
                    
                    t++;
                    filmes();
            }

            break;

        } while (filme != 1 || filme != 2 || filme != 3);

        
        if (t == 3) {
            System.err.println("=================================================");
            System.err.println("Seu número de tentativas acabaram");
            System.err.println("=================================================");

        }

    }

    public static void iniciavenda() { //aqui e aonde a venda e escolha de entrada(meia e inteira) aocontece
        Scanner input = new Scanner(System.in);
//        int coluna = 0;
//        String linha = null;
//        int /*entrada ,*/ , EntradaColuna;
        int ContaEntrada;
        ContaEntrada = 0;
        do {
            
            System.out.println("========================== ENTRADA ===============================");
            System.out.println("==================================================================");
            System.out.println("[1] Meia Entrada ou [2] Inteira :: ");
            System.out.println();
            boolean invalido;
            do {
                invalido = true;
                try {
                    System.out.println();
                    entrada = Integer.parseInt(input.nextLine());
                    invalido = false;

                } catch (Exception e) {
                    System.err.println("Por favor, digite apenas números!");
                    filmes();
                }
            } while (invalido);
            //leitura de entrada
            System.out.println("==================================================================");
            System.out.println("");
            limpar();

            
//----------    VALOR DA MEIA ENTRADA ------------------------------------------
            if (entrada == 1) {
                meia = valor - (valor * .50);
                ContaMeia++;
                System.out.printf("Valor da meia entrada R$ %.2f Quantidade: %d%n", meia, ContaMeia);
                System.out.println();

                System.out.println("===========================================================");
                System.out.println("===================== ESCOLHA DO LUGAR ====================");
                System.out.println("===========================================================");
                System.out.println("\nDigite a linha desejada: ");
                System.out.println("[A B C D E F G H I J]: ");
                System.out.println("===========================================================");
                linha = input.next().toLowerCase();

                do {
                    System.out.println("===========================================================");
                    System.out.println("Digite a coluna desejada: ");
                    System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
                    System.out.println("===========================================================");
                   do {
                        invalido = true;
                        try {
                            input.nextLine();
                            EntradaColuna = Integer.parseInt(input.nextLine());
                            invalido = false;

                        } catch (Exception e) {
                            System.err.println("Por favor, digite apenas números!");
                            filmes();
                        }
                    } while (invalido);

                    if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                        coluna = EntradaColuna;
                        vetores(linha.charAt(0), coluna);
                    } else {

                        System.err.println("===========================================================");
                        System.err.println("Valor invalido. Venda Cancelada. favor tentar novamente...");
                        System.err.printf("%.2f", meia);
                        System.err.println("===========================================================");
                        ContaMeia--;
                    }

                } while (EntradaColuna >= 10 && EntradaColuna <= 0);

            } // VALOR DA ENTRADA CHEIA;
            else if (entrada == 2) {
                valorAPagar = valor;
                ContaCheia++;
                System.out.printf("Valor da Inteira R$ %.2f Quantidade: %d%n", valorAPagar, ContaCheia);
//                System.out.printf("teste do valor: R$ %.2f%n", valor);
//                System.out.printf("teste valor Cheia: R$ %.2f%n", valorAPagar);
                System.out.println();

                System.out.println("===========================================================");
                System.out.println("===================== ESCOLHA DO LUGAR ====================");
                System.out.println("===========================================================");
                System.out.println("\nDigite a linha Cadeira: ");
                System.out.println("[A B C D E F G H I J]: ");
                linha = input.next().toLowerCase();
                System.out.println("===========================================================");

                do {
                    System.out.println("===========================================================");;
                    System.out.println("Digite a coluna desejada: ");
                    System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
                    System.out.println("===========================================================");

                    do {
                        invalido = true;
                        try {
                            input.nextLine();
                            EntradaColuna = Integer.parseInt(input.nextLine());
                            invalido = false;

                        } catch (Exception e) {
                            System.err.println("Por favor, digite apenas números!");
                            filmes();
                        }
                    } while (invalido);

                    if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                        coluna = EntradaColuna;

                        vetores(linha.charAt(0), coluna);
                    } else {
                        System.err.println("===========================================================");
                        System.err.println("Valor invalido, favor tentar novamente...");
                        System.err.println("===========================================================");
//                        valor -= valor;
                        ContaCheia--;
                    }
                } while (EntradaColuna >= 10 && EntradaColuna <= 0);
            }

            // Conta todas as entradas
            ContaEntrada++;

        } while (entrada != 1 && entrada != 2);

    }

    public static void consultar() {

        System.out.println();

        System.out.println("===========================================================");
        for (int i = 0; i < 10; i++) {                  // para cada linha
            for (int j = 0; j < c1.length; j++) {       //para cada coluna da linha

                System.out.print("[");                  // Inicia a impressao do lugar
                if (c1[i][j] == 0) {                    // testa se está livre
                    // imprime o número da cadeira livre
                    System.out.print((char) ('A' + i) + "" + j);
                } else {
                    // Como não está livre, imprime dois espacos em branco
                    System.out.print("  ");
                }
                // Finaliza a impressao do lugar e acrescenta dois espaços para separar um lugar do outro
                System.out.print("]  ");
            }
            // Pula uma linha para a nova fileira de cadeiras
            System.out.println();
        }
        System.out.println("===========================================================");

    }

    public static void relatorio() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("---------------------- RELATÓRIO DE VENDAS -----------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total de Ingressos Vendidos: " + conta_vendas);
        System.out.printf("Total em Reais: R$ %.2f%n", caixa);

//        System.out.printf("Total em meia Entrada: R$ %.2f%n", meia);
        System.out.println("******************************************************************");
        System.out.println("VALOR DA MEIA ENTRADA:");
        System.out.printf("JOEL - Valor da meia entrada R$ %.2f \t\tQuantidade: %d%n", meia * ContaMeia, ContaMeia);
        System.out.println("------------------------------------------------------------------");

        System.out.println("\nVALOR DA INTEIRA");
        System.out.printf("V1alor a pagar: R$ %.2f \t\t\tQuantidade: %d%n", valorAPagar, ContaCheia);
        System.out.println("------------------------------------------------------------------");

        System.out.println("SOMA TOTAL = MEIA + INTEIRA:");
        System.out.printf("Valor a Pagar: R$ %.2f \t\t\tQuantidades: %d%n", valorAPagar + (meia * ContaMeia), ContaMeia + ContaCheia);
        System.out.println("------------------------------------------------------------------");

        System.out.println("\nRelação de Poltronas Vendidas: ");
        for (int linha = 0; linha < c1.length - 1; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (c1[linha][coluna] != 0) {
                    System.out.println("Cadeira [" + (char) ('A' + linha) + "" + coluna + "] vendida.");
                }
            }
        }
        System.out.println("");
        System.out.println("******************************************************************");

    }

    public static void vetores(char linha, int col) {
        int lin = (int) linha - 'a';
//            lin = (int) linha - 'A';

        switch (c1[lin][col]) {
            case 0:
                if (lin <= 9) {
                    System.out.println(lin);
//                    double preco = meia;
                    System.out.println("Posição livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("=   VENDA EFETUADA COM SUCESSO   =");
                    System.out.println("----------------------------------");
                    caixa = caixa + meia;
                    conta_vendas++;

                } else if (col >= 10) {
//                    double preco2 = valor;
//                    System.out.println("Posicão livre");
//                    c1[lin][col] = 1;
//                    System.out.println("----------------------------------");
//                    System.out.println("->  VENDA EFETUADA COM SUCESSO  <-");
//                    System.out.println("----------------------------------");
//                    caixa = caixa + valor;
//                    conta_vendas++;
                } else {
//                    double preco2 = valor;
                    System.out.println("Posicão livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("->  VENDA EFETUADA COM SUCESSO  <-");
                    System.out.println("----------------------------------");
                    caixa = caixa + valor;
                    conta_vendas++;
                }
                break;
            case 1:
                System.err.println("----------------------------------");
                System.err.println("----->   ESPAÇO VENDIDO    <------");
                System.err.println("----------------------------------");
                break;
            case 2:
                System.err.println("----------------------------------");
                System.err.println("----->   ESPAÇO RESERVADO  <------");
                System.err.println("----------------------------------");
                break;
            default:
        }

    }

    public static void retorna_menu() {

        menu_a();

    }

    public static void menu_a() {
        Scanner entrada = new Scanner(System.in);
        String opcao;

        int menu_de_açao;
        menu_de_açao = 0;
        System.out.println();
        System.out.println("=====================CINEMA ABC====================");
        System.out.println("DIGITE A OPÇÃO DESEJADA : ");
        System.out.println("\n"
                + "  [1]-SETOR-DE-VENDAS  \n"
                + "  [2]-OBTER RELATORIO UNITARIO  \n"
                + "  [3]-CONSULTA DE DADOS  \n"
                + "  [4]-LIMPAR LUGARES\n"
                + "  [5]-SAIR\n ");

        System.out.println("===================================================");

        boolean invalido;
        do {
            invalido = true;
            try {
                System.out.println();
                menu_de_açao = Integer.parseInt(entrada.nextLine());
                invalido = false;

            } catch (Exception e) {
                System.err.println("Por favor, digite apenas números!");
                menu_a();
            }
        } while (invalido);
        switch (menu_de_açao) {
            case 1:
                System.out.println("[1]-SETOR-DE-VENDAS  ");
                seçao();
                filmes();
                iniciavenda();
                consultar();
                bilhete2();
                retorna_menu();
                break;
            case 2:
                System.out.println("[2]-OBTER RELATORIO UNITARIO  ");
                relatorio();
                cancelar();
                break;
            case 3:
                System.out.println("[3]-CONSULTA DE DADOS  ");
                bilhete();
                cancelar();
                break;
            case 4:
                System.out.println("[4]- LIMPAR LUGARES  ");
                limpar();
                cancelar();
                break;
                case 5:
                System.out.println("[5]-SAIR  ");              
                cancelar();
                break;
                
            default:
                System.err.println("Opção invalida");
                menu_a();

        }

    }

    public static void cancelar() {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        System.out.println("deseja sair ? [s] - sim ou [n] - nao\n");
        resposta = entrada.nextLine().toLowerCase();
        switch (resposta) {
            case "s":
            case "S":
                System.out.println("saindo do programa");
                break;
            case "n":
            case "M":
                menu_a();
                break;
            default:
                System.err.println("Opção invalida !");
                cancelar();
        }

    }

    public static int bilhete() {

        System.out.println("===========================================================");
        System.out.println("========================_BILHETE_==========================");
        System.out.println("===========================================================");

        if (filme == 1) {
            System.out.println("===========================================================");
            System.out.println(" O FILME ESCOLIDO FOI ");
            System.out.println(" (1) Dora Aventureira.  ");
            System.out.println(" Que sera exibido na Sala 1");
            System.out.println("===========================================================");
        }
        if (filme == 2) {
            System.out.println("===========================================================");
            System.out.println(" O FILME ESCOLIDO FOI ");
            System.out.println(" (2) O Morto Não Fala. ");
            System.out.println(" Que sera exibido na Sala 2");
            System.out.println("===========================================================");
        }
        if (filme == 3) {
            System.out.println("===========================================================");
            System.out.println(" O FILME ESCOLIDO FOI ");
            System.out.println(" (1) A Odiseia Dos Tolos. ");
            System.out.println(" Que sera exibido na Sala 3");
            System.out.println("===========================================================");
        }
        if (seçao == 1) {

            System.out.println("======================");
            System.out.println("E SESSÃO ESCOLHIDA FOI ");
            System.out.println(" 1 - MANHA - 10:15 ");
            System.out.println("======================");

        }
        if (seçao == 2) {

            System.out.println("======================");
            System.out.println("E SESSÃO ESCOLHIDA FOI ");
            System.out.println(" 2 - TARDE - 14:30 ");
            System.out.println("======================");

        }
        if (seçao == 3) {

            System.out.println("======================");
            System.out.println("E SESSÃO ESCOLHIDA FOI ");
            System.out.println(" 3 - NOITE - 20;45 ");
            System.out.println("======================");

        }

        if (entrada == 1) {
            System.out.println("A ENTRADA ESCOLHIDA FOI INTEIRA");
        } else {
            System.out.println("A ENTRADA ESCOLHIDA FOI MEIA");
        }
        System.out.println("===========================================================");
        System.out.println("O LUGAR ESCOLIDO FOI :");
        System.out.println("CADEIRA = " + linha + "-" + coluna);
        System.out.println("===========================================================");

        System.out.println();

        System.out.println("===========================================================");
        System.out.println("OBRIGADA PELA PREFERENCIA , O CINE ABC AGRADECE");
        System.out.println("BOM FILME");
        System.out.println("===========================================================");

        System.out.println();

        System.out.println("===========================================================");
        System.out.println("VALOR DA MEIA ENTRADA:");
        System.out.printf("Valor da meia entrada R$ %.2f\n", meia);
        System.out.println("===========================================================");

        System.out.println();

        System.out.println("===========================================================");
        System.out.println("\nVALOR DA INTEIRA");
        System.out.printf("V1alor a pagar: R$ %.2f\n", cheia);
        System.out.println("===========================================================");

        System.out.println();

        System.out.println("===========================================================");
        System.out.println("SOMA TOTAL = MEIA + INTEIRA:");
        System.out.printf("Valor a Pagar: R$ %.2f\n", valorAPagar + (meia + cheia));
        System.out.println("===========================================================");
        return 0;

    }

    public static int bilhete2() {
        Scanner ent = new Scanner(System.in);
        String opçao;
        System.out.println("Deseja ver o bilhete ? [s] - sim e [n] - nao");
        opçao = ent.nextLine();
        if (opçao.equalsIgnoreCase("s")) {

            System.out.println("===========================================================");
            System.out.println("========================_BILHETE_==========================");
            System.out.println("===========================================================");

            if (filme == 1) {
                System.out.println("===========================================================");
                System.out.println(" O FILME ESCOLIDO FOI ");
                System.out.println(" (1) Dora Aventureira.  ");
                System.out.println(" Que sera exibido na Sala 1");
                System.out.println("===========================================================");
            }
            if (filme == 2) {
                System.out.println("===========================================================");
                System.out.println(" O FILME ESCOLIDO FOI ");
                System.out.println(" (2) O Morto Não Fala. ");
                System.out.println(" Que sera exibido na Sala 2");
                System.out.println("===========================================================");
            }
            if (filme == 3) {
                System.out.println("===========================================================");
                System.out.println(" O FILME ESCOLIDO FOI ");
                System.out.println(" (1) A Odiseia Dos Tolos. ");
                System.out.println(" Que sera exibido na Sala 3");
                System.out.println("===========================================================");
            }
            if (seçao == 1) {

                System.out.println("======================");
                System.out.println("E SESSÃO ESCOLHIDA FOI ");
                System.out.println(" 1 - MANHA - 10:15 ");
                System.out.println("======================");

            }
            if (seçao == 2) {

                System.out.println("======================");
                System.out.println("E SESSÃO ESCOLHIDA FOI ");
                System.out.println(" 2 - TARDE - 14:30 ");
                System.out.println("======================");

            }
            if (seçao == 3) {

                System.out.println("======================");
                System.out.println("E SESSÃO ESCOLHIDA FOI ");
                System.out.println(" 3 - NOITE - 20;45 ");
                System.out.println("======================");

            }

            if (entrada == 1) {
                System.out.println("A ENTRADA ESCOLHIDA FOI INTEIRA");
            } else {
                System.out.println("A ENTRADA ESCOLHIDA FOI MEIA");
            }
            System.out.println("===========================================================");
            System.out.println("O LUGAR ESCOLIDO FOI :");
            System.out.println("CADEIRA = " + linha + "-" + coluna);
            System.out.println("===========================================================");

            System.out.println();

            System.out.println("===========================================================");
            System.out.println("OBRIGADA PELA PREFERENCIA , O CINE ABC AGRADECE");
            System.out.println("BOM FILME");
            System.out.println("===========================================================");

            System.out.println();

            System.out.println("===========================================================");
            System.out.println("VALOR DA MEIA ENTRADA:");
            System.out.printf("Valor da meia entrada R$ %.2f\n", meia);
            System.out.println("===========================================================");

            System.out.println();

            System.out.println("===========================================================");
            System.out.println("\nVALOR DA INTEIRA");
            System.out.printf("V1alor a pagar: R$ %.2f\n", cheia);
            System.out.println("===========================================================");

            System.out.println();

            System.out.println("===========================================================");
            System.out.println("SOMA TOTAL = MEIA + INTEIRA:");
            System.out.printf("Valor a Pagar: R$ %.2f\n", valorAPagar + (meia + cheia));
            System.out.println("===========================================================");
            return 0;
        } else {

        }
        return 0;

    }

    public static void limpar() {
        System.out.println("===========================================================");
        System.out.println("====================LUGARES=DISPONIVEIS====================");
    

        System.out.println("===========================================================");
        for (int i = 0; i < 10; i++) {                  // para cada linha
            for (int j = 0; j < limpar.length; j++) {       //para cada coluna da linha

                System.out.print("[");                  // Inicia a impressao do lugar
                if (limpar[i][j] == 0) {                    // testa se está livre
                    // imprime o número da cadeira livre
                    System.out.print((char) ('A' + i) + "" + j);
                } else {
                    // Como não está livre, imprime dois espacos em branco
                    System.out.print("  ");
                }
                // Finaliza a impressao do lugar e acrescenta dois espaços para separar um lugar do outro
                System.out.print("]  ");
            }
            // Pula uma linha para a nova fileira de cadeiras
            System.out.println();
        }
        System.out.println("===========================================================");

    }

}
