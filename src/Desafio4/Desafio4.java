package Desafio4;
//Desenvolver um sistema que soma a nota de 3 Alunos
/* Requerimentos:
*1-Representar o Aluno com classe Aluno(Nome,Idade,Nota)
*2-Utilizar lista de Alunos com array padrão Aluno[] alunos = new Aluno[];
*3-Utilizar lista de Alunos com objetivo List<Alunos> alunos = new ArrayList<Aluno>();
*/

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args){

        Aluno[] alunosArray = new Aluno[3];
        List<Aluno> alunosArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < alunosArray.length; i++){

            alunosArray[i] = new Aluno();

            System.out.println(MessageFormat.format("Qual o nome do {0}º aluno?", i+1));
            alunosArray[i].setNome(input.next());

            System.out.println(MessageFormat.format("Qual a idade do {0}º aluno?", i+1));
            alunosArray[i].setIdade(input.nextInt());

            System.out.println(MessageFormat.format("Qual a nota do {0}º aluno?", i+1));
            alunosArray[i].setNota(input.nextDouble());
        }


    }
}
