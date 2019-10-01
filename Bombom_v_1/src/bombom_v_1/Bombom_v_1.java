/*
 Começar a pôr a mão na massa não vai te exigir nem investimento nem sacrifício. 
 Muitas receitas de bombons não gastam mais do que R$ 30 para fazer uma bandeja 
 de mais de 50 peças!
 Desenvolver um software, onde:
 1. Resolva a situação problema proposta. Com as três receitas. Os dados podem ser
 fictícios(valores e medidas).
 2. Tenha a opção de aumentar/diminuir a receita. Ao fazer esse aumento o valor mínimo da
 receita deverá ser alterado proporcionalmente para ser comparado, ou seja, para que o
 software possa dizer se continua dentro do limite de gasto.
 3. Calcule automaticamente o valor de custo de cada bombom;
 4. Calcule quanto o usuário irá ter de lucro, dado um valor de venda.
 */
package Bombom_v_1;

import java.text.DecimalFormat; // vai ler valores em  decimal
import java.util.Scanner;

public class Bombom_v_1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

//******************** CRIAÇÃO DE MATRIZES / VETORES ***************************        
        String[][] base = {{"Chocolate", "400"}, {"Leite Condensado", "395"}, {"Margarina", "40"}};//CRIANDO AS MATRIZES E DEFININDO TEXTOS
        String[][] sabor = {{"Leite em pó", "50"}, {"café Solúvel", "100"}, {"Coco Ralado", "300"}};//CRIANDO AS MATRIZES E DEFININDO TEXTOS
        String[] descBase = {"Chocolate", "Leite Condensado", "Margarina"};
        String[] descSabor = {"Leite em pó", "Café Solúvel", "Coco Ralado"};
        double[] qtdeBase = new double[descBase.length];//AQUI CRIA UM VETOR INT DE 3 POSIÇÃO
        double[] qtdeSabor = new double[descSabor.length];//AQUI CRIA UM VETOR INT DE 3 POSIÇÃO
        double[] valorBase = new double[descBase.length];
        double[] valorSabor = new double[descSabor.length];
        double[] custoBase = new double[descBase.length];//vetor que ira receber o custo da receita do ingrediente
        double[] custoSabor = new double[descSabor.length];//vetor que ira receber o custo da receita do ingrediente
        double[] custoGramaBase = new double[descSabor.length];//vetor que vai receber o custo da grama de cada ingrediente
        double[] custoGramaSabor = new double[descSabor.length];//vetor que vai receber o custo da grama de cada ingrediente
        double[] custoUnit = new double[descSabor.length];//vetor para armazenar o custo de cada bombom
        DecimalFormat df = new DecimalFormat("0,0");//foran alterados os valores eles vao ser mostrados em decimal

//******************** ENTRADAS DE DADOS DO USUÁRIO*****************************
        double limite = 30;
        entrada(descBase, qtdeBase, valorBase);//chamando método entrada para base
        entrada(descSabor, qtdeSabor, valorSabor);//chamando método entrada para sabor
        //System.out.println("teste vetor "+qtdeSabor[1]);//teste para verificar se foi gravado no vetor
        //System.out.println("teste vetor "+valorSabor[2]);
        System.out.println(" ");

//********************** CALCULO DE CUSTOS DOS INGREDIENTES ********************
        custoBase = calculoCusto(base, qtdeBase, valorBase);//enviando matriz, vetores qtde e valor
        custoSabor = calculoCusto(sabor, qtdeSabor, valorSabor);//enviando matriz, vetores qtde e valor
        custoGramaBase = calculoGrama(base, qtdeBase, valorBase);//enviando matriz, vetores qtde e valor
        custoGramaSabor = calculoGrama(sabor, qtdeSabor, valorSabor);//enviando matriz, vetores qtde e valor
        double somaBase = somaCusto(custoBase);//variavel somaBase recebe a soma da base da receita que é fixa

        System.out.println("Custo grama base:  "  +custoGramaBase[0]+ "g" );
        System.out.println("Custo grama base:  "  +custoGramaBase[1]+ "g" );
        System.out.println("Custo grama base:  "  +custoGramaBase[2]+ "g" );
        System.out.println("Custo grama sabor: " +  custoGramaSabor[0]+ "g" );
        System.out.println("Custo grama sabor: "  + custoGramaSabor[1]+ "g");
        System.out.println("Custo grama sabor: "   +  custoGramaSabor[2]+"g");
        System.out.println(" ");

//************** CUSTO DAS RECEITAS 01 02 03 ***********************************
        double custRec1 = somaBase + custoSabor[0];//variavel de custo da receita = valor da base + sabor
        double custRec2 = somaBase + custoSabor[1];
        double custRec3 = somaBase + custoSabor[2];
        System.out.println("Soma base e custo receita 1: R$ " + df.format(custRec1) + custRec1);//colocar o nome do sabor da receita e não receita 01 ou 02 03....
        System.out.println("Soma base e custo receita 2: R$ " + df.format(custRec2) + custRec2);
        System.out.println("Soma base e custo receita 3: R$" + df.format(custRec3) + custRec3);
        System.out.println(" ");

        if (custRec1 > limite) {
            System.out.println("A receita 01 está com o valor maior que o estabelecido.");
        } else if (custRec2 > limite) {
            System.out.println("A receita 02 está com o valor maior que o estabelecido.");
        } else if (custRec3 > limite) {
            System.out.println("A receita 03 está com o valor maior que o estabelecido.");
        }
        System.out.println("");

        System.out.println("Para aumentar o limite digite o novo valor ou 0 para manter:");
        double auxLimite = leia.nextDouble();
        System.out.println("");

