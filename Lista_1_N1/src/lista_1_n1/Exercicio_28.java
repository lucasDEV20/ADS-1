/*
Receba dois números reais do usuário em seguida exiba o resultado de uma operação
escolhida também pelo usuário: (1) Soma (2) Subtração, (3) Multiplicação e (4) Divisão.
Obs.: No caso da divisão, se o segundo operando for zero exiba “divisão impossível”.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_28 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    char menu; 
    float num1 = 0 , num2 = 0, soma , sub , divisao , multi ;
        
        System.out.println();
        System.out.println("======================================================");
        System.out.println("escolha qual o operaçao matematica voce ira ultilizar");
        System.out.println("(1) - soma ");
        System.out.println("(2) - subritaçao  ");
        System.out.println("(3) - multiplicaçao");
        System.out.println("(4) - divisao");
        System.out.println("(%) - sair");
        System.out.println("======================================================");
        menu = entrada.next().toLowerCase().charAt(0);
        System.out.println();
        
        
        
        switch(menu){
            case '1':
                System.out.println();
                System.out.println("insira o primeiro numero a ser somado : ");    
                num1 = entrada.nextFloat();
                System.out.println("insira o segundo numero a ser somano : ");
                num2 = entrada.nextFloat();
                soma = (num1 + num2);
                System.out.println("O resultado da soma e : "+soma );
                   break;
            case '2':
                System.out.println();
                System.out.println("insira o primeiro numero a ser subtraido :");
                num1 = entrada.nextInt();
                System.out.println("insira o segundo numero a ser subtraido");
                num2 = entrada.nextFloat();
                sub = (num1 - num2) ;
                System.out.println("o resultado da subtraçao e : "+sub);
                  break;
            case '3':
                System.out.println();
                System.out.println("insira o primeiro numero a ser multiplicado : ");
                num1 = entrada.nextFloat();
                System.out.println("insira o segundo numero a ser multiplicado : ");
                num2 = entrada.nextFloat();
                multi = (num1 * num2);
                System.out.println("O numero multiplicado e : "+multi);
                System.out.println();
                 break;
            case '4':
                System.out.println();
                System.out.println("insira o primeiro numero a ser dividido : ");
                num1 = entrada.nextFloat();
                System.out.println("insira o segundo numero a ser divido : ");
                num2 = entrada.nextFloat();
                divisao = (num1 / num2);
                if (num1 == 0) {
                System.out.println("favor inserir um numero valido");                    
                }else{
                System.out.println("favor inserir um numero valido");
                }
                System.out.println("O resultado da divisao e : "+divisao);
                System.out.println();
                 break;
            case '5':
                System.out.println("saindo...............");
                 break;
            default:
        }
    }
    }

