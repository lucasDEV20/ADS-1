/*
 Leia um número inteiro que representa um código de DDD para discagem interurbana.
 Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
 Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, 
 o programa deverá informar:
 DDD nao cadastrado

 Entrada
 A entrada consiste de um único valor inteiro.

 Saída
 Imprima o nome da cidade correspondente ao DDD existente na entrada.
 Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.


 */
package uri_lab;

import java.util.Scanner;

public class x1050 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        if (numero == 61) {
            System.out.println("Brasilia\n");
        }else if (numero == 71){
            System.out.println("Salvador\n");
        }else if (numero == 11){
            System.out.println("Sao Paulo\n");
        }else if (numero == 21){
            System.out.println("Rio de Janeiro\n");
        }else if (numero == 32){
            System.out.println("Juiz de Fora\n");
        }else if (numero == 19){
            System.out.println("Campinas\n");
        }else if (numero == 27){
            System.out.println("Vitoria\n");
        }else if (numero == 31){
            System.out.println("Belo Horizonte\n");
        }else{
            System.out.println("DDD nao cadastrado\n");
        }

    }
}
