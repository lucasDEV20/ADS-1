/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombom;
import java.util.Scanner;
/**
 *
 * @author Computador
 */
public class Listaalicemetodos {




/**
 *
 * @author Victor Gadder
 */
public class Funcionamento1_0 {
    public static void main(String[] args) {
        
        Scanner Buffer = new Scanner(System.in);
        /*
        declaração de variáveis;
        */
        int codigo = 0;
        double  total=0, pchoco=0, choco=0, plc=0, lc=0, pmg=0, mg=0, plp=0, lp=0, totallp = 0, totalcs = 0, totalcr = 0;
        double  pcs=0, cs=0, pcr=0, cr=0, pqchoco=0, pqlc=0, pqmg=0, pqlp=0, pqcs=0, pqcr=0;
        String aux = "";
        //entrada e processamento
        do {
            
                       
            System.out.println("Digite o código referente ao ingrediente de sua receita ou 0 (zero) para sair:\n");
            System.out.println("1- Chocolate meio amargo;");
            System.out.println("2- Leite Condensado;");
            System.out.println("3- Margarina;");
            System.out.println("4- Leite em pó;");
            System.out.println("5- Café solúvel;");
            System.out.println("6- Coco ralado seco;");
            System.out.println("0- Encerrar Pedido.\n\n");
            
            if (codigo<0 || codigo>6) {
                
                System.out.println("Código Incorreto!");
                System.out.println("Digite o código referente ao ingrediente de sua receita ou 0 (zero) para sair:\n");
                System.out.println("1- Chocolate meio amargo;");
                System.out.println("2- Leite Condensado;");
                System.out.println("3- Margarina;");
                System.out.println("4- Leite em pó;");
                System.out.println("5- Café solúvel;");
                System.out.println("6- Coco ralado seco;");
                System.out.println("0- Encerrar Pedido.\n\n");
                
            }
            
            while(!Buffer.hasNextInt()){
                
                aux = Buffer.next();
                
                System.out.println("Código Incorreto!");
                System.out.println("Digite o código referente ao ingrediente de sua receita ou 0 (zero) para sair:\n");
                System.out.println("1- Chocolate meio amargo;");
                System.out.println("2- Leite Condensado;");
                System.out.println("3- Margarina;");
                System.out.println("4- Leite em pó;");
                System.out.println("5- Café solúvel;");
                System.out.println("6- Coco ralado seco;");
                System.out.println("0- Encerrar Pedido.\n\n");
            }
            
            codigo = Buffer.nextInt();
            
            if (codigo==1) {
                
                System.out.println("Digite a quantidade comprada em gramas (g)");
                 pchoco = Buffer.nextDouble();
                
                
                while (pchoco < 400){
                    
                    System.out.println("A quantidade digitada é insuficiente para as receitas. Por gentileza, digite uma quantidade superior a 400g:");
                    pchoco = Buffer.nextDouble();
                    
                }
                
                
                System.out.println("Quanto custa o chocolate?");
                 choco = Buffer.nextDouble();
                
                                               
            }else if (codigo==2) {
                
                System.out.println("Digite a quantidade comprada em gramas (g)");
                 plc = Buffer.nextDouble();
                
                
                while (plc < 390){
                    
                    System.out.println("A quantidade digitada é insuficiente para as receitas. Por gentileza, digite uma quantidade superior a 390g:");
                    plc = Buffer.nextDouble();
                    
                }
                
                
                System.out.println("Quanto custa o leite condensado?");
                 lc = Buffer.nextDouble();
                
            }else if (codigo==3) {
                
                System.out.println("Digite a quantidade comprada em gramas (g)");
                 pmg= Buffer.nextDouble();
                
                
                while (pmg < 40){
                    
                    System.out.println("A quantidade digitada é insuficiente para as receitas. Por gentileza, digite uma quantidade superior a 40g:");
                    pmg = Buffer.nextDouble();
                    
                }
                
                
                System.out.println("Quanto custa o chocolate?");
                 mg = Buffer.nextDouble();
                
            }else if (codigo==4) {
                
                System.out.println("Digite a quantidade comprada em gramas (g)");
                 plp = Buffer.nextDouble();
                
                
                while (plp < 50){
                    
                    System.out.println("A quantidade digitada é insuficiente para as receitas. Por gentileza, digite uma quantidade superior a 50g:");
                    plp = Buffer.nextDouble();
                    
                }
                
                
                System.out.println("Quanto custa o leite em pó?");
                 lp = Buffer.nextDouble();
                
            }else if (codigo==5) {
                
                System.out.println("Digite a quantidade comprada em gramas (g)");
                 pcs = Buffer.nextDouble();
                
                
                while (pcs < 100){
                    
                    System.out.println("A quantidade digitada é insuficiente para as receitas. Por gentileza, digite uma quantidade superior a 100g:");
                    pcs = Buffer.nextDouble();
                    
                }
                
                
                System.out.println("Quanto custa o café solúvel?");
                 cs = Buffer.nextDouble();
                
            }else if (codigo==6) {
                
                System.out.println("Digite a quantidade comprada em gramas (g)");
                 pcr = Buffer.nextDouble();
                
                
                while (pcr < 300){
                    
                    System.out.println("A quantidade digitada é insuficiente para as receitas. Por gentileza, digite uma quantidade superior a 300g:");
                    pcr = Buffer.nextDouble();
                    
                }
                
                
                System.out.println("Quanto custa o coco ralado seco?");
                 cr = Buffer.nextDouble();
                
            }
            
            }while (codigo != 0);
            

    
        pqchoco = (400*choco)/pchoco;
        pqlc = (390*lc)/plc;
        pqmg = (40*mg)/pmg;
        pqlp = (50*lp)/plp;
        pqcs = (100*cs)/pcs;
        pqcr = (300*cr)/pcr;
        
        total = choco + lc + mg + lp + cs + cr;
        
        System.out.println("Com os ingredientes disponíveis, as seguintes receitas poderão ser realizadas:");
            
        if (pqlp!=0) {
            
            totallp = (pqchoco + pqlc + pqmg + pqlp)/50;
            System.out.println("Bombom de Leite Ninho: R$" +totallp+ " cada bombom.");
            
        }
        
        if (pqcs!=0) {
            
            totalcs = (pqchoco + pqlc + pqmg + pqcs)/50;
            System.out.println("Bombom de Café: R$" +totalcs+ " cada bombom.");
            
        }
        
        if (pqcr!=0) {
            
            totalcr = (pqchoco + pqlc + pqmg + pqcr)/50;
            System.out.println("Bombom de Beijinho: R$" +totalcr+ " cada bombom.");
            
        }
        
        if (totallp < totalcs && totallp < totalcr) {
            
            System.out.println("A receita com custo mais baixo é a de Bombom de Leite Ninho.");
        
        }else if (totalcs < totalcr) {
            
            System.out.println("A receita com custo mais baixo é a de Bombom de Café.");
            
        }else{
            
            System.out.println("A receita com custo mais baixo é a de Bombom de Beijinho.");
            
        }
        
        if (total > 30) {
           
            System.out.println("Porém o valor dos ingredientes ultrapassou o limite de gastos em R$" +(total-30)+ ".");
                    
        }       
        
}

}
}
}




    

