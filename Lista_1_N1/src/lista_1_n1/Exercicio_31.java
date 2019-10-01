/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_31 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    char menu = 0 , letra;
        System.out.println("insira a letra a ser considerada");
        letra = entrada.next().toLowerCase().charAt(0);
        switch (menu){
            case 'a':
                 case 'e':
                     case 'i':
                         case 'o':
                             case 'u':
                                 case 'A':
                             case 'E':
                         case 'I':
                     case 'O':
                case 'U':
                    System.out.println("essa letra  "+letra+" e uma vogal");
                 break;
                default:
                    System.out.println("essa letra  " +letra+" e uma consuante");
                                         
                         
        }
        }
        
    }

