package PI2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pi {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // TODO Auto-generated method stub

        int opçao = 0;
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA); //chama o metodo que lê as cadeias de DNA 

        System.out.println("\n");
        System.out.println("          -------------------------------------------------   Genetics Algorithms   -------------------------------------------------          ");
        System.out.println("\n\n");

        do {   //continua o processo ate que o usuario digite a opção sair

            menu();   //chama o menu principal

            while (!leia.hasNextInt()) {   //fazer enquanto o usuario estiver informando um valor diferente de um numero inteiro
                String input = leia.next();
                System.out.println("");
                System.out.println("Erro!!!");
                System.out.println("Digite apenas numeros presentes no menu:");
                System.out.println("");

                menu();  // chama menu principal

            }
            opçao = leia.nextInt();

            switch (opçao) {   //imprime a opção de acordo com o que foi digitado pelo usuario 
                case 0:   //começa a opção caso usuario tenha digitado 0
                    Sair(); //chama metodo sair
                    break;   // encerra opção 0

                case 1:    //começa a opção caso usuario tenha digitado 1
                    Exibir_Matriz();   //chama metodo que exibe as Cadeias de DNA
                    break;      // encerra opção 1

                case 2:     //começa a opção caso usuario tenha digitado 2
                    Matriz_Similaridade();   //chama metodo exibe a matriz de similaridade
                    break;      // encerra opção 2

                case 3:     //começa a opção caso usuario tenha digitado 3
                    Lista_Usuarios_Semelhantes();   //chama metodo que mostra os usuarios semelhantes
                    break;      // encerra opção 3

                case 4:     //começa a opção caso usuario tenha digitado 4
                    Dominante_Recessiva();   //chama metodo para mostrar o semelhante e o recessivo por pessoa e em geral 
                    break;      // encerra opção 4
            }
        } while (opçao != 0);    //fecha o do while e da a condição
    }

    public static void LeitorArquivo(String[] vetorDNA) {    //metodo pra ler o arquivo com as cadeias de DNA 
        // TODO Auto-generated method stub
        String nome = "C:\\Users\\Computador\\Downloads\\cadeiasDNA.txt";   //endereço de onde esta localizado o
        //arquivo com as cadeias de DNA em txt

        try {      //bloco para caso o arquivo de texto não seja encontrado

            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto

            int i = 0;

            while (linha != null) {    // valida se a varaivel linha foi preenchida corretamente 

                String[] basesDNA = linha.split(","); //retira as virgulas do arquivo texto

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
        } catch (IOException e) {   //imprimir a mensagem caso o arquivo texto não tenha sido encontrado
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }

    public static void imprimeVetor(String[] vetor) {   //metodo usado pra imprimie a cadeia de DNA
        for (int i = 0; i < vetor.length; i++) {     //percorre a cadeia de DNA
            System.out.println("Pessoa[" + i + "] = " + vetor[i]);   //imprime a cadeia de DNA
        }
    }

    public static void menu() {    //metodo que imprime o menu principal

        System.out.println("____________________________________________________");
        System.out.println("                    Menu                       ");
        System.out.println("0 - Sair.");
        System.out.println("1 - Exibir Matriz com as Cadeias de DNA.");
        System.out.println("2 - Computar e exibir a matriz de similaridade.");
        System.out.println("3 - Apresentar Lista de Usuários Semelhantes.");
        System.out.println("4 - Apresentar a Base Dominante e Recessiva.");
        System.out.println("\nEcolha uma das opções:");
        System.out.println("____________________________________________________");
    }

    public static void Sair() {      //metodo que finaliza o programa quando o usuario pedir pra sair  
        System.out.println("");
        System.out.println("Finalizando...");
    }

    public static void Exibir_Matriz() {     //metodo que exibe as cadeias de DNA
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);  //chama metodo pra ler o arquivo texto e o transforma em em vetor de cadeias de DNA

        System.out.println("");
        System.out.println("Opção escolhida:");
        System.out.println("");
        System.out.println("   Exibir Matriz com as Cadeias de DNA");
        System.out.println("\nVetor Cadeias DNA:");
        System.out.println("");
        imprimeVetor(cadeiasDNA);  //metodo que imprime a cadeia de de DNA
        System.out.println("");
    }

    public static void Matriz_Similaridade() {     // metodo que imprime a matriz de similaridade  
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);     //chama metodo pra ler o arquivo texto e o transforma em em vetor de cadeias de DNA

        System.out.println("");
        System.out.println("Opção escolhida:");
        System.out.println("");
        System.out.println("Computar e exibir a matriz de similaridade");
        System.out.println("");
        System.out.println("     Matriz de similaridade");
        System.out.println("");
        Matriz_LCS();   //metodo que chama a matriz de similaridade
        System.out.println("");
    }

    public static void Matriz_LCS() {     //metodo que desenvolve a matriz de similaridade
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);     //chama metodo pra ler o arquivo texto e o transforma em em vetor de cadeias de DNA

        Pi lcs = new Pi();

        for (int i = 0; i < cadeiasDNA.length; i++) {   //percorre o vetor com a cadeia de DNA
            for (int j = 0; j < cadeiasDNA.length; j++) {     //percorre o vetor com a cadeia de DNA

                char[] X = cadeiasDNA[i].toCharArray(); //X recebe a cadeia de DNA é a transforma em um vetor de caracteres
                char[] Y = cadeiasDNA[j].toCharArray();     //Y recebe a cadeia de DNA é a transforma em um vetor de caracteres
                int m = X.length;      // m recebe o tamanho de X
                int n = Y.length;       // n recebe o valor de Y 

                System.out.println("ID " + i + " com ID " + j + " e de tamanho: " + lcs.lcs(X, Y, m, n));  //imprime a matriz de similaridade

            }
        }
    }

    public static void Lista_Usuarios_Semelhantes() {     //metodo que mostra os usuarios semelhantes do ID escolhido pelo usuario
        Scanner leia = new Scanner(System.in);

        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);     //chama metodo pra ler o arquivo texto e o transforma em em vetor de cadeias de DNA

        int maior = 0, cont = 0, tamanho, flag = 1, var, id;
        String opcao;

        System.out.println("");
        System.out.println("Opção escolhida:");
        System.out.println("");
        System.out.println("Apresentar Lista de Usuários Semelhantes");
        System.out.println("");

        while (flag == 1) {  //continua pedindo o ID caso o usuario digite um invalido

            System.out.println("Digite o ID desejado:");
            opcao = leia.next();
            System.out.println("");
            try {       //bloco para caso o usuario digite algo ou algum numero que não seja inteiro 
                var = Integer.parseInt(opcao); //passa variavel opçao de String para inteira 

                if (var > 99 || var < 0) {   //caso o usuario digite um ID inexistente pedi o ID novamente
                    System.out.println("Erro!!!");
                    System.out.println("Digite apenas numeros entre 0 a 99");
                    System.out.println("");
                    flag = 1;
                } else {    //caso o usuario peça um ID valido ele continua o processo
                    flag = 0;
                    id = var;
                }
            } catch (NumberFormatException e) {    //caso o usuario digite algo ou algum numero que não seja inteiro exibe uma mensagem de erro 
                System.out.println("\nErro!!!Digite apenas numeros entre 0 a 99");
                flag = 1;
            }
        }
        

        Pi lcs = new Pi();

        for (String cadeiasDNA1 : cadeiasDNA) {
            char[] X = cadeiasDNA1.toCharArray();
            char[] Y = cadeiasDNA1.toCharArray();
            int m = X.length;
            int n = Y.length;
            tamanho = lcs.lcs(X, Y, m, n);
            for (int j = 0; j < 5; j++) {

            }
        }

        System.out.println("");
    }

    public static void Dominante_Recessiva() {   //metodo para mostrar a base dominante e a recessiva em geral e por pessoa
        Scanner leia = new Scanner(System.in);

        System.out.println("");
        System.out.println("Opção escolhida:");
        System.out.println("");
        System.out.println("Apresentar a Base Dominante e Recessiva");
        System.out.println("");

        int opçao2;
        subMenu();  //chama metodo que imprime um sub menu

        while (!leia.hasNextInt()) {  //refaz o processo enquanto o usuario estiver informando um valor diferente de um numero inteiro
            String input = leia.next();

            System.out.println("");
            System.out.println("Erro!!!");
            System.out.println("Digite apenas numeros presentes no menu");
            System.out.println("");

            subMenu();  //chamo o metodo que imprime o sub menu
        }
        opçao2 = leia.nextInt();

        switch (opçao2) {//imprime a opção de acordo com o que foi digitado pelo usuario
            case 1:    //começa a opção caso o usuario tenha digitado 1
                DrGeral();    //chama metodo que mostra a base dominante e recessiva em gral
                break;  //encerra opção 1
            case 2:     //começa a opção caso o usuario tenha digitado 2
                DrPessoa();     //caham metodo que mostra a base dominate e recessiva deacorod com o ID digitado pelo usuario
                break;    //encerra opção 2
        }
        System.out.println("");
    }

    public static void subMenu() {   //metodo que imprime o sub menu
        System.out.println("_____________________________");
        System.out.println("           Menu           ");
        System.out.println("1 - Geral.");
        System.out.println("2 - Por pessoa.");
        System.out.println("\nEcolha uma das opções:");
        System.out.println("______________________________");

    }

    public static void DrGeral() {   //metodo que imprime o dominante e o recessivo da cadeia de DNA em geral
        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA); //chama metodo pra ler o arquivo texto e o transforma em em vetor de cadeias de DNA

        char A, C, G, T;
        int a = 0, c = 0, g = 0, t = 0;

        System.out.println("");
        System.out.println("Opção escolhida:");
        System.out.println("");
        System.out.println("\nDominante e recessivo das cadeias de DNA em geral:");
        System.out.println("");

        for (int i = 0; i < cadeiasDNA.length; i++) {   //percorre o vetor da cadeia de DNA
            for (int j = 0; j < 30; j++) {
                char[] s = cadeiasDNA[i].toCharArray(); //transforma cadeias de DNA em char
                //System.out.print(s[j]+" ");

                if (s[j] == 'A') {  //quando indentificar a base 'A' conta 1
                    a++;
                }
                if (s[j] == 'C') {  //quando indentificar a base 'C' conta 1
                    c++;
                }
                if (s[j] == 'G') {  //quando indentificar a base 'T' conta 1
                    g++;
                }
                if (s[j] == 'T') {  //quando indentificar a base 'G' conta 1
                    t++;
                }

            }
        }
        System.out.println("Dominante:");
        if (a > c && a > g && a > t) {  //determina a base dominante pegando o maior contador
            System.out.println("Adenina");
        } else if (c > a && c > g && c > t) {  //determina a base dominante pegando o maior contador
            System.out.println("Citosina");
        } else if (g > c && g > a && g > t) {   //determina a base dominante pegando o maior contador
            System.out.println("Guanina");
        } else if (t > c && t > a && t > g) {   //determina a base dominante pegando o maior contador
            System.out.println("Tinina");
        }
        System.out.println("______________");
        System.out.println("");
        System.out.println("Recessivo:");
        if (a < c && a < g && a < t) {  //determina a base recessiva pegando o maior contador
            System.out.println("Adenina");
        } else if (c < a && c < g && c < t) {     //determina a base recessiva pegando o maior contador
            System.out.println("Citosina");
        } else if (g < c && g < a && g < t) {     //determina a base recessiva pegando o maior contador
            System.out.println("Guanina");
        } else if (t < c && t < a && t < g) {     //determina a base recessiva pegando o maior contador
            System.out.println("Tinina");
        }
        System.out.println("");
    }

    public static void DrPessoa() {  //metodo que imprime o dominante e o recessivo de acordo com o ID desejado pelo usuario
        Scanner leia = new Scanner(System.in);

        String[] cadeiasDNA = new String[100];
        LeitorArquivo(cadeiasDNA);  //chama metodo pra ler o arquivo texto e o transforma em em vetor de cadeias de DNA

        char A, C, G, T;
        int a = 0, c = 0, g = 0, t = 0, flag = 1, var = 0, id;
        String opcao;

        System.out.println("");
        System.out.println("Opção escolhida:");
        System.out.println("");
        System.out.println("Dominante e recessivo das cadeias de DNA por pessoa:");
        System.out.println("");

        while (flag == 1) {     //continua pedindo o ID caso o usuario digite um invalido
            System.out.println("Digite o ID desejado:");
            opcao = leia.next();
            System.out.println("");
            try {   //bloco para caso o usuario digite algo ou algum numero que não seja inteiro 
                var = Integer.parseInt(opcao); //passa variavel opçao de String para inteira
                if (var > 99 || var < 0) {  //caso o usuario digite um ID inexistente pedi o ID novamente
                    System.out.println("Erro!!!");
                    System.out.println("Digite apenas numeros entre 0 a 99");
                    System.out.println("");
                    flag = 1;
                } else {    //caso o usuario peça um ID valido ele continua o processo
                    flag = 0;
                    id = var;
                }
            } catch (Exception e) {     //caso o usuario digite algo ou algum numero que não seja inteiro exibe uma mensagem de erro 
                System.out.println("\nErro!!!Digite apenas numeros entre 0 a 99");
                flag = 1;
            }
        }

        for (int i = 0; i < cadeiasDNA.length; i++) {   //percorre o vetor da cadeia de DNA
            for (int j = 0; j < 30; j++) {
                char[] s = cadeiasDNA[var].toCharArray();   //transforma cadeia de DNA em char
                //System.out.print(s[j]+" ");

                if (s[j] == 'A') {  //quando indentificar a base 'A' conta 1
                    a++;
                }
                if (s[j] == 'C') {  //quando indentificar a base 'C' conta 1
                    c++;
                }
                if (s[j] == 'G') {  //quando indentificar a base 'T' conta 1
                    g++;
                }
                if (s[j] == 'T') {  //quando indentificar a base 'G' conta 1
                    t++;
                }

            }
        }
        System.out.println("Dominante:");
        if (a > c && a > g && a > t) {  //determina a base dominante pegando o maior contador
            System.out.println("Adenina");
        } else if (c > a && c > g && c > t) {  //determina a base dominante pegando o maior contador
            System.out.println("Citosina");
        } else if (g > c && g > a && g > t) {   //determina a base dominante pegando o maior contador
            System.out.println("Guanina");
        } else if (t > c && t > a && t > g) {   //determina a base dominante pegando o maior contador
            System.out.println("Tinina");
        }

        System.out.println("______________");
        System.out.println("");
        System.out.println("Recessivo:");
        if (a < c && a < g && a < t) {  //determina a base recessiva pegando o maior contador
            System.out.println("Adenina");
        } else if (c < a && c < g && c < t) {     //determina a base recessiva pegando o maior contador
            System.out.println("Citosina");
        } else if (g < c && g < a && g < t) {     //determina a base recessiva pegando o maior contador
            System.out.println("Guanina");
        } else if (t < c && t < a && t < g) {     //determina a base recessiva pegando o maior contador
            System.out.println("Tinina");
        } else if (c == a || c == t || c == g) {
            System.out.println("Citosina");
        } else if (a == c || a == t || a == g) {
            System.out.println("Adenina");
        } else if (t == c || t == a || t == g) {
            System.out.println("Tinina");
        } else if (g == c || g == t || g == a) {
            System.out.println("Guanina");
        }

        System.out.println("");
    }

    int lcs(char[] X, char[] Y, int m, int n) {   //metodo pra retornar o valor do lcs
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
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[m][n];   //retorna a matriz L pro metodo  
    }

    int max(int a, int b) {

        return (a > b) ? a : b;
    }
}
