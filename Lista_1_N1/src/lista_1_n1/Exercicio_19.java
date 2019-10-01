/*
Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma
viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário
deve fornecer o tempo gasto na viagem e a velocidade média durante ela. Desta forma, será
possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO *
VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de
combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA /
AUTONOMIA. O programa deve apresentar os valores da velocidade média, tempo gasto
na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_19 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int tempoGasto , VelocidadeMedia , DistanciaPercorrida , litrosUsados;
        System.out.println("Insira o tempo gasto de viagem :");
        tempoGasto = entrada.nextInt();
        System.out.println("Inforne a velocidade media : ");
        VelocidadeMedia = entrada.nextInt();
        
        DistanciaPercorrida = tempoGasto * VelocidadeMedia;
        litrosUsados = DistanciaPercorrida/12;
        System.out.println("A vwlocidade media e : "+VelocidadeMedia+"km");
        System.out.println("O tempo gasto na viagem e : "+tempoGasto);
        System.out.println("A dsistancia percorrida e : "+DistanciaPercorrida+"km");
        System.out.println("Foram ultilizados "+litrosUsados+"lts na viagem");
        
    
    }
    
}
