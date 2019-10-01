/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
          char menu ;
          float valor_inicial , valor_total ;
          // i.   Ar condicionado      – R$ 1750,00 
        // ii.  Pintura metálica     – R$  800,00
      // iii. Vidro Elétrico       – R$ 1200,00
    // iv.  Direção Hidráulica   – R$ 2000, 
          System.out.println();
          System.out.println("======================================");
          System.out.println("insira o valor de inicial do automovel");
          valor_inicial = entrada.nextFloat();
          System.out.println("======================================");
          System.out.println("-ESCOLHA UMA DAS OPÇOES-");
          System.out.println("(1) Ar condicionado ");
          System.out.println("(2) Pintura metálica");
          System.out.println("(3) Vidro Elétrico");
          System.out.println("(4) Direção Hidráulica ");
          System.out.println("(0) sair");
          System.out.println("======================================");
          System.out.println();
          menu = entrada.next().charAt(0);
          switch (menu){
              case '1':
                  valor_total = (float) (valor_inicial+1750.00) ;
                  System.out.println();
                  System.out.println("o valor do carro com ar condicionado e R$"+valor_total);
                  System.out.println("======================================");
                  System.out.println();
                  break;
                  case '2':
                  valor_total = (float) (valor_inicial+800.00) ;
                  System.out.println();
                  System.out.println("o valor do carro com pintura metalica e R$"+valor_total);
                  System.out.println("======================================");
                  System.out.println();
                  break;
                case '3':
                  valor_total = (float) (valor_inicial+1200.00) ;
                  System.out.println();
                  System.out.println("o valor do carro com vidro eletrico e R$"+valor_total);
                  System.out.println("======================================");
                  System.out.println();
                  break;
                    case '4':
                  valor_total = (float) (valor_inicial+2000.00) ;
                  System.out.println();
                  System.out.println("o valor do carro com direçao hidraulica e R$"+valor_total);
                  System.out.println("======================================");
                  System.out.println();
                  break;
                    case '0':
                        System.out.println();
                        System.out.println("saindooooooooooooo");
                        System.out.println("======================================");          
                        System.out.println();
                        break;
                    default:
                        System.out.println("DIGITE UMA OPÇAO VALIDA ");
                        
          }
}
 }