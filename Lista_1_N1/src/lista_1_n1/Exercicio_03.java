/*
Faça um programa que leia o nome e sobrenome de duas pessoas 
(marido e esposa) e um ano (inteiro). E exiba a seguinte mensagem:
“Fulano da Silva é casado com Ciclana de Souza há XX anos”. 
Considere o ano atual como 2019. 
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_03 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String  sobrenome ,sobrenome2, marido , esposa;
    int anosdecasado;
        //parte marido
        System.out.println(" Insira o nome do marido ");
        marido = entrada.nextLine();
        System.out.println(" Insira o sobrenome do usuario " +marido );
        sobrenome = entrada.nextLine();
        //parte sobrenome do marido
        //parte esposa
        System.out.println(" Insira o nome do esposa ");
        esposa = entrada.nextLine();
        System.out.println(" Insira o sobrenome do usuario " + esposa );
        sobrenome2 = entrada.nextLine();
        //parte sobrenome do marido
        //parte de anos de casados
        System.out.println(" Quantos anos o casal tem de casado");
        anosdecasado = entrada.nextInt();
        //pedindo o tempo casados , dos usuarios
        System.out.println( marido + " " +sobrenome + " e casado com " +esposa+ " " +sobrenome2+ " ha " + anosdecasado + "anos");
        
    }
    
}
