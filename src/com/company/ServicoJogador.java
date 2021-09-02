package com.company;

import java.util.ArrayList;

public class ServicoJogador {
    ArrayList<Jogador> dadosJogador=new ArrayList<>();

    public void armazenarDadosJogador (String nome, float salario, String situacao,Clube clube){
        dadosJogador.add(new Jogador(nome, salario,situacao,clube));
    }
}
