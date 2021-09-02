package com.company;

public class Jogador {
    private String nome;
    private float salario;
    private String condicaoJogador;
    private Clube clube;

    public Jogador(String nome, float salario, String condicaoJogador, Clube clube) {
        this.nome = nome;
        this.salario = salario;
        this.condicaoJogador = condicaoJogador;
        this.clube = clube;
    }
    public Jogador() {
        this.nome = nome;
        this.salario = salario;
        this.condicaoJogador = condicaoJogador;
        this.clube = clube;
    }

    public String infoJogador(){
        return "\n"+this.getNome()+
                "\n"+this.getSalario()+
                "\n" + this.getCondicaoJogador() +
                "\n" + this.getClube();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCondicaoJogador() {
        return condicaoJogador;
    }

    public void setCondicaoJogador(String condicaoJogador) {
        this.condicaoJogador = condicaoJogador;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}
