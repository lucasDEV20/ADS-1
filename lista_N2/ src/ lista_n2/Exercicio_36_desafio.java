/ *
 36. Foi feita uma pesquisa para saber o perfil dos alunos que cursam o ensino médio de uma
determinada escola. Cada aluno fornece um ano (primeiro - 1, segundo - 2, terceiro -
3), quantos livros são vendidos por mês e se você gosta de fazer redação (Sim-1 ou Não-0). Fazer
 um programa que leia os dados, calcule e escreva:
  Quantidade de alunos que não está no terceiro ano;
  A maior quantidade de livros lidos por um aluno que está na segunda série;
  A média de livros lidos pelos alunos (considerando todas as séries);
  Uma porcentagem de alunos que não gostam de fazer redação e que estão no primeiro ano.
 * /
pacote  lista_N2 ;

importar  java.util.Scanner ;

/ **
 *
* @author aluno
 * /
 classe  pública Exercicio_36_desafio {

    public  static  void  main ( String [] args ) {
        // Scanner
        Scanner entrada =  novo  Scanner ( System . In);
        // perfil do aluno
        String nome;
        int idade;
        // série do aluno
        Série de cordas , aluno2, primeiro, segundo, terceiro;
        // livros
        int livro, livro2 =  0 , cont_livro2 =  0 , cont_livro =  0 , aluno_que_leu_mais =  0 ;
        // contador terceiro ano
        int cont_primeiro =  0 , cont_segundo =  0 , cont_terceiro =  0 ;
        // media livros das turmas
        medialivro duplo , soma;
        // saida do loop
        Opcao de corda ;
          
        faça {
            // criar perfil do aluno
            Sistema . fora . println ();
            Sistema . fora . print ( " Digite o nome do aluno? \ n " );
            nome = entrada . nextLine ();
            Sistema . fora . println ();
            Sistema . fora . printf ( " Digite a idade do aluno% s: " , nome);
            idade = entrada . nextInt ();
            Sistema . fora . println ();
            // entrada de escolha da série
            Sistema . fora . printf ( " Digite uma série do aluno% s: "
                    +  " (primeiro - 1, segundo - 2, terceiro - 3) \ n " , nome);
            série = entrada . nextLine ();

            if (série . equalsIgnoreCase ( " 1 " )) {
                cont_primeiro ++ ;
            }
            if (série . equalsIgnoreCase ( " 2 " )) {
                cont_segundo ++ ;
            }
            if (série . equalsIgnoreCase ( " 3 " )) {
                cont_terceiro ++ ; // número de alunos no terceiro
            }
            entrada . nextLine ();
            Sistema . fora . printf ( " O aluno e o segundo (Sim-1 ou Nao-2) \ n " );
            aluno2 = entrada . nextLine ();
            
        
            
            if (aluno2 . equalsIgnoreCase ( " sim " )) {
                Sistema . fora . printf ( " Quantos livros o aluno do segundo% s ler por mes \ n " , nome);
                livro2 = entrada . nextInt ();
                
                cont_livro2 ++ ;
            } else  if (aluno_que_leu_mais > = livro2) {
                aluno_que_leu_mais = livro2;

            } if (aluno2 . equalsIgnoreCase ( " nao " )) {

                Sistema . fora . printf ( " Quantos livros o aluno% s le por mes? \ n " , nome);
                livro = entrada . nextInt ();
                cont_livro ++ ;
            }
         soma = cont_livro + cont_livro2;
            // saida do loop
            Sistema . fora . println ( " Deseja sair do programa? "
                    +  " (sim - nao) " );
            opcao = entrada . nextLine ();
        entrada . nextLine ();
        } while (opcao . equalsIgnoreCase ( " sim " ));
        
        medialivro = soma / 3 ;
        Sistema . fora . println ();
        Sistema . fora . printf ( " A quantidade de alunos que está no terceiro ano% d; \ n " , cont_terceiro);
        Sistema . fora . printf ( " A maior quantidade de livros lidos por um aluno que está na segunda série% d; \ n " , aluno_que_leu_mais);
        Sistema . fora . printf ( " A média de livros lidos pelos alunos (considerando todas as séries):% .2f \ n  " , medialivro);
    }

}
