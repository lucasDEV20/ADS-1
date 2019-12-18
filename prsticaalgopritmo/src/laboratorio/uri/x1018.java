

package laboratorio.uri;
import java.util.Scanner;
public class x1018 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int N , valor = 0;
    //entrada de cedula e seu vaalor a ser lido pelas variaveis 
    int n100 = 0 , n50 = 0 , n20 = 0 , n10 = 0 , n5 = 0 , n2 = 0 , n1 = 1;
    //declarando e iniciando as variaveis das celulas
    N = entrada.nextInt();
    //iniciando a variavel que puxara o numero de cedulas e dara seu posteriorr valor 
       n100 = N / 100;
       N %= 100;
    //CEDULA DE 100 REAIS
       n100 = N / 50;
       N %= 50;
    //CEDULA DE 50 REAIS
       n100 = N / 20;
       N %= 20;
    //CEDULA DE 20 REAIS
       n100 = N / 10;
       N %= 10;
    //CEDULA DE 10 REAIS
       n100 = N / 5;
       N %= 5;
    //CEDULA DE 5 REAIS
       n100 = N / 2;
       N %= 2;
    //CEDULA DE 2 REAIS
       n100 = N / 1;
       N %= 1;
    //CEDULA DE 1 REAIS
    
        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00\");");
        System.out.println(n50 + " nota(s) de R$ 50,00\");");
        System.out.println(n20 + " nota(s) de R$ 20,00\");");
        System.out.println(n10 + " nota(s) de R$ 10,00\");");
        System.out.println(n5 + " nota(s) de R$ 5,00\");");
        System.out.println(n2 + " nota(s) de R$ 2,00\");");
        System.out.println(n1 + " nota(s) de R$ 1,00\");");
        
    }
    
}
