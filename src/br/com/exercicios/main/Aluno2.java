package br.com.exercicios.main;

public class Aluno2 {
    private String nome;
    private double somaDasNotas;
    private int totalDeNotas;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


    public void mediaNota(double nota) {
        somaDasNotas += nota;
        totalDeNotas++;
    }

    public double pegaMedia() {
        if (totalDeNotas == 0) {
            return 0;
        }
        return somaDasNotas / totalDeNotas;
    }

}
