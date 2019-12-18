
import java.util.Scanner;

public class Main {

    static int c1[][] = new int[10][10];
    static int conta_vendas, ContaMeia, ContaCheia;
    static double caixa, meia, cheia, valorAPagar;
    static double valor = 25.00;

    public static void main(String[] args) {//class principal , este metodo sera responsavel por integrar as partes 
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("BEM VINDO AO SISTEMA JEL");
        System.out.println("------------------------------------------------------------------");
        System.out.println("GUIA DE FLUXO");
        System.out.println("------------------------------------------------------------------");
        System.out.println(""
                + "* Entrada e Escolha do Lugar *\n"
                + "* Escolha do Filme *\n"
                + "* Inserir Sala *\n"
                + "* Escolha da Seção *\n"
                + "* Consulta de Lugar *\n"
                + "* Relatorio de Vendas *");
        System.out.println("------------------------------------------------------------------");
        System.out.println();

        iniciavenda();//vai dar entrada na escolha de entrada (meia e inteira)
        filmes();//vai escolher o filme 
        sala(); //vai dar as opçoes de sala
        seçao();//vai mostrar as sessoes
        consultar();//vai consultar o lugar
        relatorio();//vai mostrar as vendas obtidas

    }
// 2° - TELA DE PROCESSAMENTO DA VENDAS ========================================

    public static void iniciavenda() { //aqui e aonde a venda e escolha de entrada(meia e inteira) aocontece
        Scanner input = new Scanner(System.in);
        int coluna = 0;
        String linha = null;
        int entrada, ContaEntrada, EntradaColuna;
        ContaEntrada = 0;
        do {
            System.out.println("------------------------------------------------------------------");
            System.out.println("-------------------------- ENTRADA -------------------------------");
            System.out.println("------------------------------------------------------------------");
            System.out.println("[1] Meia Entrada ou [2] Inteira :: ");
            System.out.println();
            entrada = input.nextInt();
            System.out.println("------------------------------------------------------------------");
            System.out.println("");

//----------    VALOR DA MEIA ENTRADA ------------------------------------------
            if (entrada == 1) {
                meia = valor - (valor * .50);
                ContaMeia++;
                System.out.printf("Valor da meia entrada R$ %.2f Quantidade: %d%n", meia, ContaMeia);
                System.out.println();

                System.out.println("------------------------------------------------------------------");
                System.out.println("------------------------ ESCOLHA DO LUGAR ------------------------");
                System.out.println("------------------------------------------------------------------");
                System.out.println("\nDigite a linha desejada: ");
                System.out.println("[A B C D E F G H I J]: ");
                System.out.println("------------------------------------------------------------------");
                linha = input.next().toLowerCase();

                do {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Digite a coluna desejada: ");
                    System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
                    System.out.println("------------------------------------------------------------------");
                    EntradaColuna = input.nextInt();
                    consultar();

                    if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                        coluna = EntradaColuna;
                        vetores(linha.charAt(0), coluna);
                    } else {

                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Valor invalido. Venda Cancelada. favor tentar novamente...");
                        System.out.printf("%.2f", meia);
                        System.out.println("------------------------------------------------------------------");
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

                System.out.println("------------------------------------------------------------------");
                System.out.println("------------------------- ESCOLHA DO LUGAR -----------------------");
                System.out.println("------------------------------------------------------------------");
                System.out.println("\nDigite a linha Cadeira: ");
                System.out.println("[A B C D E F G H I J]: ");
                linha = input.next().toLowerCase();
                System.out.println("------------------------------------------------------------------");
                do {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Digite a coluna desejada: ");
                    System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
                    EntradaColuna = input.nextInt();
                    System.out.println("------------------------------------------------------------------");
                    consultar();
                    if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                        coluna = EntradaColuna;

                        vetores(linha.charAt(0), coluna);
                    } else {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Valor invalido, favor tentar novamente...");
                        System.out.println("------------------------------------------------------------------");
//                        valor -= valor;
                        ContaCheia--;
                    }
                } while (EntradaColuna >= 10 && EntradaColuna <= 0);
            }
            // Conta todas as entradas
            ContaEntrada++;

        } while (entrada != 1 && entrada != 2);

    }

    // 3° - TELA DE PROCESSAMENTO DO RELATORIO
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

