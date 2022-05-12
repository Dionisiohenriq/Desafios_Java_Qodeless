
import java.text.MessageFormat;
import java.util.*;

//REQUERIMENTOS
//R01 - IMPRIMIR MENSAGEM PERGUNTANDO A QUANTIDADE DE ALUNOS;
//R02 - LER E ARMAZENAR A INFORMAÇÃO;
//R03 - IMPRIMIR MENSAGEM PERGUNTANDO NOME E NOTA DO ALUNO ( DE ACORDO COM A QUANTIDADE DO R01);]
//R04 - IMPRIMIR O ALUNO COM A MAIOR NOTA;

/**
 * @author USUARIO
 *
 */
public class Desafio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //R01 - IMPRIMIR MENSAGEM PERGUNTANDO A QUANTIDADE DE ALUNOS;
        System.out.println("Qual a quantidade de alunos? ");

        //R02 - LER E ARMAZENAR A INFORMAÇÃO;
        int qtd = input.nextInt();

        //R03 - IMPRIMIR MENSAGEM PERGUNTANDO NOME E NOTA DO ALUNO ( DE ACORDO COM A QUANTIDADE DO R01);]
        Hashtable<String, Double> aluno = new Hashtable<>();
        String nome;
        double nota;

        for(int i = 1; i <= qtd; i++) {
            System.out.println("Qual o nome do " + i + "º aluno?" );
            nome = input.next();

            System.out.println("Qual a nota do " + i + "º aluno?" );
            nota = input.nextDouble();

            aluno.put(nome, nota);
        }
        //R04 - IMPRIMIR O ALUNO COM A MAIOR NOTA;
        String nomeAlunoMaiorNota = Collections.max(aluno.entrySet(), Comparator.comparingDouble(Map.Entry::getValue)).getKey();
        System.out.println(
                MessageFormat.format(
                        "Aluno com a maior nota é {0}, com a nota: {1}",
                        nomeAlunoMaiorNota, aluno.get(nomeAlunoMaiorNota)));

    }
}