//fazer um laço aqui para melhorar dar opção para o usuário até achar o limite ideal
//laçar até custo unitário dando a opção para o usuário analizar o custo com o novo limite
        if (auxLimite != 0) {
            limite = auxLimite;
        }
        if (custRec1 > limite) {
            System.out.println("A receita 01 está com o valor maior que o estabelecido.");
        } else if (custRec2 > limite) {
            System.out.println("A receita 02 está com o valor maior que o estabelecido.");
        } else if (custRec3 > limite) {
            System.out.println("A receita 03 está com o valor maior que o estabelecido.");
        }

        System.out.println(" ");

//************ VERIFICAR SE AUMENTA OU DIMINUI A RECEITA ***********************
        double divisao = 1;
        do {
            System.out.println("Deseja reduzir ou aumentar a receita? O padrão é 1.");
            System.out.println("Se desejar digite um número positivo ou 1 para padrão.");
            divisao = leia.nextDouble();
        } while (divisao <= 0);
//validar para não receber 0

        if (divisao != 1) {//condição para diminuir ou aumentar a receita proporcionalmente
            custRec1 = custRec1 / divisao;
            custRec2 = custRec2 / divisao;
            custRec3 = custRec3 / divisao;
        }
        if (divisao > 1) {
            System.out.println("Sua receita foi diminuida em " + divisao + " vezes");
        } else if (divisao < 1) {
            System.out.println("Sua receita foi aumentada em " + divisao + " vezes");
        }

        System.out.println("teste custo receita 1: R$  " + df.format(custRec1) + custRec1);//colocar o nome do sabor da receita e não receita 01 ou 02 03....

        System.out.println("teste custo receita 2: R$  "  + df.format(custRec2) + custRec2);
        System.out.println("teste custo receita 3: R$  "  + df.format(custRec3) + custRec3);
        System.out.println(" ");

//************ VERIFICAR A QUANTIDADE DE BOMBOM O PADRÃO É 50 UNIDADES *********
        double bombom = 50;
//verificar valores do custo unitario do bombom
        custoUnit[0] = (custRec1 / (bombom / divisao)) / divisao;
        custoUnit[1] = (custRec2 / (bombom / divisao)) / divisao;
        custoUnit[2] = (custRec3 / (bombom / divisao)) / divisao;
        System.out.println("Serão produzidos " + bombom / divisao + " no total.");

//************ MOSTRAR O CUSTO UNITÁRIO DO BOMBOM ******************************
        System.out.println("Custo unitario do bombom receita 1: R$ " + df.format(custoUnit[0]) + custoUnit[0]);//colocar o nome do sabor da receita e não receita 01 ou 02 03....
        System.out.println("Custo unitario do bombom receita 2: R$ " + df.format(custoUnit[2]) + custoUnit[2]);
        System.out.println("Custo unitario do bombom receita 3: R$ " + df.format(custoUnit[3]) + custoUnit[3]);
        System.out.println(" ");

//************ CALCULAR O LUCRO BASEADO NO VALOR DE VENDA **********************
//verificar o lucro dos bombons
        System.out.println("Digite o valor de venda do bombom:");
        double venda = leia.nextDouble();
        double lucro1 = ((venda - custoUnit[0]) / custoUnit[0]) * 100;
        double lucro2 = ((venda - custoUnit[1]) / custoUnit[1]) * 100;
        double lucro3 = ((venda - custoUnit[2]) / custoUnit[2]) * 100;
        System.out.println("Lucro unitário por bombom na receita 1: R$  " + df.format(lucro1) + lucro1 + "%");//colocar o nome do sabor da receita e não receita 01 ou 02 03....
        System.out.println("Lucro unitário por bombom na receita 2: R$ "  + df.format(lucro3) + lucro3 + "%");
        System.out.println("\n\n");
//*********** ******************************************************************
        System.out.println("Receita de " + sabor[0][0] + "\n");
        System.out.print("DESCRIÇÃO\t\tGRAMAS\tVALOR");
        System.out.print("\n" + base[0][0] + "\t\t" + base[0][1] + "\t" + custoBase[0]);
        System.out.print("\n" + base[1][0] + "\t" + base[1][1] + "\t" + custoBase[1]);
        System.out.print("\n" + base[2][0] + "\t\t" + base[2][1] + "\t" + custoBase[2]);
        System.out.print("\n" + sabor[0][0] + "\t\t" + sabor[0][1] + "\t" + custoSabor[0] + "\n");
        System.out.println("TOTAL DA RECEITA\t R$" + custRec1);
    }
//******************************************************************

    private static void entrada(String[] descricao, double[] qtde, double[] valor) {
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < descricao.length; i++) {
            System.out.println("Digite a qtde de " + descricao[i] + " : ");
            qtde[i] = leia.nextInt();
            System.out.println("Digite o valor pgto no " + descricao[i] + " : ");
            valor[i] = leia.nextDouble();
        }
    }

    private static double[] calculoCusto(String[][] matriz, double[] qtde, double[] valor) {
        double[] x = new double[qtde.length];
        for (int i = 0; i < qtde.length; i++) {
            x[i] = valor[i] / qtde[i] * Double.parseDouble(matriz[i][1]);//custo => valor pago * quant. da receita (matriz) / pela quant. compra
        }
        return x;
    }

    private static double[] calculoGrama(String[][] matriz, double[] qtde, double[] valor) {
        double[] x = new double[qtde.length];
        for (int i = 0; i < qtde.length; i++) {
            x[i] = valor[i] / qtde[i];//x => valor pago / quantidade comprada
        }
        return x;
    }

    private static double somaCusto(double[] custo) {
        double soma = 0;
        for (int i = 0; i < custo.length; i++) {
            soma = soma + custo[i];
        }
        return soma;
    }

}
