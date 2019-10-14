import sun.tools.java.Scanner;

class Main {
  public static void main(String[] args) {
/* Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
Entrada
Quatro números inteiros representando a hora de início e fim do jogo.
Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .*/
java.util.Scanner entrada = new Scanner(System.in);
int hora_inicial , final , minuto_inicial ,minuto_final ,hora_final , tempo_horatotal , tempo_minutototal;
hora_inicial = entrada.nextInt();
minuto_inicial = entrada.nextInt();
final = entrada.nextInt();
minuto_final = entrada.nextInt();
 tempo_horatotal = final - hora_inicial;
 if (tempo_horatotal < 0){
   tempo_horatotal = 24 + (final - hora_inicial);

 }  
   tempo_minutototal = minuto_final - minuto_inicial;
   if (tempo_minutototal < 0){
     tempo_minutototal = 60 + (minuto_final - minuto_inicial);
    
   }
  }
}
