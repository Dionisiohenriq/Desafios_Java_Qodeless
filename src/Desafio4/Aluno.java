package Desafio4;

//1-Representar o Aluno com classe Aluno(Nome,Idade,Nota)


public class Aluno {
    public String Nome;
    public int Idade;
    public double nota;

    public String getNome() {
        return Nome;
    }

    public Aluno(){}

    public Aluno(String nome, int idade, double nota) {
        Nome = nome;
        Idade = idade;
        this.nota = nota;
    }

    public void setNome(String nome) {
        if(!nome.isBlank() && !nome.isEmpty())
            Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        if(idade != 0)
            Idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota != 0)
            this.nota = nota;
    }
}
