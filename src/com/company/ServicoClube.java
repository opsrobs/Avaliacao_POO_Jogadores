package com.company;

import javax.swing.*;
import java.util.ArrayList;
import static com.company.Jogador.*;

public class ServicoClube {
    Clube clube= new Clube();
    ArrayList<Clube> dadosClube =new ArrayList<>();

    public void gravarClube(String nome, String cidade){
        dadosClube.add(new Clube(nome,cidade));
    }
    public String capNomeClube(){
        return JOptionPane.showInputDialog("Informe o nome do Clube: ");
    }



    public String capNomeCidade(){
        return JOptionPane.showInputDialog("Informe qual a cidade do clube: ");
    }

    public String retornarClubes(){
        String s=" ";
        for (int i = 0; i < dadosClube.size(); i++) {

            s="O clube é: \n\t"+ dadosClube.get(i).toString()+"\n"+ clube.getDadosJogador() ;
        }
        return s;
    }

    public String capNovoClube(){
        int opUsuario;
        String retornarCadastro;
        do {
            opUsuario= Integer.parseInt(JOptionPane.showInputDialog("Informe a situação do jogador: \n\t[0]NOVO CADASTRO \n\t[1]SAIR"));
            if (opUsuario==0)
                retornarCadastro=JOptionPane.showInputDialog("Informe qual a cidade do clube: ");
            else
                retornarCadastro="sair";
        }while (opUsuario>1);

        return retornarCadastro;

    }

}
