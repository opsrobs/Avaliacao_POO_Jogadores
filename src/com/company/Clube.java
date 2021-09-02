package com.company;

public class Clube {
    private String nomeClube;
    private String cidadeClube;

    public Clube(String nomeClube, String cidadeClube) {
        this.nomeClube = nomeClube;
        this.cidadeClube = cidadeClube;
    }
    public Clube(){
        this.nomeClube= nomeClube;
        this.cidadeClube = cidadeClube;
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
}
