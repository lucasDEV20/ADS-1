/*
programa indetificaçao de pessoa fisica e de 
informaçao dsobre o salario 
alem de horas trabalhadas , entrada e saida
 */

package treino;
import java.text.DecimalFormat;
import java.util.Scanner;
public class treino2 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat();   
    df.applyPattern("R$ 0.000");
    Scanner sistema = new Scanner(System.in);
    String nome , funçao , sexo;// nome do funcionario
   // sexo do funcionario
    int idade , dataNASC;//idade e data de nascimento do usuario
    double salario , ganhoporhora ,horatrabalhada , horadeentrada , horadesaida; 
    /*salario e ganho por hora do fuincionario , 
    hora de entrada e hora de saida e as horas trabalhadas
   */
        System.out.print("\n---------------------------------------------------");
        System.out.print("\n--------SISTEMA DE CADASTRO DE FUNCIONARIO---------");
        System.out.print("\n---------------------------------------------------");
    
        System.out.print("\n(-------------------------------------------------)");
        
        
        System.out.print("\n 1 INDENTIFICAÇAO DE FUUNCIONARIO:");
        System.out.println("\nInforme o nome do funcionario:");
        nome = sistema.nextLine();
        System.out.println("\ninforme a data de nascimento do funcionario:");
        dataNASC = sistema.nextInt();
        System.out.println("\ninforme a idade do funcionario:");
        idade = sistema.nextInt();
        System.out.println("informe o sexo do funcionario");
        sexo = sistema.nextLine();
        
        
        System.out.println("(-------------------------------------------------)");
        
        
        System.out.println("qual e o salario do funcionario ?");
        salario = sistema.nextDouble();
        
           
    }
}
