package com.company;
import javax.swing.*;

import static com.company.Clube.*;
import static com.company.ServicoClube.*;

public class Main {

    public static void main(String[] args) {
        Clube clube;
        ServicoClube sC =new ServicoClube();
        ServicoJogador sJ= new ServicoJogador();
        String nomeJogador;
        String situacao;
        String nome;
        String cidade;
        float salario=0;

        nome=sC.capNomeClube();
        while (!nome.equalsIgnoreCase("sair")){
            cidade=sC.capNomeCidade();
            clube= new Clube(nome,cidade);
            sC.gravarClube(nome,cidade);
            nomeJogador = sJ.capNomeJogador();
            while (!nomeJogador.equalsIgnoreCase("sair")) {
                salario = sJ.capSalarioJogador(nomeJogador);
                situacao = sJ.capSituacaoJogador();
                clube.gravarDadosJogador(nomeJogador, salario, situacao, clube);
                nomeJogador = sJ.capNomeJogador();
            }
            nome=sC.capNovoClube();
        }
        System.out.println(sC.retornarClubes());

    }
}
