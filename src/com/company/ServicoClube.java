package com.company;

import java.util.ArrayList;

public class ServicoClube {
    private ArrayList<Clube> dadosClube =new ArrayList<>();

    public void gravarClube(String nome, String cidade){
        dadosClube.add(new Clube(nome,cidade));
    }
}
