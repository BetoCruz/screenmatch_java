package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    //-----construtor definido para receber valores e ser inicializado
    // no ato da criação, sendo herança da super classe.
    public Filme(String nome, int anoDeLançamento) {
        super(nome, anoDeLançamento);
        //this.setNome(nome);
    }

    //_____Getters & Setters_____
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //_____Acoplamento da Interface Classificação , conceituando polimorfismo
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
