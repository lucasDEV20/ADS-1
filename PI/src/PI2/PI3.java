package PI2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PI3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // TODO Auto-generated method stub

        int opçao;
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);
        
        do {
            menu();
            System.out.println("\nInforme a opção desejada: ");
            while (!leia.hasNextInt()) {
                String input = leia.next();
                System.out.println(input + " - Não é um número valido, digite novamente");
            }
            opçao = leia.nextInt();

            switch (opçao) {
                case 0:
                    Sair();
                    break;

                case 1:
                    Exibir_Matriz();
                    break;

                case 2:
                    Matriz_Similaridade();
                    break;

                case 3:
                    Lista_Usuarios_Semelhantes();
                    break;
                case 4:
                    Dominante_Recessiva();
                    break;
            }
        } while (opçao != 0);
    }//implementaçao dos casos do menu

    public static void LeitorArquivo(String[] vetorDNA) {
        // TODO Auto-generated method stub
        String nome = "C:\\Users\\Computador\\Documents\\cadeiasDNA.txt";
        //System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            int i = 0;

            while (linha != null) {

                String[] basesDNA = linha.split(",");

                String palavra = "";

                for (int j = 0; j < basesDNA.length; j++) {
                    palavra = palavra + basesDNA[j];
                }

                //System.out.printf("%s\n", linha);
                //System.out.println(palavra);
                vetorDNA[i] = palavra;
                i++;

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }//leitor do do arquivo com as tabelas de DNA

    public static void imprimeVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Pessoa[" + i + "] = " + vetor[i]);
        }
    }//vai imprimir o vetor das cadeias 

    public static void menu() {
        System.out.println("____________________________________________________");
        System.out.println("                    Menu                       ");
        System.out.println("0 - Sair.");
        System.out.println("1 - Exibir Matriz com as Cadeias de DNA.");
        System.out.println("2 - Computar e exibir a matriz de similaridade.");
        System.out.println("3 - Apresentar Lista de Usuários Semelhantes.");
        System.out.println("4 - Apresentar a Base Dominante e Recessiva.");
        System.out.println("____________________________________________________");
        System.out.println("\nEcolha uma das opções:");
    }//metodo do menu

    public static void Sair() {
        System.out.println("Finalizando...");
    }//opçao de saida do programa

    public static void Exibir_Matriz() {
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);

        System.out.println("____________________________________________________");
        System.out.println("         Opção escolhida           ");
        System.out.println("Exibir Matriz com as Cadeias de DNA");
        System.out.println("\nVetor Cadeias DNA:");
        imprimeVetor(cadeiasDNA);
        System.out.println("");
    }//opçao que vai exibir o id de de cada pesssoa e seu perspectivo DNA

    public static void Matriz_Similaridade() {
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);

        System.out.println("____________________________________________________");
        System.out.println("             Opção escolhida               ");
        System.out.println("Computar e exibir a matriz de similaridade");
        Matriz_LCS();
        System.out.println("");
    }//opçao qie ira demontrar a similaridade das cadeias de DNA

    public static void Matriz_LCS() {
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);

        PI3 lcs = new PI3();

        for (int i = 0; i < cadeiasDNA.length; i++) {
            for (int j = 0; j < cadeiasDNA.length; j++) {

                char[] X = cadeiasDNA[i].toCharArray();
                char[] Y = cadeiasDNA[j].toCharArray();
                int m = X.length;
                int n = Y.length;

                System.out.println("ID " + i + " com ID " + j + " e de tamanho: " + lcs.lcs(X, Y, m, n));

            }
        }
    }

    public static void Lista_Usuarios_Semelhantes() {
        Scanner leia = new Scanner(System.in);
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);
        
        int id, maior, cont = 0, aux = 0;

        System.out.println("____________________________________________________");
        System.out.println("            Opção escolhida              ");
        System.out.println("Apresentar Lista de Usuários Semelhantes");
        System.out.println("");
        System.out.println("Informe o ID desejado:");
        id = leia.nextInt();

        PI3 lcs = new PI3();

        for (int i = 0; i < cadeiasDNA.length; i++) {
            for (int j = 0; j < cadeiasDNA.length; j++) {

                char[] X = cadeiasDNA[i].toCharArray();
                char[] Y = cadeiasDNA[j].toCharArray();
                int m = X.length;
                int n = Y.length;

                maior = lcs.lcs(X, Y, m, n);
                while (cont <= 5) {
                    for (int k = 0; k < maior; k++) {

                    }
                    for (int k = 0; k < 10; k++) {

                    }
                    for (int k = 0; k < 10; k++) {

                    }
                    for (int k = 0; k < 10; k++) {

                    }
                    for (int k = 0; k < 10; k++) {

                    }
                }
            }
        }

        System.out.println("");
    }//a querta opçao ira mostrar , qual sao os DNA 

    public static void Dominante_Recessiva() {
        Scanner leia = new Scanner(System.in);

        System.out.println("");
        System.out.println("            Opção escolhida            ");
        System.out.println("Apresentar a Base Dominante e Recessiva");

        int opçao2;
        subMenu();
        System.out.println("\nInforme a opção desejada: ");
        while (!leia.hasNextInt()) {
            String input = leia.next();
            System.out.println(input + " - Não é um número valido, digite novamente");
        }
        subMenu();
        opçao2 = leia.nextInt();

        switch (opçao2) {
            case 1:
                DrGeral();
                break;
            case 2:
                DrPessoa();
                break;
        }
        System.out.println("");
    }

    public static void subMenu() {
        System.out.println("_____________________________");
        System.out.println("           Menu           ");
        System.out.println("1 - Geral.");
        System.out.println("2 - Por pessoa.");
        System.out.println("______________________________");
        System.out.println("\nEcolha uma das opções:");
    }

    public static void DrGeral() {
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);

        char A, C, G, T;
        int a = 0, c = 0, g = 0, t = 0;
        System.out.println("");
        System.out.println("\nDominante e recessivo das cadeias de DNA em geral:");
        System.out.println("");

        for (int i = 0; i < cadeiasDNA.length; i++) {
            //System.out.println("");
            for (int j = 0; j < 30; j++) {
                char[] s = cadeiasDNA[i].toCharArray();
                //System.out.print(s[j]+" ");

                if (s[j] == 'A') {
                    a++;
                }
                if (s[j] == 'C') {
                    c++;
                }
                if (s[j] == 'G') {
                    g++;
                }
                if (s[j] == 'T') {
                    t++;
                }
            }
        }
        System.out.println("Dominante:");
        if (a > c && a > g && a > t) {
            System.out.println("Adenina");
        } else if (c > a && c > g && c > t) {
            System.out.println("Citosina");
        } else if (g > c && g > a && g > t) {
            System.out.println("Guanina");
        } else if (t > c && t > a && t > g) {
            System.out.println("Tinina");
        }
        System.out.println("______________");
        System.out.println("");
        System.out.println("Recessivo:");
        if (a < c && a < g && a < t) {
            System.out.println("Adenina");
        } else if (c < a && c < g && c < t) {
            System.out.println("Citosina");
        } else if (g < c && g < a && g < t) {
            System.out.println("Guanina");
        } else if (t < c && t < a && t < g) {
            System.out.println("Tinina");
        }
        System.out.println("");
    }

    public static void DrPessoa() {
        Scanner leia = new Scanner(System.in);

        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);

        char A, C, G, T;
        int a = 0, c = 0, g = 0, t = 0, id;
        System.out.println("");
        System.out.println("\nDominante e recessivo das cadeias de DNA por pessoa:");
        System.out.println("");
        System.out.println("Informe o ID desejado:");
        id = leia.nextInt();

        for (int i = 0; i < cadeiasDNA.length; i++) {
            //System.out.println("");
            for (int j = 0; j < 30; j++) {
                char[] s = cadeiasDNA[id].toCharArray();
                //System.out.print(s[j]+" ");

                if (s[j] == 'A') {
                    a++;
                }
                if (s[j] == 'C') {
                    c++;
                }
                if (s[j] == 'G') {
                    g++;
                }
                if (s[j] == 'T') {
                    t++;
                }
            }
        }
        System.out.println("Dominante:");
        if (a > c && a > g && a > t) {
            System.out.println("Adenina");
        } else if (c > a && c > g && c > t) {
            System.out.println("Citosina");
        } else if (g > c && g > a && g > t) {
            System.out.println("Guanina");
        } else if (t > c && t > a && t > g) {
            System.out.println("Tinina");
        }
        System.out.println("______________");
        System.out.println("");
        System.out.println("Recessivo:");
        if (a < c && a < g && a < t) {
            System.out.println("Adenina");
        } else if (c < a && c < g && c < t) {
            System.out.println("Citosina");
        } else if (g < c && g < a && g < t) {
            System.out.println("Guanina");
        } else if (t < c && t < a && t < g) {
            System.out.println("Tinina");
        }
        System.out.println("");
    }

    int lcs(char[] X, char[] Y, int m, int n) {
        //Retorna o comprimento do LCS para X [0..m-1], Y [0..n-1] 
        int L[][] = new int[m + 1][n + 1];
        // Seguindo os passos, construa L [m + 1] [n + 1] de maneira ascendente. 
        //Note que L [i] [j] contém comprimento de LCS de X [0..i-1] e Y [0..j-1]
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[m][n];
    }

    int max(int a, int b) {

        return (a > b) ? a : b;

    }

}