/*
4. Escreva um programa que leia o nome e a idade de vários usuários, e imprima a
seguinte mensagem “O usuário *nome* tem *anos* anos de vida”. O programa deverá
continuar executando enquanto o usuário informar que deseja continuar.
 */

package lista_n2;
import java.util.Scanner;
public class Exercicio_04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nome = null , resposta  ;
        int idade = 0, quant = 0, dados = 0 ;
        //entrada / processamento de execuçao do progrma 
        System.out.println();
        System.out.println("==================================================");
        System.out.println("Quantas pessoas vao ser entrevistadas\n");
        quant = entrada.nextInt();
        while(dados <= quant){
        System.out.println();
        System.out.println("==================================================");
        System.out.printf("\nPor favor digite o nome do usuario\n");
        nome = entrada.next();
        System.out.printf("\nDigite a idade do usuario \n");
        idade = entrada.nextInt();
        dados++;
        System.out.println();
        //processamento       
        
            /*ACHAR UMA VALIDAÇAO PRA ESSE BLOCO , CASO O USUARIO
       DIGITE O NOME EM MAIUSCULO , OU A PRINEIRA LETRA
        ELE IRA EXPRESSAR ISSO
        */
         
       
        
        //saida
        System.out.println("O usuário , "+nome+" tem "+idade+" anos de vida");
        System.out.println("==================================================");
        System.out.println();
  }
        }
        
    }

