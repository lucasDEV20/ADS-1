/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uri_lab;
import java.util.Scanner;
public class x1047 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int hora_inicial , min_inicial , hora_final , min_final ,tinicial_min, tfinal_min, diferença_hora, diferença_minuto, diferença; 
        hora_inicial = entrada.nextInt();
        min_inicial = entrada.nextInt();
        
        hora_final = entrada.nextInt();
        min_final = entrada.nextInt();
        
        tinicial_min = entrada.nextInt();
        tfinal_min = entrada.nextInt();
        
        diferença = tfinal_min - tinicial_min;
         tinicial_min = hora_inicial * 60 + min_inicial;
        tfinal_min = hora_final * 60 + min_final;
        diferença = tfinal_min - tinicial_min;
        
        
        if (tfinal_min <= tinicial_min) {
            diferença = 1440 + diferença;
        }
        diferença_hora = diferença / 60;
        diferença_minuto = diferença % 60;
         System.out.printf( "O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", diferença_hora, diferença_minuto);
    
    }
}
