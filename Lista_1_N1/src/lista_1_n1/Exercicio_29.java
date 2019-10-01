/*

 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_29 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int idade;
    String nome;
        System.out.println("Porfavor insira seu nome :");
        nome = entrada.nextLine();
        System.out.println(nome +",qual sua idade");
        idade = entrada.nextInt();
        
        if (idade >= 18 ) {
            System.out.println("voce e maior  de idade");
            
        }else
            System.out.println("voce e menor de idade");
    }
    }
    

