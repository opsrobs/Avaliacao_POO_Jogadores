package com.company;

import java.util.ArrayList;

public class Clube {
    private String nomeClube;
    private String cidadeClube;
    ArrayList<Jogador> dadosJogador=new ArrayList<>();

    public Clube(String nomeClube, String cidadeClube) {
        this.nomeClube = nomeClube;
        this.cidadeClube = cidadeClube;
    }
    public Clube() {
        this.nomeClube = nomeClube;
        this.cidadeClube = cidadeClube;
    }

    public void gravarDadosJogador (String nome, float salario, String situacao, Clube clube){
        dadosJogador.add(new Jogador(nome,salario,situacao ,clube ));
    }

    public ArrayList<Jogador> getDadosJogador() {
        return dadosJogador;
    }

    public void setDadosJogador(ArrayList<Jogador> dadosJogador) {
        this.dadosJogador = dadosJogador;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getCidadeClube() {
        return cidadeClube;
    }

    public void setCidadeClube(String cidadeClube) {
        this.cidadeClube = cidadeClube;
    }

    @Override
    public String toString(){
        return  " O nome do clube é: "+ this.getNomeClube()+
                "\n\t A cidade do clube é: "+ this.getCidadeClube();
    }
}
