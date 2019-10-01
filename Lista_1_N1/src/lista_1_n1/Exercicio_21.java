/*
21. Faça um programa que leia um tempo total em segundos e expresse-o em horas, minutos e
segundos. Ex. 140s = 0h 2m 20s.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_21 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int tempo , hora , hora_seg , minutos , segundos;
    hora_seg = 3600;
        System.out.println("Entre com o numero de segundos"); 
        tempo = entrada.nextInt();
        hora = (tempo/hora_seg);
        minutos = (tempo -(hora_seg*hora))/60;
        segundos = (tempo -(hora_seg*hora)-(minutos*60));
        System.out.printf("%dh : %dm :%ds \n",hora,minutos,segundos);
    }
   
}