    // OPÇÃO 3:
    //      4° - PROCESAMENTO DA CONSULTA
    //      verificar as cadeiras Livres.
    public static void consultar() {
        Scanner entrada = new Scanner(System.in);
        int menu;
        System.out.println();

        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------- CONSULTA LUGAR -------------------------");
        System.out.print("------------------------------------------------------------------\n");
        System.out.println("Consultar Lugares :"
                + "\n1 - NAO MOSTRAR \n"
                + "2 - MOTRAR\n");
        menu = entrada.nextInt();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
        switch (menu) {
            case 1:
                System.out.println("Proseguindo a Operação");
                break;
            case 2:
                System.out.println("------------------------------------------------------------------");
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
                System.out.println("------------------------------------------------------------------");
                break;
        }
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
                System.out.println("----------------------------------");
                System.out.println("----->   ESPAÇO VENDIDO    <------");
                System.out.println("----------------------------------");
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.println("----->   ESPAÇO RESERVADO  <------");
                System.out.println("----------------------------------");
                break;
            default:
        }

    }
// --------------------------------- FILMES ---------------------------------
//===========================================================================

    public static void filmes() {
        Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int t = 0;
        //variavel que vai dar o rumo a escolha do filme
        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao = null;
        //variavel que  vai contar os filmes escolhidos
        int cont_filme1, cont_filme2, cont_filme3;
        //inicializando variavel dos cont
        cont_filme1 = cont_filme2 = cont_filme3 = 0;
        System.out.println("--------------------------------- ESCOLHER FILME ---------------------------------");
        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("-------------------------------------------------");
                System.out.println("ESCOLHA O FILME ABAIXO:\n"
                        + "A partir das opções aseguir :\n"
                        + "-------------------------------------------------\n"
                        + "(1) Dora Aventureira.    \n"
                        + "(2) O Morto não Fala.    \n"
                        + "(3) A Odiseia dos Tolos.  \n"
                        + "-------------------------------------------------\n");
                filme = input.nextInt();

                //opçoes de filme
                System.out.println();
                switch (filme) {
                    case 1:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 1. ");
                        System.out.println(" (1) Dora Aventureira.  ");
                        System.out.println("-------------------------------------------------");
                        cont_filme1++;
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 2. ");
                        System.out.println(" (2) O Morto Não Fala. ");
                        System.out.println("-------------------------------------------------");
                        cont_filme2++;
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 3. ");
                        System.out.println(" (1) A Odiseia Dos Tolos. ");
                        System.out.println("-------------------------------------------------");
                        cont_filme3++;
                        break;

                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Filme inválido! ");
                        System.out.println(" Por favor tente novamente 1");
                        System.out.println("-------------------------------------------------");
                        t++;
                }

                break;

            } while (filme != 1 || filme != 2 || filme != 3);
            System.out.println("-------------------------------------------------");
            System.out.println("Total de Filmes Escolidos\n");
            System.out.println(" O Publico de Dora Aventureira foi :  " + cont_filme1);
            System.out.println(" O Publico de O Morto Não Fala foi :  " + cont_filme2);
            System.out.println(" O Publico de A Odiseia Dos Tolos  :  " + cont_filme3);

            System.out.println("-------------------------------------------------");
            if (t == 3) {
                System.out.println("-------------------------------------------------");
                System.out.println("Seu número de tentativas acabaram");
                System.out.println("-------------------------------------------------");
                break;
            }

            input.nextLine();
            System.out.println("-------------------------------------------------");
            System.out.print("Deseja continuar : [s] - Sim [n] - Não\n");
            System.out.println("-------------------------------------------------");
            opcao = input.nextLine();

            while (opcao.equalsIgnoreCase("s")) {
                iniciavenda();
                break;
            }

        } while (opcao.equalsIgnoreCase("s"));

        System.out.println("-------------------------------------------------");
        System.out.println(" O Total de Filmes Asistidos foi de : " + (cont_filme1 + cont_filme2 + cont_filme3));
        System.out.println("-------------------------------------------------");

    }

    public static void sala() {
        //Inicio da variavel do menu
        int menu = 0;
        //opcao de saida
        String opcao;
        //tentativas
        int t = 0;
        //contadores da sala
        int cont_sala1, cont_sala2, cont_sala3;
        cont_sala1 = cont_sala2 = cont_sala3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------- ESCOLHER SALA----------------------------");
        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("POR FAVOR INFORME A SALA :");
                System.out.println(""
                        + "SALA 1 - Dora Aventureira -\n"
                        + "SALA 2 - O Morto Não Fala -\n"
                        + "SALA 3 - A Odiseia Dos Tolos -\n");
                menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Você Escolheu a Sala 1");
                        System.out.println("------------------------------------------------------------------");
                        cont_sala1++;
                        break;
                    case 2:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Você Escolheu a Sala 2");
                        System.out.println("------------------------------------------------------------------");
                        cont_sala2++;
                        break;
                    case 3:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Você Escolheu a Sala 3");
                        System.out.println("------------------------------------------------------------------");
                        cont_sala3++;
                        break;
                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Sala Inválida! ");
                        System.out.println(" Por favor tente novamente ");
                        System.out.println("-------------------------------------------------");
                        t++;
                }
                break;

            } while (menu != 1 || menu != 2 || menu != 3);

            if (t == 3) {
                System.out.println("-------------------------------------------------");
                System.out.println("Seu número de tentativas acabaram");
                System.out.println("-------------------------------------------------");
                break;

            }

            input.nextLine();
            System.out.println("-------------------------------------------------");
            System.out.print("Deseja continuar : [s] - Sim [n] - Não\n");
            System.out.println("-------------------------------------------------");
            opcao = input.nextLine();

            while (opcao.equalsIgnoreCase("s")) {
                iniciavenda();
                filmes();
                break;
            }
        } while (opcao.equalsIgnoreCase("s"));
        System.out.println("-------------------------------------------------");
        System.out.println("Total de Filmes Escolidos\n");
        System.out.println(" O Publico da Sala 1  foi :  " + cont_sala1);
        System.out.println(" O Publico da Sala 2  foi :  " + cont_sala2);
        System.out.println(" O Publico da Sala 3  foi :  " + cont_sala3);
        System.out.println(" O Total das Salas Foi de : " + (cont_sala1 + cont_sala2 + cont_sala3));
        System.out.println("-------------------------------------------------");

    }

    public static void seçao() {
        //variavel que da rumo ao meno de escolha da seçao
        int menu = 0;
        //vaeiavel que da a opçao de saida
        String opcao;
        int t = 0;
        //variavel de tentativa de errro 
        int cont_seçao1, cont_seçao2, cont_seçao3;
        //inicializando cntadores de seçao
        cont_seçao1 = cont_seçao2 = cont_seçao3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------- ESCOLHER SEÇAO -------------------------------");
        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("------------------------------------------------------------------");
                System.out.println("POR FAVOR ESCOLHA A SEÇÃO :");
                System.out.println(""
                        + "1 - MANHA\n"
                        + "2 - TARDE\n"
                        + "3 - NOITE\n");
                menu = input.nextInt();
                System.out.println("------------------------------------------------------------------");
                switch (menu) {
                    case 1:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Você esclheu a Seção da Manha");
                        cont_seçao1++;
                        System.out.println("------------------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Você esclheu a Seção da Tarde");
                        System.out.println("------------------------------------------------------------------");
                        cont_seçao2++;
                        break;
                    case 3:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Você esclheu a Seção da Noite");
                        System.out.println("------------------------------------------------------------------");
                        cont_seçao3++;
                        break;
                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Seção Inválida! ");
                        System.out.println(" Por favor tente novamente ");
                        System.out.println("-------------------------------------------------");
                        t++;
                }
                break;

            } while (menu != 1 || menu != 2 || menu != 3);

            if (t == 3) {
                System.out.println("-------------------------------------------------");
                System.out.println("Seu número de tentativas acabaram");
                System.out.println("-------------------------------------------------");
                break;

            }

            input.nextLine();
            System.out.println("-------------------------------------------------");
            System.out.print("Deseja continuar : [s] - Sim [n] - Não\n");
            System.out.println("-------------------------------------------------");
            opcao = input.nextLine();
            while (opcao.equalsIgnoreCase("s")) {
                iniciavenda();
                filmes();
                sala();
                break;
            }

        } while (opcao.equalsIgnoreCase("s"));
        System.out.println("-------------------------------------------------");
        System.out.println("Total de Filmes Escolidos\n");
        System.out.println(" O Publico da Manha foi :  " + cont_seçao1);
        System.out.println(" O Publico da Tarde foi :  " + cont_seçao2);
        System.out.println(" O Publico da Noite foi  :  " + cont_seçao3);
        System.out.println(" O Total do Publico Entre a Seções Foi : " + (cont_seçao1 + cont_seçao2 + cont_seçao3));
        System.out.println("-------------------------------------------------");

    }

}
